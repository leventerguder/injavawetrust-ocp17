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

**Ternary Expression and Unperformed Side Effects**

As we saw with the conditional operators, a ternary expression can contain an unperformed side effect, as only one of
the expressions on the right side will be evaluated at runtime.

    int sheep = 1;
    int zzz = 1;
    int sleep = zzz < 10 ? sheep++ : zzz++;
    System.out.print(sheep + "," + zzz); // 2,1

Notice that since the left-hand boolean expression was true, only sheep was incremented. Contrast the preceding
example with the following modification:

    int sheep = 1;
    int zzz = 1;
    int sleep = sheep >= 10 ? sheep++ : zzz++;
    System.out.print(sheep + "," + zzz); // 1,2

Now that the left-hand boolean expression evaluates to false, only zzz is incremented. In this manner, we see how the
changes in a ternary operator may not be applied if the particular expression is not used.