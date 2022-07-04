# Encapsulating Data with Records

Records are exciting because they remove a ton of boilerplate code.

## Understanding Encapsulation

A POJO, which stands for Plain Old Java Object, is a class used to model and pass data around, often with few or no
complex methods (hence the "plain" part of the definition). You might have also heard of a JavaBean, which is POJO
that has some additional rules applied.

    public class Crane {
        int numberEggs;
        String name;
        public Crane(int numberEggs, String name) {
        this.numberEggs = numberEggs;
            this.name = name; 
        }
    }

Encapsulation is a way to protect class members by restricting access to them. In Java, it is commonly implemented by
declaring all instance variables private.

Encapsulation is about protecting a class from unexpected use.

    public final class Crane {
        private final int numberEggs;
        private final String name;
    
        public Crane(int numberEggs, String name) {
            if (numberEggs >= 0) this.numberEggs = numberEggs; // guard condition
    
            else throw new IllegalArgumentException();
            this.name = name;
        }
    
        public int getNumberEggs() {
            return numberEggs;
        }
    
        public String getName() {
            return name;
        }
    }

You might have noticed that we marked the class and its instance variables final, and we don’t have any mutator methods,
or setters, to modify the value of the instance variables. That’s because we want our class to be immutable in addition
to being well encapsulated.

## Applying Records

    public record Crane (int numberEggs, String name) {}

A record is a special type of data-oriented class in which the compiler inserts boilerplate code for you.
As a bonus, the compiler inserts useful implementations of the Object methods equals(), hashCode(), and toString().
We’ve covered a lot in one line of code!

    var mommy = new Crane(4, "Cammy");
    System.out.println(mommy.numberEggs());
    System.out.println(mommy.name());

How does the compiler know what to do? Behind the scenes, it creates a constructor for you with the parameters in the
same order in which they appear in the record declaration. Omitting or changing the type order will lead to compiler
errors:

    var mommy1 = new Crane("Cammy", 4); // DOES NOT COMPILE 
    var mommy2 = new Crane("Cammy"); // DOES NOT COMPILE

For each field, it also creates an accessor as the field name, plus a set of parentheses. Unlike traditional POJOs or
JavaBeans, the methods don’t have the prefix get or is. Just a few more characters that records save you from having to
type! Finally, records override a number of methods in Object for you.

### Members Automatically Added to Records

**Constructor :** A constructor with the parameters in the same order as the record declaration

**Accessor method :** One accessor for each field

**equals :** A method to compare two elements that returns true if each field is equal in
terms of equals()

**hashCode :** A consistent hashCode() method using all of the fields.

**toString() :** A toString() implementation that prints each field of the record in a convenient, easy-to-read format.

    var father = new Crane(0, "Craig");
    System.out.println(father); // Crane[numberEggs=0, name=Craig]


    var copy = new Crane(0, "Craig");
    System.out.println(copy); // Crane[numberEggs=0, name=Craig] 
    System.out.println(father.equals(copy)); // true 
    System.out.println(father.hashCode() + ", " + copy.hashCode()); // 1007, 1007

It is legal to have a record without any fields. It is simply declared with the record keyword and parentheses:

    public record Crane() {}

## Understanding Record Immutability

As you saw, records don’t have setters. Every field is inherently final and cannot be modified after it has been written
in the constructor. In order to “modify” a record, you have to make a new object and copy all of the data you want to
preserve.

    var cousin = new Crane(3, "Jenny");
    var friend = new Crane(cousin.numberEggs(), "Janeice");

Just as interfaces are implicitly abstract, records are also implicitly final. The final modifier is optional but
assumed.

    public final record Crane(int numberEggs, String name) {}

Like enums, that means you can’t extend or inherit a record.

    public record BlueCrane() extends Crane {} // DOES NOT COMPILE

Also like enums, a record can implement a regular or sealed interface, provided it implements all of the abstract
methods.

    public interface Bird {
    }

    public record Crane2(int numberEggs, String name) implements Bird {
    }

Although well beyond the scope of this book, there are some good reasons to make data-oriented classes immutable.
Doing so can lead to less error-prone code, as a new object is established any time the data is modified. It also
makes them inherently thread-safe and usable in concurrent frameworks.

