# Exam Essentials

**Write code that uses Optional.**

Creating an Optional uses Optional.empty() or Optional.of(). Retrieval frequently uses isPresent() and get().
Alternatively, there are the functional ifPresent() and orElseGet() methods.

**Recognize which operations cause a stream pipeline to execute.**

Intermediate operations do not run until the terminal operation is encountered. If no terminal operation is in the
pipeline, a Stream is returned but not executed. Examples of terminal operations include collect(), forEach(), min(),
and reduce().

**Determine which terminal operations are reductions.**

Reductions use all elements of the stream in determining the result. The reductions that you need to know are collect(),
count(), max(), min(), and reduce(). A mutable reduction collects into the same object as it goes. The collect() method
is a mutable reduction.

**Write code for common intermediate operations.**

The filter() method returns a Stream<T> filtering on a Predicate<T>. The map() method returns a Stream, transform- ing
each element of type T to another type R through a Function <T,R>. The flatMap() method flattens nested streams into a
single level and removes empty streams.

**Compare primitive streams to Stream<T>.**

Primitive streams are useful for performing common operations on numeric types, including statistics like average(),
sum(), and so on. There are three primitive stream classes: DoubleStream, IntStream, and LongStream. There are also
three primitive Optional classes: OptionalDouble, OptionalInt, and OptionalLong. Aside from BooleanSupplier, they all
involve the double, int, or long primitives.

**Convert primitive stream types to other primitive stream types.**

Normally, when mapping, you just call the map() method. When changing the class used for the stream, a different
method is needed. To convert to Stream, you use mapToObj(). To convert to DoubleStream, you use mapToDouble(). To
convert to IntStream, you use mapToInt(). To convert to LongStream, you use mapToLong().

**Use peek() to inspect the stream.**

The peek() method is an intermediate operation often used for debugging purposes. It executes a lambda or method
reference on the input and passes that same input through the pipeline to the next operator. It is useful for printing
out what passes through a certain point in a stream.

**Search a stream.**

The findFirst() and findAny() methods return a single element from a stream in an Optional. The anyMatch(), allMatch(),
and noneMatch() methods return a boolean. Be careful, because these three can hang if called on an infinite stream with
some data. All of these methods are terminal operations.

**Sort a stream.**

The sorted() method is an intermediate operation that sorts a stream. There are two versions: the signature with zero
parameters that sorts using the natural sort order, and the signature with one parameter that sorts using that
Comparator as the sort order.

**Compare groupingBy() and partitioningBy().**

The groupingBy() method is a terminal operation that creates a Map. The keys and return types are determined by the
parameters you pass. The values in the Map are a Collection for all the entries that map to that key. The
partitioningBy() method also returns a Map. This time, the keys are true and false. The values are again a Collection of
matches. If there are no matches for that boolean, the Collection is empty.
