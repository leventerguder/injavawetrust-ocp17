# Summary

This chapter is all about reading and writing data. We started by showing you how to create File from I/O and Path
from NIO.2. We then covered the functionality that works with both I/O and NIO.2 before getting into NIO.2-specific
APIs. You should be familiar with how to combine or resolve Path objects with other Path objects. Additionally,
NIO.2 includes Stream API methods that can be used to process files and directories. We discussed methods for listing a
directory, walking a directory tree, searching a directory tree, and reading the lines of a file.

We spent time reviewing various methods available in the Files helper class. As discussed, the name of the function
often tells you exactly what it does. We explained that most of these methods are capable of throwing an IOException,
and many take optional varargs enum values.

We then introduced I/O streams and explained how they are used to read or write large quantities of data. While there
are a lot of I/O streams, they differ on some key points:

- Byte vs. character streams
- Input vs. output streams
- Low-level vs. high-level streams

Often, the name of the I/O stream can tell you a lot about what it does. We visited many of the I/O stream classes that
you will need to know for the exam in increasing order of complexity. A common practice is to start with a low-level
resource or file stream and wrap it in a buffered I/O stream to improve performance. You can also apply a high-level
stream to manipulate the data, such as an object or print stream. We described what it means to be serializable in Java,
and we showed you how to use the object stream classes to persist objects directly to and from disk.

We explained how to read input data from the user using both the system stream objects and the Console class. The
Console class has many useful features, such as built-in support for passwords and formatting.

We also discussed how NIO.2 provides methods for reading and writing file metadata. NIO.2 includes two methods for
retrieving all of the file system attributes for a path in a single call without numerous round trips to the operating
system. One method requires a read-only attribute type, while the second method requires an updatable view type. It also
allows NIO.2 to support operating system–specific file attributes.