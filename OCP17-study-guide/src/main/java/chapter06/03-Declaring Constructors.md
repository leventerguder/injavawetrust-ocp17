# Declaring Constructors

A constructor is a special method that matches the name of the class and has no return type.
It is called when a new instance of the class is created.

## Creating a Constructor

Let’s start with a simple constructor:

    public class Bunny { 
        public Bunny() {
            System.out.print("hop"); 
        }
    }

The name of the constructor, Bunny, matches the name of the class, Bunny, and there is no return type, not even void.
That makes this a constructor.

    public bunny() {} // DOES NOT COMPILE
    public void Bunny() {}

The first one doesn’t match the class name because Java is case-sensitive. Since it doesn’t match, Java knows it can’t
be a constructor and is supposed to be a regular method. However, it is missing the return type and doesn’t compile.
The second method is a perfectly good method but is not a constructor because it has a return type.

Like method parameters, constructor parameters can be any valid class, array, or prim- itive type, including generics,
but may not include var.

    public class Bonobo {
        public Bonobo(var food) { // DOES NOT COMPILE 
        }
    }

A class can have multiple constructors, as long as each constructor has a unique constructor signature. In this case,
that means the constructor parameters must be distinct. Like methods with the same name but different signatures,
declaring multiple constructors with different signatures is referred to as constructor overloading.

    public class Turtle {

        private String name;
    
        public Turtle() {
            name = "John Doe";
        }
    
        public Turtle(int age) {
        }
    
        public Turtle(long age) {
        }
    
        public Turtle(String newName, String... favoriteFoods) {
            name = newName;
        }
    }

Constructors are used when creating a new object. This process is called instantiation because it creates a new instance
of the class. A constructor is called when we write new followed by the name of the class we want to instantiate.

    new Turtle(15)

When Java sees the new keyword, it allocates memory for the new object. It then looks for a constructor with a matching
signature and calls it.

## The Default Constructor

Every class in Java has a constructor, whether you code one or not. If you don’t include any constructors in the class,
Java will create one for you without any parameters.

This Java-created constructor is called the default constructor and is added any time a class is declared without any
constructors. We often refer to it as the default no-argument constructor, for clarity.

    public class Rabbit {
        public static void main(String[] args) {
        new Rabbit(); // Calls the default constructor }
    }

In the Rabbit class, Java sees that no constructor was coded and creates one. The previous class is equivalent to the
following, in which the default constructor is provided and therefore not inserted by the compiler:

    public class Rabbit {
        public Rabbit() {}
        public static void main(String[] args) {
        new Rabbit(); // Calls the user-defined constructor }
    }

The default constructor has an empty parameter list and an empty body. It is fine for you to type this in yourself.
However, since it doesn’t do anything, Java is happy to generate it for you and save you some typing.

The compiler only inserts the default constructor when no constructors are defined.

    public class Rabbit1 {}
    
    public class Rabbit2 { 
        public Rabbit2() {}
    }

    public class Rabbit3 {
        public Rabbit3(boolean b) {}
    }
    
    public class Rabbit4 { 
        private Rabbit4() {}
    }

    public class RabbitsMultiply {

        public static void main(String[] args) {
            var r1 = new Rabbit1();
            var r2 = new Rabbit2();
            var r3 = new Rabbit3(true);
            //var r4 = new Rabbit4(); // DOES NOT COMPILE
        }
    }

Having only private constructors in a class tells the compiler not to provide a default no-argument constructor. It also
prevents other classes from instantiating the class. This is useful when a class has only static methods or the
developer wants to have full control of all calls to create new instances of the class.

## Calling Overloaded Constructors with this()

Since a class can contain multiple overloaded constructors, these constructors can actually call one another. Let’s
start with a simple class containing two overloaded constructors:

    public class Hamster {
        private String color;
        private int weight;
    
        public Hamster(int weight, String color) { // First constructor
            this.weight = weight;
            this.color = color;
        }
    
        public Hamster(int weight) { // Second constructor
            this.weight = weight;
            color = "brown";
        }
    }

So, how can you have a constructor call another constructor? You might be tempted to rewrite the first constructor as
the following:

    public Hamster(int weight) { // Second constructor 
        Hamster(weight, "brown"); // DOES NOT COMPILE
    }

What happens if we stick new before the constructor name?

    public Hamster(int weight) { // Second constructor
        new Hamster(weight, "brown"); // Compiles, but creates an extra object
    }

Java provides a solution: this()—yes, the same keyword we used to refer to instance members, but with parentheses. When
this() is used with parentheses, Java calls another constructor on the same instance of the class.

    public Hamster(int weight) { // Second constructor
        this(weight, "brown");
    }

Success! Now Java calls the constructor that takes two parameters, with weight and color set as expected.

**this vs. this()**

Despite using the same keyword, this and this() are very different.The first, this, refers to an instance of the class,
while the second, this(), refers to a constructor call within the class.The exam may try to trick you by using both
together, so make sure you know which one to use and why.

Calling this() has one special rule you need to know. If you choose to call it, the this() call must be the first
statement in the constructor. The side effect of this is that there can be only one call to this() in any constructor.

    public Hamster(int weight) {
        System.out.println("chew");
        // Set weight and default color
        this(weight, "brown"); // DOES NOT COMPILE 
    }

There’s one last rule for overloaded constructors that you should be aware of.

    public class Gopher {
        public Gopher(int dugHoles) {
            this(5); // DOES NOT COMPILE 
        }
    }

The compiler is capable of detecting that this constructor is calling itself infinitely.

    public class Gopher2 {

        public Gopher2() {
            // this(5); // DOES NOT COMPILE
        }
    
        public Gopher2(int dugHoles) {
            //this(); // DOES NOT COMPILE
        }
    }

The constructors call each other, and the process continues infinitely. Since the compiler can detect this, it reports
an error.

Here we summarize the rules you should know about constructors that we covered in this section.

- A class can contain many overloaded constructors, provided the signature for each is distinct.
- The compiler inserts a default no-argument constructor if no constructors are declared.
- If a constructor calls this(), then it must be the first line of the constructor.
- Java does not allow cyclic constructor calls.