## Declaring Constructors

### The Long Constructor

First, we can just declare the constructor the compiler normally inserts automatically, which we refer to as the long
constructor.

The compiler will not insert a constructor if you define one with the same list of parameters in the same order. Since
each field is final, the constructor must set every field. For example, this record does not compile:

    // DOES NOT COMPILE
    public record Crane3(int numberEggs, String name) {
        public Crane3(int numberEggs, String name) {
        } 
    }

## Compact Constructors

Luckily, the authors of Java added the ability to define a compact constructor for records. A compact constructor is a
special type of constructor used for records to process validation and transformations succinctly. It takes no
parameters and implicitly sets all fields.

    public record Crane4(int numberEggs, String name) {

        public Crane4 {
            if (numberEggs < 0) throw new IllegalArgumentException();
            name = name.toUpperCase();
        }
    }

Java will execute the full constructor after the compact constructor. You should also remember that a compact
constructor is declared without parentheses, as the exam might try to trick you on this.

### Transforming Parameters

Compact constructors give you the opportunity to apply transformations to any of the input values.

    public record Crane5(int numberEggs, String name) {
        public Crane5 {
            if (name == null || name.length() < 1)
                throw new IllegalArgumentException();
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }
    }

While compact constructors can modify the constructor parameters, they cannot modify the fields of the record. For
example, this does not compile:

    public record Crane6(int numberEggs, String name) {
        public Crane6 {
            this.numberEggs = 10; // DOES NOT COMPILE
        }
    }

Removing the this reference allows the code to compile, as the constructor parameter is modified instead.

### Overloaded Constructors

ou can also create overloaded constructors that take a completely different list of parameters. They are more closely
related to the long-form constructor and don’t use any of the syntactical features of compact constructors.

    public record Crane7(int numberEggs, String name) {
        public Crane7(String firstName, String lastName) {
            this(0, firstName + " " + lastName);
        }
    }

The first line of an overloaded constructor must be an explicit call to another constructor via this(). If there are no
other constructors, the long constructor must be called.

Also, unlike compact constructors, you can only transform the data on the first line. After the first line, all of the
fields will already be assigned, and the object is immutable.

    public record Crane8(int numberEggs, String name) {
        public Crane8(int numberEggs, String firstName, String lastName) {
            this(numberEggs + 1, firstName + " " + lastName);
            numberEggs = 10; // NO EFFECT (applies to parameter, not instance field)
            this.numberEggs = 20; // DOES NOT COMPILE
        }
    }

You also can’t declare two record constructors that call each other infinitely or as a cycle.

    public record Crane9(int numberEggs, String name) {
        public Crane9(String name) {
            this(1); // DOES NOT COMPILE 
        }
    
        public Crane9(int numberEggs) {
            this(""); // DOES NOT COMPILE
        }
    }

## Customizing Records

Since records are data-oriented, we’ve focused on the features of records you are likely to use. Records actually
support many of the same features as a class. Here are some of the members that records can include and that you should
be familiar with for the exam:

- Overloaded and compact constructors.
- Instance methods including overriding any provided methods (accessors, equals(), hashCode(), toString()).
- Nested classes, interfaces, annotations, enum, and records.

The following overrides two instance methods using the optional @Override annotation.

    public record Crane10(int numberEggs, String name) {
        @Override
        public int numberEggs() {
            return 10;
        }
    
        @Override
        public String toString() {
            return name;
        }
    }

While you can add methods, static fields, and other data types, you cannot add instance fields outside the record
declaration, even if they are private. Doing so defeats the purpose of using a record and could break immutability!

    public record Crane11(int numberEggs, String name) {
        private static int type = 10;
        public int size; // DOES NOT COMPILE
        private boolean friendly; // DOES NOT COMPILE
    }

Records also do not support instance initializers. All initialization for the fields of a record must happen in a
constructor.

    public record Crane12(int numberEggs, String name) {

        // Records also do not support instance initializers.
        //    {
        //        System.out.println("DOES NOT COMPILE");
        //    }
    
        static {
            System.out.println("This is a static initializer...");
        }
    }
