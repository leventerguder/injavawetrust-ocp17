# Working with Advanced APIs

## Manipulating Input Streams

All input stream classes include the following methods to manipulate the order in which data is read from an I/O stream:

    // InputStream and Reader
    public boolean markSupported()
    public void mark(int readLimit)
    public void reset() throws IOException 
    public long skip(long n) throws IOException

The mark() and reset() methods return an I/O stream to an earlier position. Before calling either of these methods, you
should call the markSupported() method, which returns true only if mark() is supported. The skip() method is pretty
simple; it basically reads data from the I/O stream and discards the contents.

Not all input stream classes support mark() and reset(). Make sure to call markSupported() on the I/O stream before
calling these methods, or an exception will be thrown at runtime.

### Marking Data

Assume that we have an InputStream instance whose next values are LION. Consider the following code snippet:

    public void readData(InputStream is) throws IOException {
        System.out.print((char) is.read()); // L
        if (is.markSupported()) {
            is.mark(100); // Marks up to 100 bytes
            System.out.print((char) is.read()); // I
            System.out.print((char) is.read()); // O
            is.reset(); // Resets stream to position before I
        }

        System.out.print((char) is.read()); // I
        System.out.print((char) is.read()); // O
        System.out.print((char) is.read());  // N
    }

The code snippet will output LIOION if mark() is supported and LION otherwise. It’s a good practice to organize your
read() operations so that the I/O stream ends up at the same position regardless of whether mark() is supported.

What about the value of 100 that we passed to the mark() method? This value is called the readLimit. It instructs the
I/O stream that we expect to call reset() after at most 100 bytes. If our program calls reset() after reading more than
100 bytes from calling mark(100), it may throw an exception, depending on the I/O stream class.

In actuality, mark() and reset() are not putting the data back into the I/O stream but are storing the data in a
temporary buffer in memory to be read again. Therefore, you should not call the mark() operation with too large a value,
as this could take up a lot of memory.

### Skipping Data

Assume that we have an InputStream instance whose next values are TIGERS. Consider the following code snippet:

    System.out.print((char) is.read()); // T
    is.skip(2); // Skips I and G
    is.read(); // Reads E but doesn't output it
    System.out.print((char) is.read()); // R
    System.out.print((char) is.read()); // S

This code prints TRS at runtime. We skipped two characters, I and G. We also read E but didn’t use it anywhere, so it
behaved like calling skip(1).

## Reviewing Manipulation APIs

![](working_with_advanced_apis/Common-IO-methods.png)

## Discovering File Attributes

### Checking for Symbolic Links

Earlier, we saw that the Files class has methods called isDirectory() and isRegularFile(), which are similar to the
isDirectory() and isFile() methods on File. While the File object can’t tell you if a reference is a symbolic link, the
isSymbolicLink() method on Files can.

It is possible for isDirectory() or isRegularFile() to return true for a symbolic link, as long as the link resolves to
a directory or regular file, respectively.

    System.out.print(Files.isDirectory(Paths.get("/canine/fur.jpg"))); 
    System.out.print(Files.isSymbolicLink(Paths.get("/canine/coyote"))); 
    System.out.print(Files.isRegularFile(Paths.get("/canine/types.txt")));

### Checking File Accessibility

In many file systems, it is possible to set a boolean attribute to a file that marks it hidden, readable, or executable.
The Files class includes methods that expose this information: isHidden(), isReadable(), isWriteable(), and
isExecutable().

    System.out.print(Files.isHidden(Paths.get("/walrus.txt")));
    System.out.print(Files.isReadable(Paths.get("/seal/baby.png")));
    System.out.print(Files.isWritable(Paths.get("dolphin.txt")));
    System.out.print(Files.isExecutable(Paths.get("whale.png")));

### Improving Attribute Access

Up until now, we have been accessing individual file attributes with multiple method calls. While this is functionally
correct, there is often a cost each time one of these methods is called. Put simply, it is far more efficient to ask the
file system for all of the attributes at once rather than performing multiple round trips to the file system.
Furthermore, some attributes are file system–specific and cannot be easily generalized for all file systems.

NIO.2 addresses both of these concerns by allowing you to construct views for various file systems with a single method
call. A view is a group of related attributes for a particular file system type. That’s not to say that the earlier
attribute methods that we just finished discussing do not have their uses. If you need to read only one attribute of a
file or directory, requesting a view is unnecessary.

### Understanding Attribute and View Types

NIO.2 includes two methods for working with attributes in a single method call: a read-only attributes method and an
updatable view method. For each method, you need to provide a file system type object, which tells the NIO.2 method
which type of view you are requesting. By updatable view, we mean that we can both read and write attributes with the
same object.

![](working_with_advanced_apis/The-attributes-and-view-types.png)

### Retrieving Attributes

The Files class includes the following method to read attributes of a class in a read- only capacity:

    public static <A extends BasicFileAttributes> A readAttributes( 
        Path path,
        Class<A> type,
        LinkOption... options) throws IOException

Applying it requires specifying the Path and BasicFileAttributes.class parameters.

    var path = Paths.get("/turtles/sea.txt");
    BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);

    System.out.println("Is a directory? " + data.isDirectory()); 
    System.out.println("Is a regular file? " +data.isRegularFile());
    System.out.println("Is a symbolic link? " + data.isSymbolicLink()); 
    System.out.println("Size (inbytes): " + data.size()); 
    System.out.println("Last modified: " + data.lastModifiedTime());

### Modifying Attributes

The following Files method returns an updatable view:

    public static <V extends FileAttributeView> V getFileAttributeView( 
        Path path,
        Class<V> type, 
        LinkOption... options)

