# Working with Parallel Streams

Up until now, all of the streams you have worked with have been serial streams. A serial stream is a stream in which the
results are ordered, with only one entry being processed at a time.

A parallel stream is capable of processing results concurrently, using multiple threads. For example, you can use a
parallel stream and the map() operation to operate concurrently on the elements in the stream, vastly improving
performance over processing a single element at a time.

Using a parallel stream can change not only the performance of your application but also the expected results. As you
shall see, some operations also require special handling to be able to be processed in a parallel manner.

## Creating Parallel Streams

The Stream API was designed to make creating parallel streams quite easy. For the exam, you should be familiar with two
ways of creating a parallel stream.

    Collection<Integer> collection = List.of(1,2);
    Stream<Integer> p1 = collection.stream().parallel();
    Stream<Integer> p2 = collection.parallelStream();

The Stream interface includes a method isParallel() that can be used to test whether the instance of a stream supports
parallel processing. Some operations on streams preserve the parallel attribute, while others do not.

## Performing a Parallel Decomposition

A parallel decomposition is the process of taking a task, breaking it into smaller pieces that can be performed
concurrently, and then reassembling the results. The more concurrent a decomposition, the greater the performance
improvement of using parallel streams.

Let’s try it out. First, let’s define a reusable function that “does work” just by waiting for five seconds.

    private static int doWork(int input) { 
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        return input; 
    }

We can pretend that in a real application, this work might involve calling a database or reading a file. Now let’s use
this method with a serial stream.

    long start = System.currentTimeMillis(); 
    List.of(1,2,3,4,5)
        .stream()
        .map(w -> doWork(w))
        .forEach(s -> System.out.print(s + " "));

    System.out.println();
    var timeTaken = (System.currentTimeMillis()-start)/1000; 
    System.out.println("Time: "+timeTaken+" seconds");

What do you think this code will output when executed as part of a main() method? Let’s take a look:

    1 2 3 4 5
    Time: 25 seconds

As you might expect, the results are ordered and predictable because we are using a serial stream. It also took around
25 seconds to process all five results, one at a time. What happens if we replace line 12 with one that uses a
parallelStream()? The following is some sample output:

    3 2 1 5 4
    Time: 5 seconds

As you can see, the results are no longer ordered or predictable. The map() and forEach() operations on a parallel
stream are equivalent to submitting multiple Runnable lambda expressions to a pooled thread executor and then waiting
for the results.

**Ordering Results**

If your stream operation needs to guarantee ordering and you’re not sure if it is serial or parallel, you can replace
line with one that uses forEachOrdered():

    .forEachOrdered(s -> System.out.print(s + " "));

This outputs the results in the order in which they are defined in the stream:

    1 2 3 4 5
    Time: 5 seconds

While we’ve lost some of the performance gains of using a parallel stream, our map() operation can still take advantage
of the parallel stream.

## Processing Parallel Reductions

A parallel reduction is a reduction operation applied to a parallel stream. The results for parallel reductions can
differ from what you expect when working with serial streams.

### Performing Order-Based Tasks

Since order is not guaranteed with parallel streams, methods such as findAny() on parallel streams may result in
unexpected behavior. Consider the following example:

    System.out.print(List.of(1,2,3,4,5,6)
    .parallelStream() 
    .findAny() 
    .get());

The JVM allocates a number of threads and returns the value of the first one to return a result, which could be 4, 2,
and so on. While neither the serial nor the parallel stream is guaranteed to return the first value, the serial stream
often does. With a parallel stream, the results are likely to be more random.

What about operations that consider order, such as findFirst(), limit(), and skip()? Order is still preserved, but
performance may suffer on a parallel stream as a result of a parallel processing task being forced to coordinate all of
its threads in a synchronized-like fashion.

On the plus side, the results of ordered operations on a parallel stream will be consistent with a serial stream. For
example, calling skip(5).limit(2).findFirst() will return the same result on ordered serial and parallel streams.

**Creating Unordered Streams**

All of the streams you have been working with are considered ordered by default. It is possible to create an unordered
stream from an ordered stream, similar to how you create a parallel stream from a serial stream.

    List.of(1,2,3,4,5,6).stream().unordered();

This method does not reorder the elements; it just tells the JVM that if an order-based stream operation is applied, the
order can be ignored. For example, calling skip(5) on an unordered stream will skip any 5 elements, not necessarily the
first 5 required on an ordered stream.

For serial streams, using an unordered version has no effect. But on parallel streams, the results can greatly improve
performance.

    List.of(1,2,3,4,5,6).stream().unordered().parallel();

Even though unordered streams will not be on the exam, if you are developing applications with parallel streams, you
should know when to apply an unordered stream to improve performance.

## Combining Results with reduce()

Recall that the first parameter to the reduce() method is called the identity, the second parameter is called the
accumulator, and the third parameter is called the combiner. The following is the signature for the method:

    <U> U reduce(U identity, 
        BiFunction<U,? super T,U> accumulator, 
        BinaryOperator<U> combiner)

We can concatenate a list of char values using the reduce() method, as shown in the following example:

    System.out.println(List.of('w', 'o', 'l', 'f') 
    .parallelStream()
    .reduce("",
        (s1,c) -> s1 + c,
        (s2,s3) -> s2 + s3)); // wolf

With parallel streams, we now have to be concerned about order. What if the elements of a string are combined in the
wrong order to produce wlfo or flwo? The Stream API prevents this problem while still allowing streams to be processed
in parallel, as long as you follow one simple rule: make sure that the accumulator and combiner produce the same result
regardless of the order they are called in.

While this is not in scope for the exam, the accumulator and combiner must be associative, non-interfering, and
stateless. Don’t panic; you don’t need to know advanced math terms for the exam!

