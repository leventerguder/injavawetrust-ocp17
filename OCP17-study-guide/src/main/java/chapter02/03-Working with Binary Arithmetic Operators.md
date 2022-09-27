# Working with Binary Arithmetic Operators

Binary operators are by far the most common operators in the Java language.
They can be used to perform mathematical operations on variables, create logical expressions, and perform basic variable
assignments.
Binary operators are often combined in complex expressions with other binary operators; therefore, operator precedence
is very important in evaluating expressions containing binary operators.

## Arithmetic Operators

Arithmetic operators are those that operate on numeric values.

| Operator       | Example | Description                                                          |
|----------------|---------|----------------------------------------------------------------------|
| Addition       | a+b     | Adds two numeric values                                              |
| Subtraction    | c-d     | Subtracts two numeric values                                         |
| Multiplication | e*f     | Multiplies two numeric values                                        |
| Division       | g/h     | Divides one numeric value by another                                 |
| Modulus        | i% j    | Returns the remainder after division of one numeric value by another |

Take a look at the following expression:

    int price = 2 * 5 + 3 * 4 - 8;

First, you evaluate the 2 * 5 and 3 * 4, which reduces the expression to this:

    int price = 10 + 12 - 8;

### Adding Parentheses

You can change the order of operation explicitly by wrapping parentheses around the sections you want evaluated first.

Parentheses can appear in nearly any question on the exam involving numeric values, so make sure you understand how they
are changing the order of operation when you see them.

### Verifying Parentheses Syntax

When working with parentheses, you need to make sure they are always valid and balanced. Consider the following
examples:

    long pigeon = 1 + ((3 * 5) / 3; // DOES NOT COMPILE 
    int blueJay = (9 + 2) + 3) / (2 * 4; // DOES NOT COMPILE

When reading from left to right, a new right parenthesis must match a previous left parenthesis. Likewise, all left
parentheses must be closed by right parentheses before the end of the expression.

    short robin = 3 + [(4 * 2) + 4]; // DOES NOT COMPILE

This example does not compile because Java, unlike some other programming languages, does not allow brackets, [], to be
used in place of parentheses.

### Division and Modulus Operators

The modulus operator, sometimes called the remainder operator, is simply the remainder when two numbers are divided.

    System.out.println(9 / 3);   // 3
    System.out.println(9 % 3);   // 0
    System.out.println(10 / 3);  // 3
    System.out.println(10 % 3);  // 1
    System.out.println(11 / 3);  // 3
    System.out.println(11 % 3);  // 2
    System.out.println(12 / 3);  // 4
    System.out.println(12 % 3);  // 0

The modulus operation is not limited to positive integer values in Java; it may also be applied to negative integers and
floating-point numbers. For example, if the divisor is 5, then the modulus value of a negative number is between -4 and
0 . For the exam, though, you are not required to be able to take the modulus of a negative integer or a floating-point
number.

## Numeric Promotion

You need to memorize certain rules that Java will follow when applying operators to data types:

- If two values have different data types, Java will automatically promote one of the values to the larger of the two
  data types.
- If one of the values is integral and the other is floating-point, Java will automatically promote the integral value
  to the floating-point value’s data type.
- Smaller data types, namely, byte, short, and char, are first promoted to int any time they’re used with a Java binary
  arithmetic operator with a variable (as opposed to a value), even if neither of the operands is int.
- After all promotion has occurred and the operands have the same data type, the resulting value will have the same
  data type as its promoted operands.

Let’s tackle some examples for illustrative purposes:

    int x = 1; 
    long y = 33; 
    var z = x * y;

Since one of the values is int and the other is long, and long is larger than int, the int value x is first promoted to
a long. The result z is then a long value.

What is the data type of x + y?

    double x = 39.21; 
    float y = 2.1; 
    var z = x + y;

This is actually a trick question, as the second line does not compile!

What is the data type of x * y?

    short x = 10; 
    short y = 3; 
    var z = x * y;

x and y will both be promoted to int before the binary multiplication operation, resulting in an output of type int.

What is the data type of w * x / y?

    short w = 14; 
    float x = 13; 
    double y = 30;
    var z = w * x / y;

The result of w * x will then be automatically promoted to a double so that it can be divided by y, resulting in a
double value.