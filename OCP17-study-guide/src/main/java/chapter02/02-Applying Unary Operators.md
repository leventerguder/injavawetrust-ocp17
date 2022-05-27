# Applying Unary Operator

By definition, a unary operator is one that requires exactly one operand, or variable, to function.

| Operator              | Example        | Description                                                 |
|-----------------------|----------------|-------------------------------------------------------------|
| Logical Complement    | !a             | Inverts a boolean's logical value                           |
| Bitwise Complement    | ~b             | Inverts all 0s and 1s in a number                           |
| Plus                  | +c             | Indicates a number is positive.                             |
| Negation or minus     | -d             | Indicates a literal is negative<br/>or negates an expresion |
| Increment             | ++e f++        | Increments a value by 1                                     |
| Decrement             | --ff h--       | Decrements a value by 1                                     |
| Cast                  | (String)i      | Cast a value to a specific type                             |

## Complement and Negation Operators

The logical complement operator (!) flips the value of a boolean expression. For example, if the value is true, it will
be converted to false, and vice versa.

the bitwise complement operator (~), which flips all of the 0s and 1s in a number. It can only be applied to integer
numeric types such as byte, short, char, int, and long.

To find the bitwise complement of a number, multiply it by negative one and then subtract one.

The negation operator (-) reverses the sign of a numeric expression.

You cannot apply a negation operator (-) to a boolean expression, nor can you apply a logical complement operator (!) to
a numeric expression.

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