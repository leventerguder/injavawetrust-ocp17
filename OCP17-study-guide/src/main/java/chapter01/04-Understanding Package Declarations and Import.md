# Understanding Package Declarations and Imports

Java puts classes in packages. These are logical groupings for classes.
Suppose you try to compile this code:

    public class NumberPicker {

        public static void main(String[] args) {
            Random r = new Random(); // DOES NOT COMPILE
            System.out.println(r.nextInt(10));
        }
    }

The Java compiler helpfully gives you an error that looks like this:

    error: cannot find symbol

This error could mean you made a typo in the name of the class. You double-check and discover that you didn’t. The other
cause of this error is omitting a needed import statement.

    import java.util.Random; // import tells us where to find Random

## Packages

Java classes are grouped into packages. The import statement tells the compiler which package to look in to find a
class.

Package names are hierarchical like the mail as well. The postal service starts with the top level, looking at your
country first. You start reading a package name at the beginning too.

## Wildcards

Classes in the same package are often imported together. You can use a shortcut to import all the classes in a package.

    import java.util.*; // imports java.util.Random among other things

The * is a wildcard that matches all classes in the package. Every class in the java.util package is available to this
program when Java compiles it.
The import statement doesn’t bring in child packages, fields, or methods; it imports only classes directly under the
package.

Let’s say you wanted to use the class AtomicInteger in the java.util.concurrent.atomic package.
Which import or imports support this?

    import java.util.*;
    import java.util.concurrent.*;
    import java.util.concurrent.atomic.*;

Only the last import allows the class to be recognized because child packages are not included with the first two.

You might think that including so many classes slows down your program execution, but it doesn’t. The compiler figures
out what’s actually needed.

## Redundant Imports

We’ve been referring to System without an import every time we printed text, and Java found it just fine. There’s one
special package in the Java world called java.lang. This package is special in that it is automatically imported.

    import java.lang.System; // Redundant Import
    import java.lang.*; // Redundant Import
    import java.util.Random;
    import java.util.*; // Redundant Import

Lines 1 and 2 are redundant because everything in java.lang is automatically imported. Line 4 is also redundant in this
example because Random is already imported from java.util.Random. If line 3 wasn’t present, java.util.* wouldn’t be
redundant, though, since it would cover importing Random.

Which import statements do you think would work to get this code to compile?

    public class InputImports {
        public void read(Files files) {
            Paths.get("name"); 
        }
    }

There are two possible answers. The shorter one is to use a wildcard to import both at the same time.

    import java.nio.file.*;

    import java.nio.file.Files;
    import java.nio.file.Paths;

Now let’s consider some imports that don’t work.

    import java.nio.*; // NO GOOD - a wildcard only matches class names, not "file.Files"
    import java.nio.*.*; // NO GOOD - you can only have one wildcard and it must be at the end
    import java.nio.file.Paths.*; //  // NO GOOD - you cannot import methods only class names

## Naming Conflicts

One of the reasons for using packages is so that class names don’t have to be unique across all of Java. This means
you’ll sometimes want to import a class that can be found in multiple places.

You can write either import java.util.*; or import java.util.Date;
When the class name is found in multiple packages, Java gives you a compiler error.

```
public class Conflicts {
    Date date;
}
```

```
import java.util.*;
import java.sql.*; // causes Date declaration to not compile
```

When the class name is found in multiple packages, Java gives you a compiler error.

```
import java.util.Date; 
import java.sql.*;
```

If you explicitly import a class name, it takes precedence over any wildcards present. Java thinks, “The programmer
really wants me to assume use of the java.util.Date class.”

```
import java.util.Date; 
import java.sql.Date;
```

Java is smart enough to detect that this code is no good.

### If You Really Need to UseTwo Classes with the Same Name

Sometimes you really do want to use Date from two different packages. When this happens, you can pick one to use in
the import statement and use the other’s fully qualified class name. Or you can drop both import statements and always
use the fully qualified class name.

