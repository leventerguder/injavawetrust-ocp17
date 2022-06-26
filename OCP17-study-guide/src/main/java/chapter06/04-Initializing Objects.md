# Initializing Objects

## Initializing Classes

The order of initialization for a class as follows:

- If there is a superclass Y of X, then initialize class Y first.
- Process all static variable declarations in the order in which they appear in the class.
- Process all static initializers in the order in which they appear in the class.

```
    public class Animal {
        static { System.out.print("A"); }
    }
    
    public class Hippo extends Animal {
        public static void main(String[] grass) {
            System.out.print("C"); 
            new Hippo();
            new Hippo();
            new Hippo();
        }
        static { System.out.print("B"); } 
     }
```

It prints ABC exactly once. Since the main() method is inside the Hippo class, the class will be initialized first,
starting with the superclass and printing AB. Afterward, the main() method is executed, printing C. Even though the
main() method creates three instances, the class is loaded only once.

**Why the Hippo Program Printed C After AB**

In the previous example, the Hippo class was initialized before the main() method was executed.This happened because our
main() method was inside the class being executed, so it had to be loaded on startup. What if you instead called Hippo
inside another program?

    public class HippoFriend {
      public static void main(String[] grass) {
        System.out.print("C");
        new Hippo(); }
    }

## Initializing final Fields

As you saw in Chapter 5, final static variables must be explicitly assigned a value exactly once. Fields marked final
follow similar rules.

    public class MouseHouse {
        private final int volume;
        private final String name = "The Mouse House"; // Declaration assignment 
        {
            volume = 10; // Instance initializer assignment
        }
    }

Unlike static class members, though, final instance fields can also be set in a constructor. The constructor is part
of the initialization process, so it is allowed to assign final instance variables. For the exam, you need to know one
important rule: by the time the con- structor completes, all final instance variables must be assigned a value exactly
once.

    public class MouseHouse2 {
        private final int volume;
        private final String name;

        public MouseHouse2() {
            this.name = "Empty House";
            volume = 10; // Instance initializer assignment
        }
    }

Unlike local final variables, which are not required to have a value unless they are actually used, final instance
variables must be assigned a value. If they are not assigned a value when they are declared or in an instance
initializer, then they must be assigned a value in the constructor declaration. Failure to do so will result in a
compiler error on the line that declares the constructor.

    public class MouseHouse3 {
    
        private final int volume;
        private final String type;
    
        {
            this.volume = 10;
        }
    
        public MouseHouse3(String type) {
            this.type = type;
        }

         public MouseHouse3() {
            this.volume = 2; // DOES NOT COMPILE
        }
    
    }

In this example, the first constructor that takes a String argument compiles. In terms of assigning values, each
constructor is reviewed individually, which is why the second constructor does not compile.

On the exam, be wary of any instance variables marked final. Make sure they are assigned a value in the line where they
are declared, in an instance initializer, or in a constructor. They should be assigned a value only once, and failure to
assign a value is considered a compiler error in the constructor.

What about final instance variables when a constructor calls another constructor in the same class? In that case, you
have to follow the flow carefully, making sure every final instance variable is assigned a value exactly once.
We can replace our previous bad constructor with the following one that does compile:

     public MouseHouse4() {
        this(null);
     }

This constructor does not perform any assignments to any final instance variables, but it calls the MouseHouse(String)
constructor, which we observed compiles without issue. We use null here to demonstrate that the variable does not need
to be an object value. We can assign a null value to final instance variables as long as they are explicitly set.

## Initializing Instances

We’ve covered class initialization and final fields, so now it’s time to move on to order of initialization for objects.

Initialize Instance of X

- Initialize class X if it has not been previously initialized.
- If there is a superclass Y of X, then initialize the instance of Y first.
- Process all instance variable declarations in the order in which they appear in the class.
- Process all instance initializers in the order in which they appear in the class.
- Initialize the constructor, including any overloaded constructors referenced with this().

Let’s try an example with no inheritance

    public class ZooTickets {
        private String name = "BestZoo";
    
        {
            System.out.print(name + "-");
        }
    
        private static int COUNT = 0;
    
        static {
            System.out.print(COUNT + "-");
        }
    
        static {
            COUNT += 10;
            System.out.print(COUNT + "-");
        }
    
        public ZooTickets() {
            System.out.print("z-");
        }
    
        public static void main(String... patrons) {
            new ZooTickets();
        }
    }

The output : 0-10-BestZoo-z-

Next, let’s try a simple example with inheritance:

    class Primate {
        public Primate() {
            System.out.print("Primate-");
         }
    }
        
    class Ape extends Primate {
        public Ape(int fur) {
         System.out.print("Ape1-");
        }
        
        public Ape() {
            System.out.print("Ape2-");
        }
    }
    
    public class Chimpanzee extends Ape {
        public Chimpanzee() {
            super(2);
            System.out.print("Chimpanzee-");
        }
        
        public static void main(String[] args) {
            new Chimpanzee();
        }
    }

The compiler inserts the super() command as the first statement of both the Primate and Ape constructors. The code will
execute with the parent constructors called first and yield the following output:

Primate-Ape1-Chimpanzee-

Notice that only one of the two Ape() constructors is called. You need to start with the call to new Chimpanzee() to
determine which constructors will be executed. Remember, constructors are executed from the bottom up, but since the
first line of every constructor is a call to another constructor, the flow ends up with the parent constructor executed
before the child constructor.

    public class Cuttlefish {
        private String name = "swimmy";
    
        {
            System.out.println(name);
        }
    
        private static int COUNT = 0;
    
        static {
            System.out.println(COUNT);
        }
    
        {
            COUNT++;
            System.out.println(COUNT);
        }
    
    
        public Cuttlefish() {
            System.out.println("Constructor");
        }
    
        public static void main(String[] args) {
            System.out.println("Ready");
            new Cuttlefish();
        }
    }

The output looks like this:

    0
    Ready
    swimmy
    1
    Constructor

Ready for a more difficult example, the kind you might see on the exam? What does the following output?

    class GiraffeFamily {
        static {
            System.out.print("A");
        }
    
        {
            System.out.print("B");
        }
    
        public GiraffeFamily(String name) {
            this(1);
            System.out.print("C");
        }
    
        public GiraffeFamily() {
            System.out.print("D");
        }
    
        public GiraffeFamily(int stripes) {
            System.out.print("E");
        }
    }
        
    public class Okapi extends GiraffeFamily {
        static {
            System.out.print("F");
        }

        public Okapi(int stripes) {
            super("sugar");
            System.out.print("G");
        }
    
        {
            System.out.print("H");
        }
    
        public static void main(String[] grass) {
            new Okapi(1);
            System.out.println();
            new Okapi(2);
        }
    }

We conclude this section by listing important rules you should know for the exam:

- A class is initialized at most once by the JVM before it is referenced or used.
- All static final variables must be assigned a value exactly once, either when they are declared or in a static
  initializer.
- All final fields must be assigned a value exactly once, either when they are declared, in an instance initializer, or
  in a constructor.
- Non-final static and instance variables defined without a value are assigned a default value based on their type.
- Order of initialization is as follows: variable declarations, then initializers, and finally constructors.
