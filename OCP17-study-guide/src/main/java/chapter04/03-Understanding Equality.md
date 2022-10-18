# Understanding Equality

## Comparing equals() and ==

Consider the following code that uses == with objects:

    var one = new StringBuilder();
    var two = new StringBuilder();
    var three = one.append("a"); 
    System.out.println(one == two); // false 
    System.out.println(one == three); // true

The one and two variables are both completely separate StringBuilder objects, giving us two objects.
The one and three both point to same object.

    var x = "Hello World";
    var z = " Hello World".trim(); 
    System.out.println(x.equals(z)); // true

This works because the authors of the String class implemented a standard method called equals() to check the values
inside the String rather than the string reference itself.

In case you are wondering, the authors of StringBuilder did not implement equals(). If you call equals() on two
StringBuilder instances, it will check reference equality. You can call toString() on StringBuilder to get a String to
check for equality instead.

    var name = "a";
    var builder = new StringBuilder("a");
    System.out.println(name == builder); // DOES NOT COMPILE

Remember that == is checking for object reference equality. The compiler is smart enough to know that two references
can’t possibly point to the same object when they are completely different types.

### The String Pool

Since strings are everywhere in Java, they use up a lot of memory. In some production applications, they can use a
large amount of memory in the entire program. Java realizes that many strings repeat in the program and solves this
issue by reusing common ones. The string pool, also known as the intern pool, is a location in the Java Virtual
Machine (JVM) that collects all these strings.

    var x = "Hello World";
    var y = "Hello World"; 
    System.out.println(x == y); // true

Remember that a String is immutable and literals are pooled. The JVM created only one literal in memory. The x and y
variables both point to the same location in memory; therefore, the statement outputs true

    var x = "Hello World";
    var z = " Hello World".trim(); 
    System.out.println(x == z); // false

In this example, we don’t have two of the same String literal. Although x and z happen to evaluate to the same string,
one is computed at runtime. Since it isn’t the same at compile-time, a new String object is created.

    var singleString = "hello world";
    var concat = "hello ";
    concat += "world";
    System.out.println(singleString == concat); // false

This prints false. Calling += is just like calling a method and results in a new String.

You can even force the issue by creating a new String:

    var x = "Hello World";
    var y = new String("Hello World"); 
    System.out.println(x == y); // false

You can also do the opposite and tell Java to use the string pool. The intern() method will use an object in the string
pool if one is present.

    public String intern()

    var name = "Hello World";
    var name2 = new String("Hello World").intern(); 
    System.out.println(name == name2); // true

First we tell Java to use the string pool normally for name. Then, for name2, we tell Java to create a new object using
the constructor but to intern it and use the string pool anyway. Since both variables point to the same reference in the
string pool, we can use the == operator.

    var first = "rat" + 1;
    var second = "r" + "a" + "t" + "1";
    var third = "r" + "a" + "t" + new String("1");
    System.out.println(first == second); // true
    System.out.println(first == second.intern()); // true
    System.out.println(first == third); // false
    System.out.println(first == third.intern()); //true