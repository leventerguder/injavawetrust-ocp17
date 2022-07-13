# Exam Essentials

**Write simple lambda expressions.**

Look for the presence or absence of optional elements in lambda code. Parameter types are optional. Braces and the
return keyword are optional when the body is a single statement. Parentheses are optional when only one parameter is
specified and the type is implicit.

**Determine whether a variable can be used in a lambda body.**

Local variables and method parameters must be final or effectively final to be referenced. This means the code must
compile if you were to add the final keyword to these variables. Instance and class variables are always allowed.

**Translate method references to the "long form" lambda.**

Be able to convert method references into regular lambda expressions and vice versa. For example, System.out::print
and x -> System.out.print(x) are equivalent. Remember that the order of method parameters is inferred when using a
method reference.

**Determine whether an interface is a functional interface.**

Use the single abstract method (SAM) rule to determine whether an interface is a functional interface. Other interface
method types (default, private, static, and private static) do not count toward the single abstract method count, nor do
any public methods with signatures found in Object.

**Identify the correct functional interface given the number of parameters, return type, and method name—and vice
versa.**

The most common functional interfaces are Supplier, Consumer, Function, and Predicate. There are also binary versions
and primitive versions of many of these methods. You can use the number of parameters and return type to tell them
apart.