# Exam Essentials

**Pick the correct type collection from a description.**

A List allows duplicates and orders the elements. A Set does not allow duplicates. A Deque orders its elements to
facilitate retrievals from the front or back. A Map maps keys to values. Be familiar with the differences in
implementations of these interfaces.

**Work with convenience methods.**

The Collections Framework contains many methods such as contains(), forEach(), and removeIf() that you need to know for
the exam. There are too many to list in this paragraph for review, so please do review the tables in this chapter.

**Differentiate between Comparable and Comparator.**

Classes that implement Comparable are said to have a natural ordering and implement the compareTo() method. A class is
allowed to have only one natural ordering. A Comparator takes two objects in the compare() method. Different ones can
have different sort orders. A Comparator is often implemented using a lambda such as (a, b) -> a.num - b.num.

**Identify valid and invalid uses of generics and wildcards.**

< T > represents a type parameter. Any name can be used, but a single uppercase letter is the convention. 
<?> is an unbounded wildcard.<? extends X> is an upper-bounded wildcard. <? super X> is a lower-bounded wildcard.