We can use the updatable view to increment a file’s last modified date/time value by 10,000 milliseconds, or 10 seconds.

    // Read file attributes
    var path = Paths.get("/turtles/sea.txt"); 
    BasicFileAttributeView view = Files.getFileAttributeView(path,BasicFileAttributeView.class);
    BasicFileAttributes attributes = view.readAttributes();

    // Modify file last modified time
    FileTime lastModifiedTime = FileTime.fromMillis(attributes.lastModifiedTime().toMillis() + 10_000);
    view.setTimes(lastModifiedTime, null, null);

After the updatable view is retrieved, we need to call readAttributes() on the view to obtain the file metadata. From
there, we create a new FileTime value and set it using the setTimes() method:

    // BasicFileAttributeView instance method 
    public void setTimes(FileTime lastModifiedTime,FileTime lastAccessTime, FileTime createTime)

Not all file attributes can be modified with a view. For example, you cannot set a property that changes a file into a
directory. Likewise, you cannot change the size of the object without modifying its contents.

## Traversing a Directory Tree

A file system is commonly visualized as a tree with a single root node and many branches and leaves. In this model, a
directory is a branch or internal node, and a file is a leaf node.

Traversing a directory, also referred to as walking a directory tree, is the process by which you start with a parent
directory and iterate over all of its descendants until some condition is met or there are no more elements over which
to iterate.

**Don’t Use DirectoryStream and FileVisitor**

While browsing the NIO.2 Javadocs, you may come across methods that use the DirectoryStream and FileVisitor classes to
traverse a directory.These methods predate the existence of the Stream API and were even required knowledge for older
Java certification exams.

The best advice we can give you is to not use them.The newer Stream API–based methods are superior and accomplish the
same thing, often with much less code.

### Selecting a Search Strategy

Two common strategies are associated with walking a directory tree: a depth-first search and a breadth-first search.
A depth-first search traverses the structure from the root to an arbitrary leaf and then navigates back up toward the
root, traversing fully any paths it skipped along the way. The search depth is the distance from the root to current
node. To prevent endless searching, Java includes a search depth that is used to limit how many levels (or hops) from
the root the search is allowed to go.

Alternatively, a breadth-first search starts at the root and processes all elements of each particular depth before
proceeding to the next depth level. The results are ordered by depth, with all nodes at depth 1 read before all nodes at
depth 2, and so on. While a breadth-first search tends to be balanced and predictable, it also requires more memory
since a list of visited nodes must be maintained.

For the exam, you don’t have to understand the details of each search strategy that Java employs; you just need to be
aware that the NIO.2 Stream API methods use depth-first searching with a depth limit, which can be optionally changed.

### Walking a Directory

The Files class includes two methods for walking the directory tree using a depth-first search.

    public static Stream<Path> walk(Path start, FileVisitOption... options) throws IOException

    public static Stream<Path> walk(Path start, int maxDepth, FileVisitOption... options) throws IOException

The first walk() method relies on a default maximum depth of Integer.MAX_VALUE, while the overloaded version allows the
user to set a maximum depth. This is useful in cases where the file system might be large and we know the information we
are looking for is near the root.

The following getPathSize() method walks a directory tree and returns the total size of all the files in the directory:

    private long getSize(Path p) { 
        try {
            return Files.size(p); 
        } catch (IOException e) {
            throw new UncheckedIOException(e); 
        }
    }

    public long getPathSize(Path source) throws IOException { 
        try (var s = Files.walk(source)) {
        return s.parallel()
            .filter(p -> !Files.isDirectory(p)) 
            .mapToLong(this::getSize)
            .sum();
        }
    }

### Applying a Depth Limit

Let’s say our directory tree is quite deep, so we apply a depth limit by changing one line of code in our getPathSize()
method.

    try (var s = Files.walk(source, 5)) {

This new version checks for files only within 5 steps of the starting node. A depth value of 0 indicates the current
path itself. Since the method calculates values only on files, you’d have to set a depth limit of at least 1 to get a
nonzero result when this method is applied to a directory tree.

### Avoiding Circular Paths

Many of our earlier NIO.2 methods traverse symbolic links by default, with a NOFOLLOW_LINKS used to disable this
behavior. The walk() method is different in that it does not follow symbolic links by default and requires the
FOLLOW_LINKS option to be enabled. We can alter our getPathSize() method to enable following symbolic links by
adding the FileVisitOption:

    try (var s = Files.walk(source,FileVisitOption.FOLLOW_LINKS)) {

Worse yet, a symbolic link could lead to a cycle in which a path is visited repeatedly. A cycle is an infinite circular
dependency in which an entry in a directory tree points to one of its ancestor directories.

Be aware that when the FOLLOW_LINKS option is used, the walk() method will track all of the paths it has visited,
throwing a FileSystemLoopException if a path is visited twice.

## Searching a Directory

In the previous example, we applied a filter to the Stream<Path> object to filter the results, although there is a more
convenient method.

    public static Stream<Path> find(Path start,
        int maxDepth,
        BiPredicate<Path, BasicFileAttributes> matcher, 
        FileVisitOption... options) throws IOException

The find() method behaves in a similar manner as the walk() method, except that it takes a BiPredicate to filter the
data. It also requires a depth limit to be set. Like walk(), find() also supports the FOLLOW_LINK option.

The two parameters of the BiPredicate are a Path object and a BasicFileAttributes object, which you saw earlier in the
chapter. In this manner, Java automatically retrieves the basic file information for you, allowing you to write complex
lambda expressions that have direct access to this object. 

        Path path = Paths.get(".");
        long minSize = 1_000;
        try (var s = Files.find(path, 10,
                (p, a) -> a.isRegularFile()
                        && p.toString().endsWith(".java")
                        && a.size() > minSize)) {
            s.forEach(System.out::println);
        }