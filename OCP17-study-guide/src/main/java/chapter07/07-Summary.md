# Summary

Remember, interfaces and their members can include a number of implicit modifiers inserted by the compiler
automatically.
We then covered all six types of interface members you need to know for the exam: abstract methods, static constants,
default methods,static methods,private methods,and private static methods.

We next moved on to enums, which are compile-time constant properties. Simple enums are composed of a list of values,
while complex enums can include constructors, methods, and fields. Enums can also be used in switch statements and
expressions. When an enum method is marked abstract, each enum value must provide an implementation.

Moving on to new topics in Java, we covered sealed classes and how they allow classes to function like enumerated types
in which only certain subclasses are permitted. For the exam, it’s important to remember that the subclasses of a sealed
class must be marked final, sealed, or non-sealed.
If the subclasses of the sealed class are defined in the same file, then the permits clause may be omitted in the sealed
class declaration. Finally, sealed interfaces may be used to limit which classes can implement an interface, which
interfaces may extend an interface, or both.

Records are another new feature available in Java. Records are a compact way of declaring an immutable and encapsulated
POJO in which the compiler adds a lot of the boilerplate code for you.
Remember, encapsulation is the practice of preventing external callers from accessing the internal components of an
object. Records include automatic creation of the accessor methods, a long constructor, and useful implementations of
equals(), hashCode(), and toString(). Records can include overloaded and compact constructors to support data validation
and transformation. Records do not permit instance variables, since this could break immutability, but they do allow
methods, static members, and nested types.

We then moved on to nested types. For simplicity, we focused on nested classes and covered each of the four types. An
inner class requires an instance of the outer class to use, while a static nested class does not. A local class is
commonly defined within a method or block. Local classes can only access local variables that are final and effectively
final. Anonymous classes are a special type of local class that does not have a name. Anonymous classes are required
to extend exactly one class or implement one interface. Inner, local, and anonymous classes can access private members
of the class in which they are defined, provided the latter two are used inside an instance method.

We concluded this chapter with a discussion of polymorphism, which is central to the Java language, and showed how
objects can be accessed in a variety of forms. Make sure you understand when casts are needed for accessing objects, and
be able to spot the difference between compile-time and runtime cast problems.