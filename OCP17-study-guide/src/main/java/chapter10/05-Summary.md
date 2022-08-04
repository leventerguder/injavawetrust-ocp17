# Summary

An Optional<T> can be empty or store a value. You can check whether it contains a value with isPresent() and get() the
value inside.

You can return a different value with orElse(T t) or throw an exception with orElseThrow().

There are even three methods that take functional interfaces as parameters: ifPresent(Consumer c), orElseGet(Supplier s)
, and orElseThrow(Supplier s).

There are three optional types for primitives: OptionalDouble, OptionalInt, and OptionalLong.
These have the methods getAsDouble(), getAsInt(), and getAsLong(), respectively.

A stream pipeline has three parts. The source is required, and it creates the data in the stream. There can be zero or
more intermediate operations, which aren’t executed until the terminal operation runs.

The first stream class we covered was Stream<T>, which takes a generic argument T. The Stream<T> class includes many
useful intermediate operations including filter(), map(), flatMap(), and sorted(). Examples of terminal operations
include allMatch(), count(), and forEach().

Besides the Stream<T> class, there are three primitive streams: DoubleStream, IntStream, and LongStream. In addition to
the usual Stream<T> methods, IntStream and LongStream have range() and rangeClosed().

The primitive streams have math operations including average(), max(), and sum(). They also have summaryStatistics() to
get many statistics in one call.

You can use a Collector to transform a stream into a traditional collection. You can even group fields to create a
complex map in one line. Partitioning works the same way as grouping, except that the keys are always true and false.

A partitioned map always has two keys, even if the value is empty for the key. A teeing collector allows you to combine
the results of two other collectors.

Finally, remember that streams are lazily evaluated. They take lambdas or method references as parameters, which execute
later when the method is run.