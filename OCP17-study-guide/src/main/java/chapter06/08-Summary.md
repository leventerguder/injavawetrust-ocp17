# Summary

Java classes follow a single inheritance pattern in which every class has exactly one direct parent class, with all
classes eventually inheriting from java.lang.Object.

Inheriting a class gives you access to all of the public and protected members of the class.
It also gives you access to package members of the class if the classes are in the same package.

All instance methods, constructors, and instance initializers have access to two special reference variables: this and
super. Both this and super provide access to all inherited members, with only this providing access to all members in
the current class declaration.

Constructors are special methods that use the class name and do not have a return type. They are used to instantiate new
objects. Declaring constructors requires following a number of important rules. If no constructor is provided, the
compiler will automatically insert a default no-argument constructor in the class. The first line of every constructor
is a call to an overloaded constructor, this(), or a parent constructor, super(); otherwise, the compiler will insert a
call to super() as the first line of the constructor. In some cases, such as if the parent class does not define a
no-argument constructor, this can lead to compilation errors. Pay close attention on the exam to any class that defines
a constructor with arguments and doesn’t define a no-argument constructor.

Classes are initialized in a predetermined order: superclass initialization; static variables and static initializers in
the order that they appear; instance variables and instance initializers in the order they appear; and finally, the
constructor. All final instance variables must be assigned a value exactly once.

We reviewed overloaded, overridden, hidden, and redeclared methods and showed how they differ. A method is overloaded if
it has the same name but a different signature as another accessible method. A method is overridden if it has the same
signature as an inherited method, with access modifiers, exceptions, and a return type that are compatible. A static
method is hidden if it has the same signature as an inherited static method. Finally, a method is redeclared if it has
the same name and possibly the same signature as an uninherited method.

We then moved on to abstract classes, which are just like regular classes except that they cannot be instantiated and
may contain abstract methods. An abstract class can extend a non-abstract class and vice versa. Abstract classes can be
used to define a framework that other developers write subclasses against. An abstract method is one that does not
include a body when it is declared. An abstract method can only be placed inside an abstract class or interface. Next,
an abstract method can be overridden with another abstract declaration or a concrete implementation, provided the rules
for overriding methods are followed. The first concrete class must implement all of the inherited abstract methods,
whether they are inherited from an abstract class or an interface.

Finally, this chapter showed you how to create immutable objects in Java. Although there are a number of different
techniques to do so, we included the most common one you should know for the exam. Immutable objects are extremely
useful in practice, especially in multi-threaded applications, since they do not change.
