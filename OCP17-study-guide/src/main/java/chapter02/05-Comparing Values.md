# Comparing Values

## Equality Operators

Determining equality in Java can be a nontrivial endeavor as there’s a semantic difference between “two objects are the
same” and “two objects are equivalent.” It is further complicated by the fact that for numeric and boolean primitives,
there is no such distinction.

| Operator      | Example | Apply to primitives                                       | Apply to objects                                                |
|---------------|---------|-----------------------------------------------------------|-----------------------------------------------------------------|
| Equality      | a == 10 | Returns true if the two values represent the same value   | Returns true if the two values reference the same object        |
| Inequality    | b != 3  | Returns true if the two values represent different values | Returns true if the two values do not reference the same object |

The equality operator can be applied to numeric values, boolean values, and objects (including String and null). When
applying the equality operator, you cannot mix these types. Each of the following results in a compiler error:

    boolean monkey = true == 3; // DOES NOT COMPILE 
    boolean ape = false != "Grape"; // DOES NOT COMPILE 
    boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE

In this example, though, the expression is assigning the value of true to bear, and as you saw in the section on
assignment operators, the assignment itself has the value of the assignment. Therefore, polar is also assigned a value
of true, and the output is true.

    boolean bear = false;
    boolean polar = (bear = true); // Not comparing operator!
    System.out.println(polar); // true

For object comparison, the equality operator is applied to the references to the objects, not the objects they point to.
Two references are equal if and only if they point to the same object or both point to null.

    var monday = new File("schedule.txt");
    var tuesday = new File("schedule.txt");
    var wednesday = tuesday;
    System.out.println(monday == tuesday); // false 
    System.out.println(tuesday == wednesday); // true

In some languages, comparing null with any other value is always false, although this is not the case in Java.

    System.out.print(null == null); // true

## Relational Operators

| Operator                 | Example             | Description                                                                                                                                   |
|--------------------------|---------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|
| Less than                | a<5                 | Returns true if the value on the left is strictly less than the value on the right                                                            |
| Less than or equal to    | b <= 6              | Returns true if the value on the left is less than or equal to the value on the right                                                         |
| Greater than             | c > 9               | Returns true if the value on the left is strictly greater than the value on the right                                                         |
| Greater than or equal to | 3 >= d              | Returns true if the value on the left is greater than or equal to the value on the right                                                      |
| Type comparison          | e instanceof String | Returns true if the reference on the left side is an instance of <br/>the type on the right side (class, interface, record, enum, annotation) |

### Numeric Comparison Operators

If the two numeric operands are not of the same data type, the smaller one is promoted, as previously discussed.

    int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2; 
    System.out.println(gibbonNumFeet < wolfNumFeet); // true 
    System.out.println(gibbonNumFeet <= wolfNumFeet); // true 
    System.out.println(gibbonNumFeet >= ostrichNumFeet); // true 
    System.out.println(gibbonNumFeet > ostrichNumFeet); // false

### instanceof Operator

The instanceOf operator is useful for determining whether an arbitrary object is a member of a particular class or
interface at runtime.

    public void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.print((Integer) time + " O'clock");
        else
            System.out.print(time);
    }

If the compiler can determine that a variable cannot possibly be cast to a specific class, it reports an error.

You should know that calling instanceof on the null literal or a null reference always returns false.

    System.out.print(null instanceof Object); // false
    Object noObjectHere = null;
    System.out.print(noObjectHere instanceof String); // false

This example does not compile, since null is used on the right side of the instanceof operator:

    System.out.print(null instanceof null); // DOES NOT COMPILE

## Logical Operators

The logical operators, (&), (|), and (^), may be applied to both numeric and boolean data types.
When they’re applied to boolean data types, they’re referred to as logical operators. Alternatively, when they’re
applied to numeric data types, they’re referred to as bitwise operators, as they perform bitwise comparisons of the bits
that compose the number.

| Operator                 | Example      | Description                                                      |
|--------------------------|--------------|------------------------------------------------------------------|
| Logical AND              | a & b        | Value is true only if both values are true.                      |
| Logical inclusive OR     | c &#124; d   | Value is true if at least one of the value is true.              |
| Logical exclusive OR     | e ^ f        | Value is true only if one value is true and the other is false   |


    boolean eyesClosed = true;
    boolean breathingSlowly = true;
    boolean resting = eyesClosed | breathingSlowly;
    boolean asleep = eyesClosed & breathingSlowly;
    boolean awake = eyesClosed ^ breathingSlowly;

    System.out.println(resting); // true
    System.out.println(asleep); // true
    System.out.println(awake); // false

## Conditional Operators

| Operator             | Example           | Description                                                                                                                    |
|----------------------|-------------------|--------------------------------------------------------------------------------------------------------------------------------|
| Conditional AND      | a && b            | Value is true only if both values are true. <br/>If the left side is false, then the right side will not be evaluated.         |
| Conditional OR       | c &#124; &#124; d | Value is true if at least one of the values is true. <br/>If the left side is true, then the right side will not be evaluated. |

The conditional operators, often called short-circuit operators, are nearly identical to the logical operators, & and |,
except that the right side of the expression may never be evaluated if the final result can be determined by the left
side of the expression.

    int hour = 10;
    boolean zooOpen = true || (hour < 4);
    System.out.println(zooOpen); // true

### Avoiding a NullPointerException

In the following example, if duck is null, the program will throw a NullPointerException at runtime:

    if(duck!=null & duck.getAge()<5) { // Could throw a NullPointerException // Do something
    
    }

The issue is that the logical AND (&) operator evaluates both sides of the expression.

    if(duck!=null && duck.getAge()<5) {
    
    }

### Checking for Unperformed Side Effects

Be wary of short-circuit behavior on the exam, as questions are known to alter a variable on the right side of the
expression that may never be reached. This is referred to as an unperformed side effect. For example, what is the
output of the following code?

    int rabbit = 6;
    boolean bunny = (rabbit >= 6) || (++rabbit <= 7); 
    System.out.println(rabbit);