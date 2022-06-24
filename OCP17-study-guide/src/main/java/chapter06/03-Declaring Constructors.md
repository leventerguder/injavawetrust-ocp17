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

## Calling Parent Constructors with super()

The first statement of every constructor is a call to a parent constructor using super() or another constructor in the
class using this().

    public class Animal { 
        private int age;
        public Animal(int age) {
            super(); // Refers to constructor in java.lang.Object
            this.age = age; 
        }
    }

    public class Zebra extends Animal { 
        public Zebra(int age) {
            super(age); // Refers to constructor in Animal 
        }
        public Zebra() {
            this(4); // Refers to constructor in Zebra with int argument
        } 
    }

**super vs. super()**

Like this and this(), super and super() are unrelated in Java.The first, super, is used to reference members of the
parent class, while the second, super(), calls a parent constructor. Anytime you see the keyword super on the exam,
make sure it is being used properly.

Like calling this(), calling super() can only be used as the first statement of the constructor.

    public class Zoo {
        public Zoo() {
            System.out.println("Zoo created");
            super(); // DOES NOT COMPILE
        }
    }

    public class Zoo {
        public Zoo() {
            super();
            System.out.println("Zoo created");
            super(); // DOES NOT COMPILE
        }
    }

The first class will not compile because the call to the parent constructor must be the first statement of the
constructor. In the second code snippet, super() is the first statement of the constructor, but it is also used as the
third statement. Since super() can only be called once as the first statement of the constructor, the code will not
compile.

    public class Animal {
        private int age;
        private String name;
    
        public Animal(int age, String name) {
            super();
            this.age = age;
            this.name = name;
        }
    
        public Animal(int age) {
            super();
            this.age = age;
            this.name = null;
        }
    }

    public class Gorilla extends Animal {
        public Gorilla(int age) {
            super(age, "Gorilla"); // Calls the first Animal constructor
        }
    
        public Gorilla() {
            super(5); // Calls the second Animal constructor
        }
    }

In this example, the first child constructor takes one argument, age, and calls the parent constructor, which takes two
arguments, age and name. The second child constructor takes no arguments, and it calls the parent constructor, which
takes one argument, age. In this example, notice that the child constructors are not required to call matching parent
constructors. Any valid parent constructor is acceptable as long as the appropriate input parameters to the parent
constructor are provided.

### Understanding Compiler Enhancements

Java compiler automatically inserts a call to the no-argument constructor super() if you do not explicitly call this()
or super() as the first line of a constructor.

For example, the following three class and constructor definitions are equivalent, because the compiler will
automatically convert them all to the last example:

    public class Donkey {}
    
    public class Donkey {
        public Donkey() {}
    }

    public class Donkey {
        public Donkey() { 
            super();
        }
    }

### Default Constructor Tips and Tricks

What happens if we define a subclass with no constructors, or a subclass with a constructor that doesn’t include a
super() reference?

    public class Mammal {
        public Mammal(int age) 
        {
        }
    }

    public class Seal extends Mammal {} // DOES NOT COMPILE

    public class Elephant extends Mammal {
        public Elephant() {} // DOES NOT COMPILE
    } 

In these cases, the compiler will not help, and you must create at least one constructor in your child class that
explicitly calls a parent constructor via the super() command.

    public class Seal extends Mammal {
        public Seal() {
            super(6); // Explicit call to parent constructor
        }
    }

    public class Elephant extends Mammal {
        public Elephant() {
            super(4); // Explicit call to parent constructor
        }
    }

**super() Always Refers to the Most Direct Parent**
For constructors, though, super() always refers to the most direct parent. In this example, calling super() inside the
AfricanElephant class always refers to the Elephant class and never to the Mammal class.

We conclude this section by adding three constructor rules to your skill set:

- The first line of every constructor is a call to a parent constructor using super() or an overloaded constructor using
  this().
- If the constructor does not contain a this() or super() reference, then the compiler automatically inserts super()
  with no arguments as the first line of the constructor.
- If a constructor calls super(), then it must be the first line of the constructor.