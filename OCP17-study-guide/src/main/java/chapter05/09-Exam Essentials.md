# Exam Essentials

**Be able to identify correct and incorrect method declarations.**

Be able to view a method signature and know if it is correct, contains invalid or conflicting elements, or contains
elements in the wrong order.

**Identify when a method or field is accessible.**

Recognize when a method or field is accessible when the access modifier is: private, package (omitted), protected, or
public.

**Understand how to declare and use final variables.**

Local, instance, and static variables may be declared final. Be able to understand how to declare them and how they
can (or cannot) be used.

**Be able to spot effectively final variables.**

Effectively final variables are local variables that are not modified after being assigned. Given a local variable, be
able to determine if it is effectively final.

**Recognize valid and invalid uses of static imports.**

Static imports import static members. They are written as import static, not static import. Make sure they are
importing static methods or variables rather than class names.

**Apply autoboxing and unboxing.**

The process of automatically converting from a primitive value to a wrapper class is called autoboxing, while the
reciprocal process is called unboxing. Watch for a NullPointerException when performing unboxing.

**State the output of code involving methods.**

Identify when to call static rather than instance methods based on whether the class name or object comes before the
method. Recognize that instance methods can call static methods and that static methods need an instance of the object
in order to call an instance method.

**Recognize the correct overloaded method.**

Exact matches are used first, followed by wider primitives, followed by autoboxing, followed by varargs. Assigning new
values to method parameters does not change the caller, but calling methods on them does.
