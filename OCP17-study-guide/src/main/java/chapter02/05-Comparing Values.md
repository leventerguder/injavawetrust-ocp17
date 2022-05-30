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
