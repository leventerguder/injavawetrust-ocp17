# Summary

Methods start with access modifiers and optional specifiers in any order (although commonly with access modifiers
first). The access modifiers we discussed in this chapter are private, package (omitted), protected, and public. The
optional specifier for methods we covered in this chapter is static.

Next comes the method return type, which is void if there is no return value. The method name and parameter list are
provided next, which compose the unique method signature. The method name uses standard Java identifier rules, while the
parameter list is composed of zero or more types with names. An optional list of exceptions may also be added following
the parameter list.
Finally, a block defines the method body (which is omitted for abstract methods).

Access modifiers are used for a lot more than just methods, so make sure you understand them well. Using the private
keyword means the code is only available from within the same class. Package access means the code is available only
from within the same package. Using the protected keyword means the code is available from the same package or
subclasses. Using the public keyword means the code is available from anywhere.

Both static methods and static variables are shared by all instances of the class. When referenced from outside the
class, they are called using the class name—for example, Pigeon.fly(). Instance members are allowed to call static
members, but static members are not allowed to call instance members. In addition, static imports are used to import
static members.

We also presented the final modifier and showed how it can be applied to local, instance, and static variables.
Remember, a local variable is effectively final if it is not modified after it is assigned. One quick test for this is
to add the final modifier and see if the code still compiles.

Java uses pass-by-value, which means that calls to methods create a copy of the parameters. Assigning new values to
those parameters in the method doesn’t affect the caller’s variables. Calling methods on objects that are method
parameters changes the state of those objects and is reflected in the caller. Java supports autoboxing and unboxing of
primitives and wrappers automatically within a method and through method calls.

Overloaded methods are methods with the same name but a different parameter list. Java calls the most specific method it
can find. Exact matches are preferred, followed by wider primitives. After that comes autoboxing and finally varargs.