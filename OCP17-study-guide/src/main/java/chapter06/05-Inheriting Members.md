# Inheriting Members

## Overriding a Method

In Java, overriding a method occurs when a subclass declares a new implementation for an inherited method with the same
signature and compatible return type.

Remember that a method signature is composed of the name of the method and method parameters. It does not include the
return type, access modifiers, optional specifiers, or any declared exceptions.

When you override a method, you may still reference the parent version of the method using the super keyword. In this
manner, the keywords this and super allow you to select between the current and parent versions of a method,
respectively.

    public class Marsupial {
        public double getAverageWeight() {
            return 50;
        }
    }

    public class Kangaroo extends Marsupial {
        public double getAverageWeight() {
            return super.getAverageWeight() + 20;
        }
    
        public static void main(String[] args) {
            System.out.println(new Marsupial().getAverageWeight()); // 50.0
            System.out.println(new Kangaroo().getAverageWeight()); // 70.0
        }

    }

**Method Overriding Infinite Calls**

You might be wondering whether the use of super in the previous example was required. For example, what would the
following code output if we removed the super keyword?

    public double getAverageWeight() {
        return getAverageWeight()+20; // StackOverflowError
    }

In this example, the compiler would not call the parent Marsupial method; it would call the current Kangaroo method.The
application will attempt to call itself infinitely and produce a StackOverflowError at runtime.

- The method in the child class must have the same signature as the method in the parent class.
- The method in the child class must be at least as accessible as the method in the parent class.
- The method in the child class may not declare a checked exception that is new or broader than the class of any
  exception declared in the parent class method.
- If the method returns a value, it must be the same or a subtype of the method in the parent class, known as covariant
  return types.

### Rule#1 Method Signatures

The first rule of overriding a method is somewhat self-explanatory. If two methods have the same name but different
signatures, the methods are overloaded, not overridden. Overloaded methods are considered independent and do not share
the same polymorphic properties as overridden methods.

### Rule #2: Access Modifiers

Let’s try an illustrative example:

    public class Camel {
      public int getNumberOfHumps() {
        return 1;
      }
    }

    class BactrianCamel extends Camel {
        private int getNumberOfHumps() { // DOES NOT COMPILE
            return 2;
        }
    }

### Rule #3: Checked Exceptions

The third rule says that overriding a method cannot declare new checked exceptions or checked exceptions broader than
the inherited method.

This is done for polymorphic reasons similar to limiting access modifiers. In other words, you could end up with an
object that is more restrictive than the reference type it is assigned to, resulting in a checked exception that is not
handled or declared.One implication of this rule is that overridden methods are free to declare any number of new
unchecked exceptions.

    public class Reptile {

      protected void sleep() throws IOException {
      }
  
      protected void hide() {
      }
  
      protected void exitShell() throws FileNotFoundException {
      }
    }

    public class GalapagosTortoise extends Reptile {
      public void sleep() throws FileNotFoundException {
      }
  
      // public void hide() throws FileNotFoundException {} // DOES NOT COMPILE
  
      // public void exitShell() throws IOException {} // DOES NOT COMPILE

    }

In this example, we have three overridden methods. These overridden methods use the more accessible public modifier,
which is allowed per our second rule for overridden methods. The first overridden method sleep() in GalapagosTortoise
compiles without issue because the declared exception is narrower than the exception declared in the parent class.

### Rule #4: Covariant Return Types

The overriding method must use a return type that is covariant with the return type of the inherited method.

    public class Rhino {
      protected CharSequence getName() {
          return "rhino";
      }
  
      protected String getColor() {
          return "grey, black, or white";
      }
    }


    public class JavanRhino extends Rhino {
      public String getName() {
        return "javan rhino";
      }
    
      public CharSequence getColor() { // DOES NOT COMPILE
          return "grey";
      }
    }

getColor() method does not compile because CharSequence is not a subtype of String. To put it another way, all String
values are CharSequence values, but not all CharSequence values are String values.

A simple test for covariance is the following: given an inherited return type A and an overriding return type B, can you
assign an instance of B to a reference variable for A without a cast? If so, then they are covariant. This rule applies
to primitive types and object types alike. If one of the return types is void, then they both must be void, as nothing
is covariant with void except itself.

**Marking Methods with the @Override Annotation**

An annotation is a metadata tag that provides additional information about your code. You can use the @Override
annotation to tell the compiler that you are attempting to override a method.

    public class Fish {
    
        public void swim() {
        }
    
    }

    public class Shark extends Fish {
      @Override
      public void swim() {
      }
    }

When used correctly, the annotation doesn’t impact the code. On the other hand, when used incorrectly, this annotation
can prevent you from making a mistake.The following does not compile because of the presence of the @Override
annotation:

## Redeclaring private Methods

What happens if you try to override a private method? In Java, you can’t override private methods since they are not
inherited. Just because a child class doesn’t have access to the parent method doesn’t mean the child class can’t define
its own version of the method. It just means, strictly speaking, that the new method is not an overridden version of the
parent class’s method.

    public class Beetle {
      private String getSize() {
          return "Undefined";
      }
    }

    public class RhinocerosBeetle extends Beetle {
      private int getSize() {
          return 5;
      }
    }

Notice that the return type differs in the child method from String to int. In this example, the method getSize() in the
parent class is redeclared, so the method in the child class is a new method and not an override of the method in the
parent class.

What if getSize() method was declared public in Beetle? In this case, the method in RhinocerosBeetle would be an invalid
override. The access modifier in RhinocerosBeetle is more restrictive, and the return types are not covariant.

## Hiding Static Methods

A static method cannot be overridden because class objects do not inherit from each other in the same way as instance
objects. On the other hand, they can be hidden. A hidden method occurs when a child class defines a static method with
the same name and signature as an inherited static method defined in a parent class.

Method hiding is similar to but not exactly the same as method overriding. The previous four rules for overriding a
method must be followed when a method is hidden. In addition, a new fifth rule is added for hiding a method:

- The method defined in the child class must be marked as static if it is marked as static in a parent class.

## Hiding Variables

A hidden variable occurs when a child class defines a variable with the same name as an inherited variable defined in
the parent class. This creates two distinct copies of the variable within an instance of the child class: one instance
defined in the parent class and one defined in the child class.

    class Carnivore {
      protected boolean hasFur = false;
    }


    public class Meerkat extends Carnivore {
      protected boolean hasFur = true;
      
          public static void main(String[] args) {
              Meerkat m = new Meerkat();
              Carnivore c = m;
              System.out.println(m.hasFur); // true
              System.out.println(c.hasFur); // false
          }
    }

## Writing final Methods

By marking a method final, you forbid a child class from replacing this method. This rule is in place both when you
override a method and when you hide a method.

    public class Bird {
      public final boolean hasFeathers() {
          return true;
      }
  
      public final static void flyAway() {
      }
    }

    public class Penguin extends Bird {
      public final boolean hasFeathers() { // DOES NOT COMPILE
        return false; 
      }
      public final static void flyAway() {
      } // DOES NOT COMPILE 
    }

In this example, the instance method hasFeathers() is marked as final in the parent class Bird, so the child class
Penguin cannot override the parent method, resulting in a compiler error. The static method flyAway() is also marked
final, so it cannot be hidden in the subclass. In this example, whether or not the child method uses the final keyword
is irrelevant—the code will not compile either way.