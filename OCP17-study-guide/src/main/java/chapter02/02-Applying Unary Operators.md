# Applying Unary Operator

By definition, a unary operator is one that requires exactly one operand, or variable, to function.

| Operator              | Example        | Description                                                   |
|-----------------------|----------------|---------------------------------------------------------------|
| Logical Complement    | !a             | Inverts a boolean's logical value                             |
| Bitwise Complement    | ~b             | Inverts all 0s and 1s in a number                             |
| Plus                  | +c             | Indicates a number is positive.                               |
| Negation or minus     | -d             | Indicates a literal is negative<br/>or negates an expression  |
| Increment             | ++e f++        | Increments a value by 1                                       |
| Decrement             | --ff h--       | Decrements a value by 1                                       |
| Cast                  | (String)i      | Cast a value to a specific type                               |

## Complement and Negation Operators

The logical complement operator (!) flips the value of a boolean expression. For example, if the value is true, it will
be converted to false, and vice versa.

    boolean isAnimalAsleep = false; 
    System.out.print(isAnimalAsleep); // false 
    isAnimalAsleep = !isAnimalAsleep; 
    System.out.print(isAnimalAsleep); // true

The bitwise complement operator (~), which flips all of the 0s and 1s in a number. It can only be applied to integer
numeric types such as byte, short, char, int, and long.

To find the bitwise complement of a number, multiply it by negative one and then subtract one.

    System.out.println(-1 * value - 1); // -4
    System.out.println(-1 * complement - 1); // 3

The negation operator (-) reverses the sign of a numeric expression.

    double zooTemperature = 1.21;
    System.out.println(zooTemperature); // 1.21
    zooTemperature = -zooTemperature;
    System.out.println(zooTemperature); // -1.21
    zooTemperature = -(-zooTemperature);
    System.out.println(zooTemperature); // -1.21

You cannot apply a negation operator (-) to a boolean expression, nor can you apply a logical complement operator (!) to
a numeric expression.

For example, none of the following lines of code will compile:

    int pelican = !5; // DOES NOT COMPILE 
    boolean penguin = -true; // DOES NOT COMPILE 
    boolean peacock = !0; // DOES NOT COMPILE

The first statement will not compile because in Java you cannot perform a logical inversion of a numeric value. The
second statement does not compile because you cannot numerically negate a boolean value; you need to use the logical
inverse operator. Finally, the last statement does not compile because you cannot take the logical complement of a
numeric value, nor can you assign an integer to a boolean variable.

Keep an eye out for questions on the exam that use numeric values (such as 0 or 1) with boolean expressions. Unlike in
some other programming languages, in Java, 1 and true are not related in any way, just as 0 and false are not related.

## Increment and Decrement Operators

Increment and decrement operators, ++ and --, respectively, can be applied to numeric variables and have a high order
of precedence compared to binary operators. In other words, they are often applied first in an expression.

Increment and decrement operators require special care because the order in which they are attached to their associated
variable can make a difference in how an expression is processed.

| Operator         | Example | Description                                              |
|------------------|---------|----------------------------------------------------------|
| Pre-increment    | ++w     | Increases the value by 1 and returns the new value       |
| Pre-decrement    | --x     | Decreases the value by 1 and returns the new value       |
| Post-increment   | y++     | Increases the value by 1 and returns the original value. |
| Post-decrement   | z--     | Decreases the value by 1 and returns the original value  |

The following code snippet illustrates this distinction:

    int parkAttendance = 0; 
    System.out.println(parkAttendance); // 0 
    System.out.println(++parkAttendance); // 1
    System.out.println(parkAttendance); // 1 
    System.out.println(parkAttendance--); // 1 
    System.out.println(parkAttendance); // 0

The first pre-increment operator updates the value for parkAttendance and outputs the new value of 1. The next
post-decrement operator also updates the value of parkAttendance but outputs the value before the decrement occurs.

For the exam, it is critical that you know the difference between expressions like parkAttendance++ and
++parkAttendance. The increment and decrement operators will be in multiple questions, and confusion about which value
is returned could cause you to lose a lot of points on the exam.


