# Exam Essentials

**Understand files and directories.**

Files are records that store data within a persistent storage device, such as a hard disk drive, that is available after
the application has finished executing. Files are organized within a file system in directories, which in turn may
contain other directories. The root directory is the topmost directory in a file system.

**Be able to use File and Path.**

An I/O File instance is created by calling the constructor. It contains a number of instance methods for creating and
manipulating a file or directory. An NIO.2 Path instance is an immutable object that is commonly created from the
factory method Paths.get() or Path.of(). It can also be created from FileSystem, java.net.URI, or java.io.File
instances. The Path interface includes many instance methods for reading and manipulating the abstract path value.

**Distinguish between types of I/O streams.**

I/O streams are categorized by byte/character, input/output, and low-level/high-level. Byte streams operate on binary
data and have names that end with Stream, while character streams operate on text data and have names that end in Reader
or Writer. The InputStream and Reader classes are the topmost abstract classes that receive data, while the OutputStream
and Writer classes are the topmost abstract classes that send data. A low-level stream is one that operates directly on
the underlying resource, such as a file or network connection. A high-level stream operates on a low-level or other
high-level stream to filter data, convert data, or improve performance.

**Understand how to use Java serialization.**

A class is considered serializable if it implements the java.io.Serializable interface and contains instance members
that are either serializable or marked transient. All Java primitives and the String class are serializable. The
ObjectInputStream and ObjectOutputStream classes can be used to read and write a Serializable object from and to an I/O
stream, respectively.

**Be able to interact with the user.**

Be able to interact with the user using the system streams (System.out, System.err, and System.in) as well as the
Console class. The Console class includes special methods for formatting data and retrieving complex input such as
passwords.

**Manage file attributes.**

The NIO.2 Files class includes many methods for reading single file attributes, such as its size or whether it is a
directory, a symbolic link, hidden, etc. NIO.2 also supports reading all of the attributes in a single call. An
attribute type is used to support operating system–specific views. Finally, NIO.2 supports updatable views for modifying
selected attributes.