```
public class ConflictsBothDate {
    java.util.Date date;
    java.sql.Date sqlDate;
}

```

## Compiling and Running Code with Packages

Create first class /temp/packagea/ClassA.java
Create second class /temp/packageb/ClassB.java
Go to directory cd /temp

```
javac packagea/ClassA.java packageb/ClassB.java
```

### Compiling with Wildcards

You can use an asterisk to specify that you’d like to include all Java files in a directory.This is convenient when you
have a lot of files in a package. We can rewrite the previous javac command like this:

```
javac packagea/*.java packageb/*.java
```

Now that your code has compiled, you can run it by typing the following command:

```
java packageb.ClassB
```

## Compiling to Another Directory

By default, the javac command places the compiled in the same directory as the source code. It also provides an option
to place the class files into a different directory. The -d option specifies this target directory.

Java options are case sensitive. This means you can not pass -D instead of -d.

```
javac -d classes packagea/ClassA.java packageb/ClassB.java
```

To run the program, you specify the classpath so Java knows where to find the classes.

```
cd /temp
java -cp classes packageb.ClassB
java -classpath classes packageb.ClassB 
java --class-path classes packageb.ClassB
```

Notice that the last one requires two dashes (--), while the first two require one dash (-). If you have the wrong
number of dashes, the program will not run.

**Three Classpath Options**

You might wonder why there are three options for the classpath.The -cp option is the short form. Developers frequently
choose the short form because we are lazy typists.The -classpath and --class-path versions can be clearer to read but
require more typing.

Important javac options

|-cp <classpath>               |   Location of classes needed to compile the program |
| --- | --- |
|-classpath <classpath>        | |
|--class-path <classpath> |
|-d <dir>                 |          Directory in which to place generated class files|

Important java options

| -cp <classpath> | Location of classes needed to run the program -classpath <classpath> |
|-----------------|----------------------------------------------------------------------|
| --class-path    |                                                                      |
| <classpath>     |                                                                      |

## Compiling with JAR Files

A Java archive (JAR) file is like a ZIP file of mainly Java class files.

On Windows, you type the following:

```
java -cp ".;C:\temp\someOtherLocation;c:\temp\myJar.jar" myPackage.MyClass
```

And on macOS/Linux, you type this:

```
java -cp ".:/tmp/someOtherLocation:/tmp/myJar.jar" myPackage.MyClass
```

The period (.) indicates that you want to include the current directory in the classpath. The rest of the command says
to look for loose class files (or packages) in someOtherLocation and within myJar.jar. Windows uses semicolons (;) to
separate parts of the classpath; other operating systems use colons.

Just like when you’re compiling, you can use a wildcard (*) to match all the JARs in a directory. Here’s an example:

```
java -cp "C:\temp\directoryWithJars\*" myPackage.MyClass
```

## Creating a JAR File

The simplest commands create a jar containing the files in the current directory. You can use the short or long form for
each option.

```
jar -cvf myNewFile.jar .
jar --create --verbose --file myNewFile.jar .
```

Important jar options

| Option                              | Description                               |
|-------------------------------------|-------------------------------------------|
| -c<br/>--create                     | Creates a new JAR file                    |
| -v<br/>--verbose                    | Print details when working with JAR files |
| -f <fileName><br/>--file <fileName> | JAR filename                              | 
| -C <directory> | Directory containing files to be used to create the JAR |

## Ordering Elements in a Class

Ordering for declaring a class

| Element             | Example             | Required ? | Where does it go ?                                              | 
|---------------------|---------------------|------------|-----------------------------------------------------------------|
| Package declaration | package abc;        | No         | First line in the file<br/> (excluding comments or blank lines) |   
| import statements   | import java.util.*; | No         | Immediately after the package<br/>(if present)     |
| Top-level type declaration   | public class Util   | Yes        | Immediately after the import <br/>(if any) |
| Field declarations   | int value; | No         | Any top-level element within a class |
| Method declarations   | void method()| No         | Any top-level element within a class |