# Creating and Manipulating Strings

The String class is such a fundamental class that you'd be hard-pressed to write code without it.
A string is basically a sequence of characters.

In Java, these two snippets both create a String:

    String name = "Fluffy";
    String name = new String("Fluffy");

Further, text blocks are another way of creating a String.

    String name = """
                  Fluffy""";

Since a String is a sequence of characters, you probably won’t be surprised to hear that it implements the interface
CharSequence. This interface is a general way of representing several classes, including String and StringBuilder.

## Concatenating

Placing one String before the other String and combining them is called string concatenation.

There aren’t a lot of rules to know for this, but you have to know them well:

- If both operands are numeric , + means numeric addition.
- If either operand is a String, + means concatenation.
- The expression is evaluated left to right.

````
    System.out.println(1 + 2);
    System.out.println("a" + "b");
    System.out.println("a" + "b" + 3);
    System.out.println(1 + 2 + "c");
    System.out.println("c" + 1 + 2);
    System.out.println("c" + null);
````

The exam takes trickery a step further and will try to fool you with something like this:

    int three = 3;
    String four = "4";
    System.out.println(1 + 2 + three + four);

There is one more thing to know about concatenation, but it is easy. In this example, you just have to remember what +=
does. Keep in mind, s += "2" means the same thing as s = s + "2".

    var s = "1";    // s currently holds "1"
    s += "2";       // s currently holds "12"
    s += "3";       // s currently holds "123"
    System.out.println(s);  // 123

To review the rules one more time: use numeric addition if two numbers are involved, use concatenation otherwise, and
evaluate from left to right.

## Important String Methods

The String class has dozens of methods. Luckily, you need to know only a handful for the exam. The exam creators pick
most of the methods developers use in the real world.

You also need to know that a String is immutable, or unchangeable. This means calling a method on a String will return a
different String object rather than changing the value of the reference

### Determining the Length

The method length() returns the number of characters in the String.

    public int length()

    var name = "animals"; 
    System.out.println(name.length()); // 7

### Getting a Single Character

The method charAt() lets you query the string to find out what character is at a specific index.

    public char charAt(int index)

    var name = "animals"; 
    System.out.println(name.charAt(0)); // a 
    System.out.println(name.charAt(6)); // s 
    System.out.println(name.charAt(7)); // exception

### Finding an Index

The method indexOf() looks at the characters in the string and finds the first index that matches the desired value.

    public int indexOf(int ch)

    public int indexOf(int ch, int fromIndex) 
    public int indexOf(String str)
    public int indexOf(String str, int fromIndex)


    var name = "animals";
    System.out.println(name.indexOf('a')); // 0
    System.out.println(name.indexOf("al")); // 4
    System.out.println(name.indexOf('a', 4)); // 4
    System.out.println(name.indexOf("al", 5)); // -1

### Getting a Substring

The method substring() also looks for characters in a string. It returns parts of the string. The first parameter is the
index to start with for the returned string. As usual, this is a zero-based index. There is an optional second
parameter, which is the end index you want to stop at.

    public String substring(int beginIndex)
    public String substring(int beginIndex, int endIndex)

    var name = "animals";
    System.out.println(name.substring(3));      //mals
    System.out.println(name.substring(name.indexOf('m'))); //mals
    System.out.println(name.substring(3, 4)); // m
    System.out.println(name.substring(3, 7)); // mals

    System.out.println(name.substring(3, 3)); // empty string 
    System.out.println(name.substring(3, 2)); // exception 
    System.out.println(name.substring(3, 8)); // exception

### Adjusting Case

These methods make it easy to convert your data.

    public String toLowerCase() 
    public String toUpperCase()


    var name = "animals";
    System.out.println(name.toUpperCase()); // ANIMALS
    System.out.println("Abc123".toLowerCase()); // abc123

### Checking for Equality

The equals() method checks whether two String objects contain exactly the same characters in the same order. The
equalsIgnoreCase() method checks whether two String objects contain the same characters, with the exception that it
ignores the characters’ case.

    public boolean equals(Object obj)
    public boolean equalsIgnoreCase(String str)

    
    System.out.println("abc".equals("ABC")); // false
    System.out.println("ABC".equals("ABC")); // true
    System.out.println("abc".equalsIgnoreCase("ABC")); // true

