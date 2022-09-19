# Creating a main() Method

The main() method lets the JVM call our code. The simplest possible class with a main method looks like this;

```
public class Zoo {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

To compile and execute this code ;

```
javac Zoo.java
java Zoo
```

To compile Java code with the javac command, the file must have the extension .java. The name of the file must match the
name of the public class. The result is a file of bytecode with the same name but with a .class filename extension.
Remember that bytecode consists of instructions that the JVM knows how to execute. Notice that we must omit the .class
extension to run Zoo.class.

- Each file can contain only one public class.
- The filename must match the class name, including case, and have .java extension.
- If the Java class is an entry point for the program, it must contain a valid main() method.

The main() method's parameter list, represented as an array of java.lang.String objects. You can use any valid variable
name along with any of these three formats:

- String[] args
- String options[]
- String... friends

**Optional Modifiers in main() Methods**

While most modifiers, such as public and static are required for main() methods, there are some optional modifiers
allowed.
Both final modifiers are optional.

```
public final static void main(final String[] args){
}
```

## Passing Parameters to a Java Program

```
public class Zoo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
```

javac Zoo.java
java Zoo Bronx Zoo

The program correctly identifies the first two "words" as the arguments. Spaces are used to separate the arguments.

The output is what you might expect:

```
Bronx
Zoo
```

```
javac Zoo.java
java Zoo "San Diego" Boo
```

Now we have a space in the output:

```
San Diego
Boo
```

**Single-File Source-Code**

If you get tired of typing both javac and java every time you want to try a code example, there’s a shortcut.You can
instead run

```
java Zoo.java Bronx Boo
```

There is a key difference here. When compiling first, you omitted the .java extension when running java. When skipping
the explicit compilation step, you include this extension. This feature is called launching single-file source-code
programs and is useful for testing or for small programs.
