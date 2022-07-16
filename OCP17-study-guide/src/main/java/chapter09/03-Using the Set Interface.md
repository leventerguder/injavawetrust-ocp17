# Using the Set Interface

You use a Set when you don’t want to allow duplicate entries. For example, you might want to keep track of the unique
animals that you want to see at the zoo. You aren’t concerned with the order in which you see these animals, but there
isn’t time to see them more than once. You just want to make sure you see the ones that are important to you and remove
them from the set of outstanding animals to see after you see them.

## Comparing Set Implementations

A HashSet stores its elements in a hash table, which means the keys are a hash and the values are an Object. This means
that the HashSet uses the hashCode() method of the objects to retrieve them more efficiently. Remember that a valid
hashCode() doesn’t mean every object will get a unique value, but the method is often written so that hash values are
spread out over a large range to reduce collisions.

The main benefit is that adding elements and checking whether an element is in the set both have constant time. The
trade-off is that you lose the order in which you inserted the elements. Most of the time, you aren’t concerned with
this in a Set anyway, making HashSet the most common set.

A TreeSet stores its elements in a sorted tree structure. The main benefit is that the set is always in sorted order.
The trade-off is that adding and checking whether an element exists takes longer than with a HashSet, especially as the
tree grows larger.

## Working with Set Methods

Like a List, you can create an immutable Set in one line or make a copy of an existing one.

    Set<Character> letters = Set.of('z', 'o', 'o'); 
    Set<Character> copy = Set.copyOf(letters);

Those are the only extra methods you need to know for the Set interface for the exam! You do have to know how sets
behave with respect to the traditional Collection methods. You also have to know the differences between the types of
sets.

    Set<Integer> set = new HashSet<>();
    boolean b1 = set.add(66);               //true
    boolean b2 = set.add(10);               //true
    boolean b3 = set.add(66);               //false
    boolean b4 = set.add(8);                //true    
    set.forEach(System.out::println);

Remember that the equals() method is used to determine equality. The hashCode() method is used to know which bucket to
look in so that Java doesn’t have to look through the whole set to find out whether an object is there. The best case is
that hash codes are unique and Java has to call equals() on only one object. The worst case is that all implementations
return the same hashCode() and Java has to call equals() on every element of the set anyway.

    Set<Integer> set = new TreeSet<>(); 
    boolean b1 = set.add(66);               // true 
    boolean b2 = set.add(10);               // true 
    boolean b3 = set.add(66);               // false 
    boolean b4 = set.add(8);                // true 
    set.forEach(System.out::println);    