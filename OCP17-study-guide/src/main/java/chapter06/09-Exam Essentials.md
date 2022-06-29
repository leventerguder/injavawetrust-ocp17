# Exam Essentials

**Be able to write code that extends other classes.**

A Java class that extends another class inherits all of its public and protected methods and variables. If the class is
in the same package, it also inherits all package members of the class. Classes that are marked final cannot be
extended. Finally, all classes in Java extend java.lang.Object either directly or from a superclass.

**Be able to distinguish and use this, this(), super, and super()**

To access a current or inherited member of a class, the this reference can be used. To access an inherited member, the
super reference can be used. The super reference is often used to reduce ambiguity, such as when a class reuses the name
of an inherited method or variable. The calls to this() and super() are used to access constructors in the same class
and parent class, respectively.

**Evaluate code involving constructors.**

The first line of every constructor is a call to another constructor within the class using this() or a call to a
constructor of the parent class using the super() call. The compiler will insert a call to super() if no constructor
call is declared. If the parent class doesn’t contain a no-argument constructor, an explicit call to the parent
constructor must be provided. Be able to recognize when the default constructor is provided. Remember that the order of
initialization is to initialize all classes in the class hierarchy, starting with the superclass. Then the instances
are initialized, again starting with the superclass. All final variables must be assigned a value exactly once by the
time the constructor is finished.

**Understand the rules for method overriding.**

Java allows methods to be overridden, or replaced, by a subclass if certain rules are followed: a method must have the
same signature, be at least as accessible as the parent method, must not declare any new or broader exceptions, and
must use covariant return types. Methods marked final may not be overridden or hidden.

**Recognize the difference between method overriding and method overloading.**

Both method overloading and overriding involve creating a new method with the same name as an existing method. When the
method signature is the same, it is referred to as method overriding and must follow a specific set of override rules to
compile. When the method signature is different, with the method taking different inputs, it is referred to as method
overloading, and none of the override rules are required. Method overriding is important to polymorphism because it
replaces all calls to the method, even those made in a superclass.

**Understand the rules for hiding methods and variables.**

When a static method is overridden in a subclass, it is referred to as method hiding. Likewise, variable hiding is when
an inherited variable name is reused in a subclass. In both situations, the original method or variable still exists and
is accessible depending on where it is accessed and the reference type used. For method hiding, the use of static in the
method declaration must be the same between the parent and child class. Finally, variable and method hiding should
generally be avoided since it leads to confusing and difficult-to-follow code.

**Be able to write code that creates and extends abstract classes.**

In Java, classes and methods can be declared as abstract. An abstract class cannot be instantiated. An instance of an
abstract class can be obtained only through a concrete subclass. Abstract classes can include any number of abstract and
non-abstract methods, including zero.

Abstract methods follow all the method override rules and may be defined only within abstract classes. The first
concrete subclass of an abstract class must implement all the inherited methods. Abstract classes and methods may not be
marked as final.

**Create immutable objects.**

An immutable object is one that cannot be modified after it is declared. An immutable class is commonly implemented with
a private constructor, no setter methods, and no ability to modify mutable objects contained within the class.