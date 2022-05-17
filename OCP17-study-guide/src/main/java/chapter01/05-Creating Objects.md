# Creating Objects

## Calling Constructor

To create an instance of a class, all you have to is write new before the class name and add parentheses after it.

```
public class Chick {
    public Chick() {
        System.out.println("in constructor");
    }
}
```

There are two key points to note about the constructor: the name of the constructor matches the name of the class, and
there’s no return type.

The purpose of a constructor is to initialize fields, although you can put any code in there.

## Reading and Writing Member Fields

It’s possible to read and write instance variables directly from the caller.

## Executing Instance Initializer Blocks

The code between the braces (sometimes called “inside the braces”) is called a code block.
Anywhere you see braces is a code block.

Sometimes code blocks are inside a method. These are run when the method is called. Other times, code blocks appear
outside a method. These are called instance initializers.

```
public class Bird {

    public static void main(String[] args) {
        {
            System.out.println("Feathers");
        }
    }

    {
        System.out.println("Snowy");
    }
}
```

There are four code blocks in this example: a class definition, a method declaration, an inner block, and an instance
initializer.

## Following the Order of Initialization

When writing code that initializes fields in multiple places, you have to keep track of the order of initialization.

- Fields and instance initializer blocks are run in the order in which they appear in the file.
- The constructor runs after all fields and instance initializer blocks have run.

Order matters for the fields and blocks of code. You can’t refer to a variable before it has been defined:
