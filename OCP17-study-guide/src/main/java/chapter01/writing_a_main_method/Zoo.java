package chapter01.writing_a_main_method;

// javac Zoo.java
// java Zoo

public class Zoo {

    // You can use any valid variable name along with any of these three formats:

    // String[] args
    // String options[]
    // String... friends

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

/*
To compile Java code with the javac command, the file must have the extension .java.
The name of the file must match the name of the public class.
The result is a file of bytecode with the same name but with a .class filename extension.
Remember that bytecode consists of instructions that the JVM knows how to execute.
Notice that we must omit the .class extension to run Zoo.class.
 */