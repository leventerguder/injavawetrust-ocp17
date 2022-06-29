# Creating Abstract Classes

## Introducing Abstract Classes

An abstract class is a class declared with the abstract modifier that cannot be instantiated directly and may contain
abstract methods.

    public abstract class Canine {}

    public class Wolf extends Canine {}

    public class Fox extends Canine {}

    public class Coyote extends Canine {}

An abstract class can contain abstract methods. An abstract method is a method declared with the abstract modifier that
does not define a body. Put another way, an abstract method forces subclasses to override the method.

Why would we want this? Polymorphism, of course! By declaring a method abstract, we can guarantee that some version will
be available on an instance without having to specify what that version is in the abstract parent class.

    public abstract class Canine {
        public abstract String getSound();
        public void bark() { 
            System.out.println(getSound()); 
        }
    }

    public class Wolf extends Canine { 
        public String getSound() {
            return "Wooooooof!"; 
        }
    }

    public class Fox extends Canine {
        public String getSound() {
            return "Squeak!";
        }
    }

    ...

    public static void main(String[] p) {
        Canine w = new Fox();
        w.bark(); // Squeak!
    }

- Only instance methods can be marked abstract within a class, not variables, constructors, or static methods.
- An abstract method can only be declared in an abstract class.
- A non-abstract class that extends an abstract class must implement all inherited abstract methods.
- Overriding an abstract method follows the existing rules for overriding methods that you learned about earlier in the
  chapter.

Let’s see if you can spot why each of these class declarations does not compile:

    public class FennecFox extends Canine {
      public int getSound() {
        return 10;
      }
    }
   
    public class ArcticFox extends Canine {}

    public class Direwolf extends Canine { 
      public abstract rest();
      public String getSound() {
        return "Roof!"; 
      }
    }

    public class Jackal extends Canine { 
      public abstract String name; 
      public String getSound() {
        return "Laugh"; 
      }
    }

The FennecFox class does not compile because it is an invalid method override.
The ArcticFox class does not compile because it does not override the abstract getSound() method.
The Direwolf class does not compile because it is not abstract but declares an abstract method rest().
The Jackal class does not compile because variables cannot be marked abstract.

An abstract class is most commonly used when you want another class to inherit properties of a particular class, but you
want the subclass to fill in some of the implementation details.