**Overriding toString(), equals(Object), and hashCode()**

Knowing how to properly override toString(), equals(Object), and hashCode() was part of Java certification exams in the
past. As a professional Java developer, it is still important for you to know at least the basic rules for overriding
each of these methods:

- toString(): The toString() method is called when you try to print an object or concatenate the object with a String.
  It is commonly overridden with a version that prints a unique description of the instance using its instance fields.
- equals(Object): The equals(Object) method is used to compare objects,
  with the default implementation just using the == operator.You should override the equals(Object) method any time you
  want to conveniently compare elements for equality, especially if this requires checking numerous fields.
- hashCode(): Any time you override equals(Object), you must override hashCode() to be consistent.This means that for
  any two objects, if a.equals(b) is true, then a.hashCode()==b.hashCode() must also be true. If they are not
  consistent, this could lead to invalid data and side effects in hash-based collections such as HashMap and HashSet.

All of these methods provide a default implementation in Object, but if you want to make intelligent use of them, you
should override them.

### Searching for Substrings

The startsWith() and endsWith() methods look at whether the provided value matches part of the String. The contains()
method isn’t as particular; it looks for matches anywhere in the String.

    public boolean startsWith(String prefix) 
    public boolean endsWith(String suffix)
    public boolean contains(CharSequence charSeq)


    System.out.println("abc".startsWith("a"));
    System.out.println("abc".startsWith("A"));
    
    System.out.println("abc".endsWith("c"));
    System.out.println("abc".endsWith("a"));
    
    System.out.println("abc".contains("b"));
    System.out.println("abc".contains("B"));

### Replacing Values

The replace() method does a simple search and replace on the string.

    public String replace(char oldChar, char newChar)
    public String replace(CharSequence target, CharSequence replacement)

    System.out.println("abcabc".replace('a', 'A')); // AbcAbc
    System.out.println("abcabc".replace("a", "A")); // AbcAbc
    System.out.println("abcabc".replace("a", "AX")); // AXbcAXbc

### Removing Whitespace

These methods remove blank space from the beginning and/or end of a String.
The strip() and trim() methods remove whitespace from the beginning and end of a String.

In terms of the exam, whitespace consists of spaces along with the \t (tab) and \n (newline) characters.
Other characters, such as \r (carriage return), are also included in what gets trimmed. The strip() method does
everything that trim() does, but it supports Unicode.

Additionally, the stripLeading() method removes whitespace from the beginning of the String and leaves it at the end.
The stripTrailing() method does the opposite. It removes whitespace from the end of the String and leaves it at the
beginning.

    public String strip()
    public String stripLeading() 
    public String stripTrailing() 
    public String trim()

    System.out.println("abc".strip());          // abc
    System.out.println("\t a b c\n".strip());   // a b c

    String text = " abc\t ";

    System.out.println(text.trim().length());   // 3
    System.out.println(text.strip().length());  // 3
    System.out.println(text.stripLeading().length()); // 5
    System.out.println(text.stripTrailing().length()); // 4

### Working with Indentation

Now that Java supports text blocks, it is helpful to have methods that deal with indentation.

    public String indent(int numberSpaces) 
    public String stripIndent()

The indent() method adds the same number of blank spaces to the beginning of each line if you pass a positive number. If
you pass a negative number, it tries to remove that number of whitespace characters from the beginning of the line. If
you pass zero, the indentation will not change.

If you call indent() with a negative number and try to remove more whitespace characters than are present at the
beginning of the line, Java will remove all that it can find.

However, indent() also normalizes whitespace characters. What does normalizing whitespace mean, you ask? First, a line
break is added to the end of the string if not already there. Second, any line breaks are converted to the \n format.
Regardless of whether your operating system uses \r\n (Windows) or\n (Mac/ Unix), Java will standardize on \n for you.

The stripIndent() method is useful when a String was built with concatenation rather than using a text block. It gets
rid of all incidental whitespace. This means that all non-blank lines are shifted left so the same number of whitespace
characters are removed from each line and the first character that remains is not blank. Like indent(), \r\n is turned
into \n. However, the stripIndent() method does not add a trailing line break if it is missing.

