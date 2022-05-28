# Working with Binary Arithmetic Operators

Binary operators are by far the most common operators in the Java language.

## Arithmetic Operators

Arithmetic operators are those that operate on numeric values.

| Operator       | Example | Description                                                          |
|----------------|---------|----------------------------------------------------------------------|
| Addition       | a+b     | Adds two numeric values                                              |
| Subtraction    | c-d     | Subtracts two numeric values                                         |
| Multiplication | e*f     | Multiplies two numeric values                                        |
| Division       | g/h     | Divides one numeric value by another                                 |
| Modulus        | i% j    | Returns the remainder after division of one numeric value by another |

### Adding Parentheses

You can change the order of operation explicitly by wrapping parentheses around the sections you want evaluated first.

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
