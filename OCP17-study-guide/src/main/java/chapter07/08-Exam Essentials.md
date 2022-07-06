# Exam Essentials

**Be able to write code that creates, extends, and implements interfaces.**

Interfaces are specialized abstract types that focus on abstract methods and constant variables. An interface may
extend any number of interfaces and, in doing so, inherits their abstract methods. An interface cannot extend a class,
nor can a class extend an interface. A class may implement any number of interfaces.

**Know which interface methods an interface method can reference.**

Non-static private, default, and abstract interface methods are associated with an instance of an interface. Non-static
private and default interface methods may reference any method within the interface declaration. Alternatively, static
interface methods are associated with class membership and can only reference other static members. Finally, private
methods can only be referenced within the interface declaration.

**Be able to create and use enum types.**

An enum is a data structure that defines a list of values. If the enum does not contain any other elements, the
semicolon (;) after the values is optional. An enum can be used in switch statements and contain instance variables,
constructors, and methods. Enum constructors are implicitly private. Enums can include methods, both as members or
within individual enum values. If the enum declares an abstract method, each enum value must implement it.

**Be able to recognize when sealed classes are being correctly used.**

A sealed class is one that defines a list of permitted subclasses that extend it. Be able to use the correct modifier (
final, sealed, or non-sealed) with sealed classes. Understand when the permits clause may be excluded.

**Identify properly encapsulated classes.**

Instance variables in encapsulated classes are private. All code that retrieves the value or updates it uses methods.
Encapsulated classes may include accessor (getter) or mutator (setter) methods, although this is not required.

**Understand records and know which members the compiler is adding automatically.**

Records are encapsulated and immutable types in which the compiler inserts a long constructor, accessor methods, and
useful implementations of equals(), hashCode(), and toString(). Each of these elements may be overridden. Be able to
recognize compact constructors and know that they are used only for validation and transformation of constructor
parameters, not for accessing fields. Recognize that when a record is declared with an instance member, it does not
compile.

**Be able to declare and use nested classes.**

There are four types of nested types: inner classes, static classes, local classes, and anonymous classes. Instantiating
an inner class requires an instance of the outer class. On the other hand, static nested classes can be created
without a reference to the outer class. Local and anonymous classes cannot be declared with an access modifier.
Anonymous classes are limited to extending a single class or implementing one interface.

**Understand polymorphism.**

n object may take on a variety of forms, referred to as polymorphism. The object is viewed as existing in memory in
one concrete form but is accessible in many forms through reference variables. Changing the reference type of an object
may grant access to new members, but the members always exist in memory.