| Method               | Indent change                                                                                                           | Normalizes existing line breaks      | Adds line break <br/>at end if missing |
|----------------------|-------------------------------------------------------------------------------------------------------------------------|--------------------------------------|----------------------------------------|
| indent(n) where n>0  | Adds n spaces to beginning of each line                                                                                 | Adds two numeric values              | Yes                                    |
| indent(n) where n==0 | No Change                                                                                                               | Subtracts two numeric values         | Yes                                    |
| indent(n) where n<0  | Removes up to n spaces from each line<br/>where the same number of characters is removed<br/> from each non-blank line. | Multiplies two numeric values        | Yes                                    |
| stripIndent()        | Removes all leading incidental whitespace                                                                               | Divides one numeric value by another | No                                     |

### Translating Escapes

When we escape characters, we use a single backslash. For example, \t is a tab. If we don’t want this behavior, we add
another backslash to escape the backslash, so \\t is the literal string \t. The translateEscapes() method takes these
literals and turns them into the equivalent escaped character.

    public String translateEscapes()

    var str = "1\\t2";
    System.out.println(str); // 1\t2
    System.out.println(str.translateEscapes()); // 1 2

This method can be used for escape sequences such as \t (tab), \n (new line), \s (space), \" (double quote), and \' (
single quote.)

### Checking for Empty or Blank Strings

Java provides convenience methods for whether a String has a length of zero or contains only whitespace characters.

    System.out.println(" ".isEmpty()); // false
    System.out.println("".isEmpty()); // true
    System.out.println(" ".isBlank()); // true
    System.out.println("".isBlank()); // true

### Formatting Values

There are methods to format String values using formatting flags.

    public static String format(String format, Object args...)
    public static String format(Locale loc, String format, Object args...) 
    public String formatted(Object args...)


    var name = "Kate";
    var orderId = 5;

    System.out.println("Hello " + name + ", order " + orderId + " is ready");
    System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
    System.out.println("Hello %s, order %d is ready".formatted(name, orderId));

| Symbol | Description                                                    |
|--------|----------------------------------------------------------------|
| %s     | Applies to any type, commonly String values                    | 
| %d     | Applies to integer values like int and long                    | 
| %f     | Applies to floating-point values like float and double         | 
| %n     | Inserts a line break using the system-dependent line separator | 

    var name = "James";
    var score = 90.25;
    var total = 100;
    System.out.println("%s:%n Score: %f out of %d".formatted(name, score, total));

Mixing data types may cause exceptions at runtime. For example, the following throws an exception because a
floating-point number is used when an integer value is expected:

    var str = "Food: %d tons".formatted(2.0); // IllegalFormatConversionException

**Using format() with Flags**

Besides supporting symbols, Java also supports optional flags between the % and the symbol character. In the previous
example, the floating-point number was printed as 90.250000. By default, %f displays exactly six digits past the
decimal. If you want to display only one digit after the decimal, you can use %.1f instead of %f. The format() method
relies on rounding rather than truncating when shortening numbers. For example, 90.250000 will be displayed as 90.3 (not
90.2) when passed to format() with %.1f.

The format() method also supports two additional features.You can specify the total length of output by using a number
before the decimal symbol. By default, the method will fill the empty space with blank spaces.You can also fill the
empty space with zeros by placing a single zero before the decimal symbol.The following examples use brackets, [], to
show the start/end of the formatted value:

    var pi = 3.14159265359;
    System.out.format("[%f]\n", pi); // [3.141593]
    System.out.format("[%12.8f]\n", pi); // [ 3.14159265]
    System.out.format("[%012f]\n", pi); // [00003.141593]
    System.out.format("[%12.2f]\n", pi); // [ 3.14]
    System.out.format("[%.3f]\n", pi); // [3.142]

## Method Chaining

Ready to put together everything you just learned about? It is common to call multiple methods as shown here:

    var start = "AniMaL ";
    var trimmed = start.trim();
    var lowercase = trimmed.toLowerCase(); 
    var result = lowercase.replace('a', 'A'); 
    System.out.println(result);
  
    String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
    System.out.println(result);

What do you think the result of this code is?

    String a = "abc";
    String b = a.toUpperCase();
    b = b.replace("B", "2").replace('C', '3');
    System.out.println("a=" + a); // abc
    System.out.println("b=" + b); // A23