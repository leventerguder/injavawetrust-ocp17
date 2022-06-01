# Making Decisions with the Ternary Operator

The ternary operator has the following form:

    booleanExpression ? expression1 : expression2

The first operand must be a boolean expression, and the second and third operands can be any expression that returns a
value.

    int owl = 5;
    int food = owl < 2 ? 3 : 4;
    System.out.println(food); // 4

    int food1 = owl < 4 ? owl > 2 ? 3 : 4 : 5;
    int food2 = (owl < 4 ? ((owl > 2) ? 3 : 4) : 5);

you should know that there is no requirement that second and third expressions in ternary operations have the same data
types, although it does come into play when combined with the assignment operator.

    int stripes = 7;
    System.out.print((stripes > 5) ? 21 : "Zebra");
    ...
    int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE

## Ternary Expression and Unperformed Side Effects

As we saw with the conditional operators, a ternary expression can contain an unper- formed side effect, as only one of
the expressions on the right side will be evaluated at runtime.