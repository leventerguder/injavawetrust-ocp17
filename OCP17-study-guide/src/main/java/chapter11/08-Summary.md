# Summary

Exceptions can be divided into two categories: checked and unchecked. In Java, checked exceptions inherit Exception but
not RuntimeException and must be handled or declared. Unchecked exceptions inherit RuntimeException or Error and do not
need to be handled or declared. It is considered a poor practice to catch an Error.

You can create your own checked or unchecked exceptions by extending Exception or RuntimeException, respectively. You
can also define custom constructors and messages for your exceptions, which will show up in stack traces.

Automatic resource management can be enabled by using a try-with-resources statement to ensure that the resources are
properly closed. Resources are closed at the conclusion of the try block, in the reverse of the order in which they are
declared. A suppressed exception occurs when more than one exception is thrown, often as part of a finally block or
try-with- resources close() operation.

Java includes a number of built-in classes to format numbers and dates. We reviewed how to create custom formatters for
each. You should be able to read these custom formats when you encounter them on the exam.

Localization involves creating programs that adapt to change. You can create a Locale class with a required lowercase
language code and optional uppercase country code. For example, en and en_US are locales for English and U.S. English,
respectively. You need to know how to format number and date/time values based on locale, including the new
CompactNumberFormat class.

A ResourceBundle allows specifying key/value pairs in a properties file. Java goes through candidate resource bundles
from the most specific to the most general to find a match. If no matches are found for the requested locale, Java
switches to the default locale and then finally the default resource bundle. Once a matching resource bundle is found,
Java looks only in the hierarchy of that resource bundle to select values.

By applying the principles you learned about in this chapter to your own projects, you can build applications that last
longer, with built-in support for whatever unexpected events may arise.