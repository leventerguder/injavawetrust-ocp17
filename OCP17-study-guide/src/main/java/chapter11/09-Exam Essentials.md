# Exam Essentials

**Understand the various types of exceptions.**

All exceptions are subclasses of java.lang.Throwable. Subclasses of java.lang.Error should never be caught. Only
subclasses of java.lang.Exception should be handled in application code.

**Differentiate between checked and unchecked exceptions.**

Unchecked exceptions do not need to be caught or handled and are subclasses of java.lang.RuntimeException or
java.lang.Error. All other subclasses of java.lang.Exception are checked exceptions and must be handled or declared.

**Understand the flow of a try statement.**

A try statement must have a catch or a finally block. Multiple catch blocks can be chained together, provided no
superclass exception type appears in an earlier catch block than its subclass. A multi-catch expression may be used to
handle multiple exceptions in the same catch block, provided one exception is not a sub- class of another. The finally
block runs last regardless of whether an exception is thrown.

**Be able to follow the order of a try-with-resources statement.**

A try-with-resources statement is a special type of try block in which one or more resources are declared and
automatically closed in the reverse of the order in which they are declared. It can be used with or without a catch or
finally block, with the implicit finally block always executed first.

**Be able to write methods that declare exceptions.**

Understand the difference between the throw and throws keywords and how to declare methods with exceptions. Know how to
correctly override a method that declares exceptions.

**Identify valid locale strings.**

Know that the language code is lowercase and mandatory, while the country code is uppercase and optional. Be able to
select a locale using a built-in constant, constructor, or builder class.

**Format dates, numbers, and messages.**

Be able to format dates, numbers, and messages into various String formats, and know how locale influences these
formats. Know how the various number formatters (currency, percent, compact) differ. Be able to write a custom date or
number formatter using symbols, including how to escape literal values.

**Determine which resource bundle Java will use to look up a key.**

Be able to create resource bundles for a set of locales using properties files. Know the search order that Java uses to
select a resource bundle and how the default locale and default resource bundle are considered. Once a resource bundle
is found, recognize the hierarchy used to select values.

