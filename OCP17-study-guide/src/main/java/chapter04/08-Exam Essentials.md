# Exam Essentials

**Be able to determine the output of code using String.**

Know the rules for concatenating with String and how to use common String methods. Know that a String is immutable. Pay
special attention to the fact that indexes are zero-based and that the substring() method gets the string up until right
before the index of the second parameter.

**Be able to determine the output of code using StringBuilder.**

Know that a StringBuilder is mutable and how to use common StringBuilder methods. Know that substring() does not change
the value of a StringBuilder, whereas append(), delete(), and insert() do change it. Also note that most StringBuilder
methods return a reference to the current instance of StringBuilder.

**Understand the difference between == and equals().**

== checks object equality. equals() depends on the implementation of the object it is being called on. For the String
class, equals() checks the characters inside of it.

**Be able to determine the output of code using arrays.**

Know how to declare and instantiate one-dimensional and multidimensional arrays. Be able to access each element and know
when an index is out of bounds. Recognize correct and incorrect output when searching and sorting.

**Identify the return types of Math methods.**

Depending on the primitive passed in, the Math methods may return different primitive results.

**Recognize invalid uses of dates and times.**
LocalDate does not contain time fields, and LocalTime does not contain date fields. Watch for operations being performed
on the wrong time. Also watch for adding or subtracting time and ignoring the result. Be comfortable with date math,
including time zones and daylight saving time.