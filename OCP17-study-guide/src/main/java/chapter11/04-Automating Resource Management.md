# Automating Resource Management

## Introducing Try-with-Resources

Let’s take a look at a method that opens a file, reads the data, and closes it:

    public void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("myfile.txt");
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

Half the lines of code in this method are just closing a resource. And the more resources you have, the longer code
like this becomes.

To solve this, Java includes the try-with-resources statement to automatically close all resources opened in a try
clause. This feature is also known as automatic resource management, because Java automatically takes care of the
closing.

Let’s take a look at our same example using a try-with-resources statement:

    public void readFileV2(String file) {

        try (FileInputStream is = new FileInputStream(file)) {
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

Functionally, they are similar, but our new version has half as many lines. More importantly, though, by using a
try-with-resources statement, we guarantee that as soon as a connection passes out of scope, Java will attempt to
close it within the same method.

Behind the scenes, the compiler replaces a try-with-resources block with a try and finally block. We refer to this
“hidden” finally block as an implicit finally block since it is created and used by the compiler automatically. You can
still create a programmer-defined finally block when using a try-with-resources statement; just be aware that the
implicit one will be called first.

Unlike garbage collection, resources are not automatically closed when they go out of scope. Therefore, it is
recommended that you close resources in the same block of code that opens them. By using a try-with- resources statement
to open all your resources, this happens automatically.

## Basics of Try-with-Resources

Notice that one or more resources can be opened in the try clause. When multiple resources are opened, they are closed
in the reverse of the order in which they were created.

Also, notice that parentheses are used to list those resources, and semicolons are used to separate the declarations.

![](automatingresourcemanagement/the-syntax-of-a-basic-try-with-resources-statement.png)

Earlier in the chapter, you learned that a try statement must have one or more catch blocks or a finally block. A
try-with-resources statement differs from a try statement in that neither of these is required, although a developer may
add both. For the exam, you need to know that the implicit finally block runs before any programmer-coded ones.

## ConstructingTry-with-Resources Statements

Only classes that implement the AutoCloseable interface can be used in a try-with-resources statement. For example, the
following does not compile as String does not implement the AutoCloseable interface:

    try (String reptile = "lizard") {}

Inheriting AutoCloseable requires implementing a compatible close() method.

    interface AutoCloseable {
    public void close() throws Exception;
    }


    public class MyFileClass implements AutoCloseable {
        private final int num;
    
        public MyFileClass(int num) {
            this.num = num;
        }
    
        @Override
        public void close() {
            System.out.println("Closing: " + num);
        }
    }

In Chapter 14, you encounter resources that implement Closeable rather than AutoCloseable. Since Closeable extends
AutoCloseable, they are both supported in try-with-resources statements. The only difference between the two is that
Closeable’s close() method declares IOException, while AutoCloseable’s close() method declares Exception.

## Declaring Resources

While try-with-resources does support declaring multiple variables, each variable must be declared in a separate
statement. For example, the following do not compile:

    try (MyFileClass is = new MyFileClass(1),os=new MyFileClass(2)){
    }

    try (MyFileClass ab = new MyFileClass(1), MyFileClass cd = new MyFileClass(2)) {
    }

- The first example does not compile because it is missing the data type, and it uses a comma (,) instead of a
  semicolon (;).
- The second example does not compile because it also uses a comma (,) instead of a semicolon (;).
- Each resource must include the data type and be separated by a semicolon (;).

You can declare a resource using var as the data type in a try-with-resources statement, since resources are local
variables.

    try (var f = new BufferedInputStream(new FileInputStream("it.txt"))) { // Process file
    }

## Scope of Try-with-Resources

The resources created in the try clause are in scope only within the try block. This is another way to remember that the
implicit finally runs before any catch/finally blocks that you code yourself.

    try (Scanner s = new Scanner(System.in)) {
        s.nextLine();
    } catch (Exception e) {
        s.nextInt(); // DOES NOT COMPILE
    } finally {
        s.nextInt(); // DOES NOT COMPILE
    }

The problem is that Scanner has gone out of scope at the end of the try clause.
This is a nice feature. You can’t accidentally use an object that has been closed

## Following Order of Operations

When working with try-with-resources statements, it is important to know that resources are closed in the reverse of the
order in which they are created.

    try (MyFileClass bookReader = new MyFileClass(1);
         MyFileClass movieReader = new MyFileClass(2)) {
        System.out.println("Try Block");
        throw new RuntimeException();
    } catch (Exception e) {
        System.out.println("Catch Block");
    } finally {
        System.out.println("Finally Block");
    }

The output is as follows:

    Try Block 
    Closing: 2 
    Closing: 1 
    Catch Block 
    Finally Block

For the exam, make sure you understand why the method prints the statements in this order. Remember, the resources are
closed in the reverse of the order in which they are declared, and the implicit finally is executed before the
programmer-defined finally.