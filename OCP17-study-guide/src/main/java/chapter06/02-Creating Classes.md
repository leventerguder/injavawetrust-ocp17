# Creating Classes

## Extending a Class

Let’s create two files in the same package, Animal.java and Lion.java.

Animal.java

    public class Animal {
        private int age;
        protected String name;
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int newAge) {
            age = newAge;
        }
    }

Lion.java

    public class Lion extends Animal {
        protected void setProperties(int age, String n) {
            setAge(age);
            name = n;
        }
    
        public void roar() {
            System.out.print(name + ", age " + getAge() + ", says: Roar!");
        }
    
        public static void main(String[] args) {
            var lion = new Lion();
            lion.setProperties(3, "kion");
            lion.roar();
        }
    }

The age variable exists in the parent Animal class and is not directly accessible in the Lion child class. It is
indirectly accessible via the setAge() method. The name variable is protected, so it is inherited in the Lion class and
directly accessible.

    public void roar() {
        System.out.print("Lions age: " + age); // DOES NOT COMPILE 
    }

Remember when working with subclasses that private members are never inherited, and package members are only inherited
if the two classes are in the same package.

## Applying Class Access Modifiers

Like variables and methods, you can apply access modifiers to classes. As you might remember from Chapter 1, a top-level
class is one not defined inside another class. Also remember that a .java file can have at most one top-level class.

While you can only have one top-level class, you can have as many classes (in any order) with package access as you
want.

Bear.java

    class Bird {} 
    class Bear {} 
    class Fish {}

Trying to declare a top-level class with protected or private class will lead to a compiler error.

ClownFish.java

    protected class ClownFish{} // DOES NOT COMPILE

BlueTang.java

    private class BlueTang {} // DOES NOT COMPILE

## Accessing the this Reference

What happens when a method parameter has the same name as an existing instance variable? Let’s take a look at an
example.

    public class Flamingo {
        private String color = null;
    
        public void setColor(String color) {
            color = color;
        }
    
        public static void main(String... unused) {
            var f = new Flamingo();
            f.setColor("PINK");
            System.out.print(f.color);
        }
    }

Java uses the most granular scope, so when it sees color = color, it thinks you are assigning the method parameter value
to itself (not the instance variable).

The fix when you have a local variable with the same name as an instance variable is to use the this reference or
keyword. The this reference refers to the current instance of the class and can be used to access any member of the
class, including inherited members. It can be used in any instance method, constructor, or instance initializer block.
It cannot be used when there is no implicit instance of the class, such as in a static method or static initializer
block.

    public void setColor(String color) {
        this.color = color; // Sets the instance variable with method parameter
    }

Now let’s look at some examples that aren’t common but that you might see on the exam.

    public class Duck {
    
        private String color;
        private int height;
        private int length;
    
        public void setData(int length, int theHeight) {
            length = this.length; // Backwards -- no good!
            height = theHeight; // Fine, because a different name
            this.color = "white"; // Fine, but this. reference not necessary
        }
    
        public static void main(String[] args) {
    
            Duck b = new Duck();
            b.setData(1, 2);
            System.out.print(b.length + " " + b.height + " " + b.color);
        }
    }

## Calling the super Reference

In Java, a variable or method can be defined in both a parent class and a child class. This means the object instance
actually holds two copies of the same variable with the same underlying name. When this happens, how do we reference the
version in the parent class instead of the current class?

Reptile.java

    public class Reptile {
        protected int speed = 10;
    }

Crocodile.java

    public class Crocodile extends Reptile {
    
        protected int speed = 20;
    
        public int getSpeed() {
            return speed;
        }
    
        public static void main(String[] args) {
    
            var croc = new Crocodile();
            System.out.println(croc.getSpeed()); // 20
    
        }
    }

But what if we want the program to print the value in the Reptile class? Within the Crocodile class, we can access the
parent value of speed, instead, by using the super reference or keyword.

    public int getSpeed() {
        return super.speed; // causes the program to now print 10
    }

Let’s see if you’ve gotten the hang of this and super.

    public class Beetle extends Insect {

        protected int numberOfLegs = 6;
        short age = 3;
    
        public void printData() {
            System.out.println(this.label);
            System.out.println(super.label);
            System.out.println(this.age);
            //System.out.println(super.age); // DOES NOT COMPILE
            System.out.println(numberOfLegs);
        }
    
        public static void main(String[] args) {
    
            new Beetle().printData();
        }

    }

Since label is defined in the parent class, it is accessible via both this and super references.
The variable age is defined only in the current class, making it accessible via this but not super.
In this example, this.numberOfLegs and super.numberOfLegs refer to different variables with distinct values.

Since this includes inherited members, you often only use super when you have a naming conflict via inheritance. For
example, you have a method or variable defined in the current class that matches a method or variable in a parent class. 