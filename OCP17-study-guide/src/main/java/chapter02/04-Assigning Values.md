# Assigning Values

To be successful with the assignment operators, you should be fluent in understanding how the compiler handles numeric
promotion and when casting is required.

## Assignment Operator

An assignment operator is a binary operator that modifies, or assigns, the variable on the left side of the operator
with the result of the value on the right side of the equation. Unlike most other Java operators, the assignment
operator is evaluated from right to left.

    int herd = 1;

Java will automatically promote from smaller to larger data types, as you saw in the previous section on arithmetic
operators, but it will throw a compiler exception if it detects that you are trying to convert from larger to smaller
data types without casting.

## Casting Values

Casting is a unary operation where one data type is explicitly interpreted as another data type. Casting is optional and
unnecessary when converting to a larger or widening data type, but it is required when converting to a smaller or
narrowing data type. Without casting, the compiler will generate an error when trying to put a larger data type inside a
smaller one.

    int fur = (int)5;
    int hair = (short) 2;
    String type = (String) "Bird";
    short tail = (short)(4 + 10);
    long feathers = 10(long); // DOES NOT COMPILE

    float egg = 2.0 / 9; // DOES NOT COMPILE 
    int tadpole = (int)5 * 2L; // DOES NOT COMPILE 
    short frog = 3 - 2.0; // DOES NOT COMPILE

### Reviewing Primitive Assignments

See if you can figure out why each of the following lines does not compile:

    int fish = 1.0; // DOES NOT COMPILE
    short bird = 1921222; // DOES NOT COMPILE
    int mammal = 9f; // DOES NOT COMPILE
    long reptile = 192_301_398_193_810_323; // DOES NOT COMPILE

The first statement does not compile because you are trying to assign a double 1.0 to an integer value.
The second statement does not compile because the literal value 1921222 is outside the range of short, and the compiler
detects this.
The third statement does not compile because the f added to the end of the number but the assignment is to an int.
Finally, the last statement does not compile because Java interprets the literal as an int and notices that the value is
larger than int allows. The literal would need a postfix L or l to be considered a long.

### Applying Casting

We can fix three of the previous examples by casting the results to a smaller data type. Remember, casting primitives is
required any time you are going from a larger numerical data type to a smaller numerical data type, or converting from a
floating-point number to an integral value.

    int fish = (int)1.0;
    short bird = (short)1921222; // Stored as 20678
    int mammal = (int)9f;
    long reptile = (long)192301398193810323; // DOES NOT COMPILE
    long reptile = 192301398193810323L;

**Overflow and Underflow**

Overflow is when a number is so large that it will no longer fit within the data type, so the system “wraps around” to
the lowest negative value and counts up from there, similar to how modulus arithmetic works.There’s also an analogous
underflow, when the number is too low to fit in the data type, such as storing -200 in a byte field.

    System.out.print(2147483647+1); // -2147483648

    short mouse = 10;
    short hamster = 3;
    short capybara = mouse * hamster; // DOES NOT COMPILE

As you may remember, short values are automatically promoted to int when applying any arithmetic operator, with the
resulting value being of type int.

    short mouse = 10;
    short hamster = 3;
    short capybara = (short)mouse * hamster; // DOES NOT COMPILE
    short capybara = 1 + (short)(mouse * hamster); // DOES NOT COMPILE

### Casting Values vs Variables

The compiler doesn’t require casting when working with literal values that fit into the data type.

    byte hat = 1;
    byte gloves = 7 * 10; 
    short scarf = 5; 
    short boots = 2 + 1;

All of these statements compile without issue. On the other hand, neither of these statements compiles:

    short boots = 2 + hat; // DOES NOT COMPILE 
    byte gloves = 7 * 100; // DOES NOT COMPILE

## Compound Assignment Operators

Besides the simple assignment operator (=), Java supports numerous compound assignment operators.

| Operator                        | Example    | Description                                                                                                     |
|---------------------------------|------------|-----------------------------------------------------------------------------------------------------------------|
| Addition<br/>assignment         | a += 5     | Adds the value on the right to the variable on the left <br/>and assigns the sum to the variable                |
| Subtraction<br/>assignment      | b -= 0.2   | Subtracts the value on the right from the variable on the left <br/>and assigns the difference to the variable  |
| Multiplication<br/>assignment   | c *= 100   | Multiplies the value on the right with the variable on the left <br/>and assigns the product to the variable    |
| Division<br/>assignment         | d /= 4     | Divides the variable on the left by the value on the right <br/>and assigns the quotient to the variable        |

Compound operators are really just glorified forms of the simple assignment operator, with a built-in arithmetic or
logical operation that applies the left and right sides of the statement and stores the resulting value in the variable
on the left side of the statement.

    int camel = 2, giraffe = 3;
    camel = camel * giraffe; // Simple assignment operator 
    camel *= giraffe; // Compound assignment operator

Compound operators are useful for more than just shorthand—they can also save you from having to explicitly cast a
value.

    long goat = 10;
    int sheep = 5;
    sheep = sheep * goat; // DOES NOT COMPILE

    long goat = 10; 
    int sheep = 5; 
    sheep *= goat;

The compound operator will first cast sheep to a long, apply the multiplication of two long values, and then cast the
result to an int.

## Return Value of Assignment Operators

One final thing to know about assignment operators is that the result of an assignment is an expression in and of itself
equal to the value of the assignment. For example, the following snippet of code is perfectly valid, if a little
odd-looking:

    long wolf = 5;
    long coyote = (wolf=3); 
    System.out.println(wolf); // 3 
    System.out.println(coyote); // 3

The key here is that (wolf=3) does two things. First, it sets the value of the variable wolf to be 3. Second, it returns
a value of the assignment, which is also 3.

    boolean healthy = false; 
    if(healthy = true)
        System.out.print("Good!");

While this may look like a test if healthy is true, it’s actually assigning healthy a value of true.