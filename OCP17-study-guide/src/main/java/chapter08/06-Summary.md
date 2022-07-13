# Summary

We recommend that you understand this chapter well before moving on.
Lambda expressions, or lambdas, allow passing around blocks of code. The full syntax looks like this:

    (String a, String b) -> { return a.equals(b); }

The parameter types can be omitted. When only one parameter is specified without a type, the parentheses can also be
omitted. The braces and return statement can be omitted for a single statement, making the short form as follows:

    a -> a.equals(b)

Lambdas can be passed to a method expecting an instance of a functional interface.

A lambda can define parameters or variables in the body as long as their names are different from existing local
variables. The body of a lambda is allowed to use any instance or class variables.

Additionally, it can use any local variables or method parameters that are final or effectively final.

A method reference is a compact syntax for writing lambdas that refer to methods. There are four types: static methods,
instance methods on a particular object, instance methods on a parameter, and constructor references.

A functional interface has a single abstract method. Any functional interface can be implemented with a lambda
expression. You must know the built-in functional interfaces.

