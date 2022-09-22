# Creating Objects

## Calling Constructor

To create an instance of a class, all you have to is write new before the class name and add parentheses after it.

    Park p = new Park();

```
public class Chick {
    public Chick() {
        System.out.println("in constructor");
    }
}
```

There are two key points to note about the constructor: the name of the constructor matches the name of the class, and
there’s no return type.

    public class Chick {
        public void Chick() { } // NOT A CONSTRUCTOR
    }

The purpose of a constructor is to initialize fields, although you can put any code in there.
Another way to initialize fields is to do so directly on the line on which they’re declared.

    public class Chicken {
        int numEggs = 12; // initialize on line
        String name;
    
        public Chicken() {
            name = "Duke"; // initialize in constructor
        }
    }

## Reading and Writing Member Fields

It’s possible to read and write instance variables directly from the caller.

    public class Swan {
        int numberEggs; //instance variable
    
        public static void main(String[] args) {
            Swan mother = new Swan();
            mother.numberEggs = 1; // set variable
            System.out.println(mother.numberEggs); // read variable
        }
    }

You can even read values of already initialized fields on a line initializing a new field:

    public class Name {
        String first = "Theodore";
        
        String last = "Moose";
    
        String full = first + last;
    }

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

Counting code blocks is easy: you just count the number of pairs of braces. If there aren’t the same number of open ({)
and close (}) braces or they aren’t defined in the proper order, the code doesn’t compile.

## Following the Order of Initialization

When writing code that initializes fields in multiple places, you have to keep track of the order of initialization.

- Fields and instance initializer blocks are run in the order in which they appear in the file.
- The constructor runs after all fields and instance initializer blocks have run.

```
     public class ChickOrderInitialization {
    
      /*
      Order matters for the fields and blocks of code.
      You can’t refer to a variable before it has been defined:
      */
    
      /*
      {
      System.out.println(name); // DOES NOT COMPILE
      }
      */
    
    
        private String name = "Fluffy";
    
        {
            System.out.println("setting field");
        }
    
        public ChickOrderInitialization() {
            name = "Tiny";
            System.out.println("setting constructor");
        }
    
        public static void main(String[] args) {
            ChickOrderInitialization chick = new ChickOrderInitialization();
            System.out.println(chick.name);
        }
    
    }
```

Order matters for the fields and blocks of code. You can’t refer to a variable before it has been defined:

    { System.out.println(name); } // DOES NOT COMPILE 
    private String name = "Fluffy";

You should expect to see a question about initialization on the exam.

    public class Egg {

        /*
        Fields and blocks are run first in order, setting number to 3 and then 4.
        Then the constructor runs, setting number to 5.
         */
        public Egg() {
            number = 5;
        }
    
        public static void main(String[] args) {
            Egg egg = new Egg();
            System.out.println(egg.number);
        }
    
        private int number = 3;
    
        {
            number = 4;
        }
    }

Fields and blocks are run first in order, setting number to 3 and then 4. Then the constructor runs, setting number to
5. 