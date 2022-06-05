# Controlling Flow with Branching

## Nested Loops

A nested loop is a loop that contains another loop, including while, do/while, for, and for-each loops.

    int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

    for (int[] mySimpleArray : myComplexArray) {
        for (int i = 0; i < mySimpleArray.length; i++) {
            System.out.print(mySimpleArray[i] + "\t");
        }
        System.out.println();
    }

### Adding Optional Labels

A label is an optional pointer to the head of a statement that allows the application flow to jump to it or break from
it. It is a single identifier that is followed by a colon (:).

### The break Statement

As you saw when working with switch statements, a break statement transfers the flow
of control out to the enclosing statement. The same holds true for a break statement that appears inside of a while,
do/while, or for loop, as it will end the loop early.

![](break-statement.png)

The break statement can take an optional label parameter. Without a label parameter, the break statement will terminate
the nearest inner loop it is currently in the process of executing. The optional label parameter allows us to break out
of a higher-level outer loop.

### The continue Statement

The continue statement, a statement that causes flow to finish the execution of the current loop iteration.

![](continue-statement.png)

You may notice that the syntax of the continue statement mirrors that of the break statement. In fact, the statements
are identical in how they are used, but with different results.

### The return Statement

For now, though, you should be familiar with the idea that creating methods and using return statements can be used as
an alternative to using labels and break statements.

Just remember that return statements can be used to exit loops quickly and can lead to more readable code in practice,
especially when used with nested loops.

### Unreachable Code

One facet of break, continue, and return that you should be aware of is that any code placed immediately after them in
the same block is considered unreachable and will not compile.

One thing to remember is that it does not matter if the loop or decision structure actu- ally visits the line of code.
For example, the loop could execute zero or infinite times at run- time. Regardless of execution, the compiler will
report an error if it finds any code it deems unreachable, in this case any statements immediately following a break,
continue, or return statement.

### Reviewing Branching

|          | Support labels | Support break/continue | Support yield |
|----------|----------------|------------------------|---------------|
| while    | Yes            | Yes                    | No            |
| do/while | Yes            | Yes                    | No            |
| for      | Yes            | Yes                    | No            |
| switch   | Yes            | No                     | Yes           |

Some of the most time-consuming questions you may see on the exam could involve nested loops with lots of branching.
Unless you spot an obvious compiler error, we recommend skipping these questions and coming back to them at the end.