Earlier, we said that an abstract class is one that cannot be instantiated. This means that if you attempt to
instantiate it, the compiler will report an exception.

    abstract class Alligator {
      public static void main(String... food) {
        var a = new Alligator(); // DOES NOT COMPILE
      }

## Declaring Abstract Methods

An abstract method is always declared without a body. It also includes a semicolon (;) after the method declaration.

An abstract class can include all of the same members as a non-abstract class, including variables, static and in-
stance methods, constructors, etc.

The following code compiles even though it doesn’t define any abstract methods:

    public abstract class Llama { 
      public void chew() {}
    }

For the exam, keep an eye out for abstract methods declared outside abstract classes, such as the following:

    public class Egret { // DOES NOT COMPILE 
      public abstract void peck();
    }

Like the final modifier, the abstract modifier can be placed before or after the access modifier in class and method
declarations :

    abstract public class Tiger {
      abstract public int claw();
    }

The abstract modifier cannot be placed after the class keyword in a class declaration or after the return type in a
method declaration.

    public class abstract Bear{ // DOES NOT COMPILE 
      public int abstract howl(); // DOES NOT COMPILE
    }

## Creating a Concrete Class

A concrete class is a non-abstract class. The first concrete subclass that extends an abstract class is required to
implement all inherited abstract methods.

Can you see why the following Walrus class does not compile?

    public abstract class Animal { 
      public abstract String getName();
    }

    public class Walrus extends Animal {} // DOES NOT COMPILE

In this example, we see that Animal is marked as abstract and Walrus is not, making Walrus a concrete subclass of
Animal. Since Walrus is the first concrete subclass, it must implement all inherited abstract methods—getName() in this
example.

    public abstract class Mammal { 
      abstract void showHorn(); 
      abstract void eatLeaf();
    }

    public abstract class Rhino extends Mammal { 
      void showHorn() {} // Inherited from Mammal
    }

    public class BlackRhino extends Rhino {
      void eatLeaf() {} // Inherited from Mammal
    }

Let’s try one more example. The following concrete class Lion inherits two abstract methods, getName() and roar()

    public abstract class Animal { 
      public abstract String getName();
    }

    public abstract class BigCat extends Animal {
      protected abstract void roar();
    }

    public class Lion extends BigCat {
      public String getName() {
          return "Lion";
      }
  
      public void roar() {
          System.out.println("The Lion lets out a loud ROAR!");
      }
    }

In this sample code, BigCat extends Animal but is marked as abstract; therefore, it is not required to provide an
implementation for the getName() method. The class Lion is not marked as abstract, and as the first concrete subclass,
it must implement all of the inherited abstract methods not defined in a parent class. All three of these classes
compile successfully.

## Creating Constructors in Abstract Classes

Even though abstract classes cannot be instantiated, they are still initialized through constructors by their
subclasses.

    public abstract class Mammal2 {
        abstract CharSequence chew();
    
        public Mammal2() {
            System.out.println(chew()); // Does this line compile?
        }
    }

    public class Platypus extends Mammal2 {
        String chew() {
            return "yummy!";
        }
    
        public static void main(String[] args) {
            new Platypus();
        }
    }

For the exam, remember that abstract classes are initialized with constructors in the same way as non-abstract classes.
For example, if an abstract class does not provide a constructor, the compiler will automatically insert a default
no-argument constructor.

## Spotting Invalid Declarations

The exam writers are fond of questions with methods marked as abstract for which an implementation is also defined. For
example, can you see why each of the following methods does not compile?

    public abstract class Turtle {
  
      public abstract long eat()  // DOES NOT COMPILE
      public abstract void swim() {}; // DOES NOT COMPILE
      public abstract int getAge() { //  DOES NOT COMPILE
          return 10;
      }
      
      public abstract void sleep; // DOES NOT COMPILE
      public void goInShell(); // DOES NOT COMPILE

}

- The first method, eat(), does not compile because it is marked abstract but does not end with a semicolon (;).
- The next two methods, swim() and getAge(), do not compile because they are marked abstract, but they provide an
  implementation block enclosed in braces ({})
- For the exam, remember that an abstract method declaration must end in a semicolon without any braces.
- The next method, sleep, does not compile because it is missing parentheses, (), for method arguments.
- The last method, goInShell(), does not compile because it is not marked abstract and therefore must provide a body
  enclosed in braces.

### abstract and final Modifiers

What would happen if you marked a class or method both abstract and final? If you mark something abstract, you intend
for someone else to extend or implement it. But if you mark something final, you are preventing anyone from extending or
implementing it. These concepts are in direct conflict with each other.

Due to this incompatibility, Java does not permit a class or method to be marked both abstract and final.

    public abstract final class Tortoise { // DOES NOT COMPILE
      public abstract final void walk(); // DOES NOT COMPILE
    }

### abstract and private Modifiers

A method cannot be marked as both abstract and private. This rule makes sense if you think about it. How would you
define a subclass that implements a required method if the method is not inherited by the subclass? The answer is that
you can’t, which is why the compiler will complain if you try to do the following:

    public abstract class Whale {
      private abstract void sing(); // DOES NOT COMPILE
    }

While it is not possible to declare a method abstract and private, it is possible (albeit redundant) to declare a method
final and private.

### abstract and static Modifiers

A static method can only be hidden, not overridden. It is defined as belonging to the class, not an instance of the
class. If a static method cannot be overridden, then it follows that it also cannot be marked abstract since it can
never be implemented.
