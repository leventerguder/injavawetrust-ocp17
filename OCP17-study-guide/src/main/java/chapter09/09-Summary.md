# Summary

The Java Collections Framework includes four main types of data structures: lists, sets, queues, and maps.
The Collection interface is the parent interface of List, Set, and Queue. Additionally, Deque extends Queue.
The Map interface does not extend Collection.

- List: An ordered collection of elements that allows duplicate entries
    - ArrayList: Standard resizable list
    - LinkedList: Can easily add/remove from beginning or end
- Set: Does not allow duplicates
    - HashSet: Uses hashCode() to find unordered elements
    - TreeSet: Sorted. DOes not allow null values.
- Queue/Deque: Orders elements for processing
    - ArrayDeque: Double-ended queue
    - LinkedList: Double-ended queue and list
- Map: Maps unique keys to values
    - HashMap: Uses hashCode() to find keys.
    - TreeMap: Sorted map.Does not allow null keys.

The Comparable interface declares the compareTo() method. This method returns a negative number if the object is smaller
than its argument, 0 if the two objects are equal, and a positive number otherwise. The compareTo() method is declared
on the object that is being compared, and it takes one parameter. The Comparator interface defines the compare() method.
A negative number is returned if the first argument is smaller, zero if they are equal, and a positive number otherwise.
The compare() method can be declared in any code, and it takes two parameters. A Comparator is often implemented using a
lambda.

Generics are type parameters for code. To create a class with a generic parameter, add <T> after the class name. You can
use any name you want for the type parameter. Single uppercase letters are common choices. Generics allow you to specify
wildcards. <?> is an unbounded wildcard that means any type. <? extends Object> is an upper bound that means any type
that is Object or extends it. <? extends MyInterface> means any type that implements MyInterface. <? super Number> is a
lower bound that means any type that is Number or a superclass. A compiler error results from code that attempts to add
an item in a list with an unbounded or upper-bounded wildcard.