Let’s take a look at an example using a problematic accumulator. In particular, order mat- ters when subtracting
numbers; therefore, the following code can output different values depending on whether you use a serial or parallel
stream. We can omit a combiner parameter in these examples, as the accumulator can be used when the intermediate data
types are the same.

    System.out.println(List.of(1,2,3,4,5,6)
    .parallelStream()
    .reduce(0, (a, b) -> (a - b))); // PROBLEMATIC ACCUMULATOR

It may output -21, 3, or some other value.

You can see other problems if we use an identity parameter that is not truly an identity value. For example, what do you
expect the following code to output?

    System.out.println(List.of("w","o","l","f") 
    .parallelStream()
    .reduce("X", String::concat)); // XwXoXlXf

On a serial stream, it prints Xwolf, but on a parallel stream, the result is XwXoXlXf. As part of the parallel process,
the identity is applied to multiple elements in the stream, result- ing in very unexpected data.

**Selecting a reduce() Method**

Although the one- and two-argument versions of reduce() support parallel processing, it is recommended that you use the
three-argument version of reduce() when working with parallel streams. Providing an explicit combiner method allows the
JVM to partition the operations in the stream more efficiently.

### Combining Results with collect()

Like reduce(), the Stream API includes a three-argument version of collect() that takes accumulator and combiner
operators along with a supplier operator instead of an identity.

    <R> R collect(Supplier<R> supplier, 
    BiConsumer<R, ? super T> accumulator, 
    BiConsumer<R, R> combiner)

Also, like reduce(), the accumulator and combiner operations must be able to process results in any order. In this
manner, the three-argument version of collect() can be per- formed as a parallel reduction, as shown in the following
example:

    Stream<String> stream = Stream.of("w", "o", "l", "f").parallel(); 
    SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new,
        Set::add,
        Set::addAll);
    System.out.println(set); // [f, l, o, w]

Recall that elements in a ConcurrentSkipListSet are sorted according to their natural ordering. You should use a
concurrent collection to combine the results, ensuring that the results of concurrent threads do not cause a
ConcurrentModificationException.

Performing parallel reductions with a collector requires additional considerations. For example, if the collection into
which you are inserting is an ordered data set, such as a List, the elements in the resulting collection must be in the
same order, regardless of whether you use a serial or parallel stream. This may reduce performance, though, as some
operations cannot be completed in parallel.

## Performing a Parallel Reduction on a Collector

Every Collector instance defines a characteristics() method that returns a set of Collector.Characteristics attributes.
When using a Collector to perform a parallel reduction, a number of properties must hold true. Otherwise, the collect()
operation will execute in a single-threaded fashion.

**Requirements for Parallel Reduction with collect()**

- The stream is parallel.
- The parameter of the collect() operation has the Characteristics.CONCURRENT characteristic.
- Either the stream is unordered or the collector has the characteristic Characteristics.UNORDERED.

For example, while Collectors.toSet() does have the UNORDERED characteristic, it does not have the CONCURRENT
characteristic. Therefore, the following is not a parallel reduction even with a parallel stream:

    parallelStream.collect(Collectors.toSet()); // Not a parallel reduction

The Collectors class includes two sets of static methods for retrieving collectors, toConcurrentMap() and
groupingByConcurrent(), both of which are UNORDERED and CONCURRENT. These methods produce Collector instances capable of
performing parallel reductions efficiently. Like their nonconcurrent counterparts, there are overloaded versions that
take additional arguments.

    Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
    ConcurrentMap<Integer, String> map = ohMy
            .collect(Collectors.toConcurrentMap(String::length, k -> k,
                    (s1, s2) -> s1 + "," + s2));
    System.out.println(map); // {5=lions,bears, 6=tigers}
    System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap

We use a ConcurrentMap reference, although the actual class returned is likely ConcurrentHashMap. The particular class
is not guaranteed; it will just be a class that implements the interface ConcurrentMap.

Finally, we can rewrite our groupingBy() example from Chapter 10 to use a parallel stream and parallel reduction.

    var ohMy = Stream.of("lions", "tigers", "bears").parallel();
    ConcurrentMap<Integer, List<String>> map = ohMy.collect(
            Collectors.groupingByConcurrent(String::length));
    System.out.println(map); // {5=[lions, bears], 6=[tigers]}

**Avoiding Stateful Streams**

Side effects can appear in parallel streams if your lambda expressions are stateful. A stateful lambda expression is
one whose result depends on any state that might change during the execution of a pipeline. For example, the following
method that filters out even numbers is stateful:

    public List<Integer> addValues(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter(s -> s % 2 == 0)
                .forEach(i -> {
                    data.add(i);
                }); // STATEFUL: DON'T DO THIS!
        return data;
    }

Let’s say this method is executed with a serial stream:

    var list = addValues(IntStream.range(1, 11)); 
    System.out.print(list); // [2, 4, 6, 8, 10]

Great, the results are in the same order that they were entered. But what if someone else passes in a parallel stream?

    var list = addValues(IntStream.range(1, 11).parallel()); 
    System.out.print(list); // [6, 8, 10, 2, 4]

Oh, no: our results no longer match our input order!The problem is that our lambda expression is stateful and modifies a
list that is outside our stream. We can fix this solution by rewriting our stream operation to be stateless:

    public List<Integer> addValuesBetter(IntStream source) { 
        return source.filter(s -> s % 2 == 0)
        .boxed()
        .collect(Collectors.toList()); 
    }

This method processes the stream and then collects all the results into a new list. It produces the same ordered
result on both serial and parallel streams. It is strongly recommended that you avoid stateful operations when using
parallel streams, to remove any potential data side effects. In fact, they should be avoided in serial streams since
doing so limits the code’s ability to someday take advantage of parallelization.