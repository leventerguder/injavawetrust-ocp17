# Using the StringBuilder Class

The StringBuilder class creates a String without storing all those interim String values. Unlike the String class,
StringBuilder is not immutable.

    StringBuilder alpha = new StringBuilder();
    for (char current = 'a'; current <= 'z'; current++) {
        alpha.append(current);
    }

    System.out.println(alpha);

## Mutability and Chaining

When we chained String method calls, the result was a new String with the answer. Chaining StringBuilder methods doesn’t
work this way. Instead, the StringBuilder changes its own state and returns a reference to itself.

    StringBuilder sb = new StringBuilder("start");
    sb.append("+middle"); // sb = "start+middle"
    StringBuilder same = sb.append("+end"); // "start+middle+end"

The exam won’t always make the code easy to read by having only one method per line. What do you think this example
prints?

    StringBuilder a = new StringBuilder("abc");
    StringBuilder b = a.append("de");
    b = b.append("f").append("g");
    System.out.println("a=" + a);
    System.out.println("b=" + b);

Did you say both print "abcdefg"? Good. There’s only one StringBuilder object here. We know that because new
StringBuilder() is called only once.

## Creating a StringBuilder

There are three ways to construct a StringBuilder:

    StringBuilder sb1 = new StringBuilder(); 
    StringBuilder sb2 = new StringBuilder("animal"); 
    StringBuilder sb3 = new StringBuilder(10);

The first says to create a StringBuilder containing an empty sequence of characters and assign sb1 to point to it. The
second says to create a StringBuilder containing a specific value and assign sb2 to point to it. The first two examples
tell Java to manage the implementation details. The final example tells Java that we have some idea of how big the
eventual value will be and would like the StringBuilder to reserve a certain capacity, or number of slots, for
characters.

## Important StringBuilder Methods

### Using Common Methods

These four methods work exactly the same as in the String class.

    var sb = new StringBuilder("animals");
    String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
    int len = sb.length();
    char ch = sb.charAt(6);
    System.out.println(sub + " " + len + " " + ch);

### Appending Values

The append() method is by far the most frequently used method in StringBuilder. This method does just what it sounds
like : it adds the parameter to the StringBuilder and returns a reference to the current StringBuilder.

    public StringBuilder append(String str)

There are more than 10 method signatures that look similar but take different data types as parameters, such as int,
char, etc.

    var sb = new StringBuilder().append(1).append('c');
    sb.append("-").append(true);
    System.out.println(sb); // 1c-true

### Inserting Data

The insert() method adds characters to the StringBuilder at the requested index and returns a reference to the current
StringBuilder. Just like append(), there are lots of method signatures for different types.

    public StringBuilder insert(int offset, String str)

    var sb = new StringBuilder("animals");
    sb.insert(7, "-"); // animals-
    sb.insert(0, "-"); // -animals-
    sb.insert(4, "-"); // -ani-mals-
    System.out.println(sb);

### Deleting Contents

The delete() method is the opposite of the insert() method. It removes characters from the sequence and returns a
reference to the current StringBuilder. The deleteCharAt() method is convenient when you want to delete only one
character.

    public StringBuilder delete(int startIndex, int endIndex) 
    public StringBuilder deleteCharAt(int index)

    var sb = new StringBuilder("abcdef");
    sb.delete(1, 3); // sb = adef
    sb.deleteCharAt(5); // exception

The delete() method is more flexible than some others when it comes to array indexes. If you specify a second parameter
that is past the end of the StringBuilder, Java will just assume you meant the end.

    var sb = new StringBuilder("abcdef"); 
    sb.delete(1, 100); // sb = a

### Replacing Portions

The replace() method works differently for StringBuilder than it did for String. The method signature is as follows:

    public StringBuilder replace(int startIndex, int endIndex, String newString)

    var builder = new StringBuilder("pigeon dirty");
    builder.replace(3, 6, "sty");
    System.out.println(builder); // pigsty dirty

### Reversing

The reverse() method does just what it sounds like: it reverses the characters in the sequences and returns a reference
to the current StringBuilder.

    public StringBuilder reverse()

    var sb = new StringBuilder("ABC");
    sb.reverse();
    System.out.println(sb); //CBA

### Working with toString()

The Object class contains a toString() method that many classes provide custom implementations of. The StringBuilder
class is one of these.

    var sb = new StringBuilder("ABC"); 
    String s = sb.toString();