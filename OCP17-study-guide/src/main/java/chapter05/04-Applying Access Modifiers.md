# Applying Access Modifiers

- private: Only accessible within the same class.
- Package access: private plus other members of the same package. Sometimes referred to as package-private or default
  access.
- protected: Package access plus access within subclasses.
- public: protected plus classes in the other packages.

## Private Access

Only code in the same class can call private methods or access private fields.

    package chapter05.applying_access_modifiers.pond.duck;
    
    public class FatherDuck {
    
        private String noise = "quack";
    
        private void quack() {
            System.out.println(noise); // private access is ok
        }
    }

Now we add another class:

    package chapter05.applying_access_modifiers.pond.duck;

    public class BadDuckling {
    
        public void makeNoise() {
            var duck = new FatherDuck();
            duck.quack();   // DOES NOT COMPILE
            System.out.print(duck.noise); // DOES NOT COMPILE
        }
    }

In the previous example, FatherDuck and BadDuckling are in separate files, but what if they were declared in the same
file? Even then, the code would still not compile as Java prevents access outside the class.

## Package Access

When there is no access modifier, Java assumes package access.

    package chapter05.applying_access_modifiers.pond.duck;

    public class MotherDuck {
    
        String noise = "quack";
    
        void quack() {
            System.out.print(noise);// package access is ok
        }
    }

The big difference is that MotherDuck lets other classes in the same package access members, whereas FatherDuck
doesn’t (due to being private).

    package chapter05.applying_access_modifiers.pond.duck;

    public class GoodDuckling {

    public void makeNoise() {
            var duck = new MotherDuck();
            duck.quack();   // package access is ok
            System.out.print(duck.noise); // package access is ok
        }
    }


    package chapter05.applying_access_modifiers.pond.swan;

    import chapter05.applying_access_modifiers.pond.duck.MotherDuck;
    
    public class BadCygnet {
    
        public void makeNoise() {
    
            var duck = new MotherDuck();
            duck.quack();   // DOES NOT COMPILE
            System.out.print(duck.noise); // DOES NOT COMPILE
        }
    } 

## Protected Access

Protected access allows everything that package access does, and more. The protected access modifier adds the ability to
access members of a parent class.

    public class Fish {}
    public class ClownFish extends Fish {}

By extending a class, the subclass gains access to all protected and public members of the parent class, as if they were
declared in the subclass. If the two classes are in the same package, then the subclass also gains access to all package
members.

    package chapter05.applying_access_modifiers.pond.shore;

    public class Bird {
    
        protected String text = "floating";
    
        protected void floatInWater() {
            System.out.println(text); // protected access is ok
        }
    }

Next, we create a subclass:

    package chapter05.applying_access_modifiers.pond.goose; //Different package than Bird

    import chapter05.applying_access_modifiers.pond.shore.Bird;
    
    public class Gosling extends Bird { // Gosling is a subclass of Bird
    
        public void swim() {
            floatInWater(); // protected access is ok
            System.out.println(text); // protected access is ok
        }
    
        public static void main(String[] args) {
            new Gosling().swim();
        }
    }

This is a simple subclass. It extends the Bird class. Extending means creating a subclass that has access to any
protected or public members of the parent class.

Remember that protected also gives us access to everything that package access does. This means a class in the same
package as Bird can access its protected members.

    package chapter05.applying_access_modifiers.pond.shore; //Same package as Bird

    public class BirdWatcher {

        public void watchBird() {
            Bird bird = new Bird();
            bird.floatInWater(); // protected access is ok
            System.out.print(bird.text); // protected access is ok
        }
    }

Since Bird and BirdWatcher are in the same package, BirdWatcher can access package members of the bird variable. The
definition of protected allows access to subclasses and classes in the same package.

Now let's try the same thing from a different package:

    package chapter05.applying_access_modifiers.pond.inland; // Different package than Bird

    import chapter05.applying_access_modifiers.pond.shore.Bird;
    
    public class BirdWatcherFromAFar { // Not a subclass of Bird
    
        public void watchBird() {
            Bird bird = new Bird();
            bird.floatInWater(); // DOES NOT COMPILE
            System.out.print(bird.text); // DOES NOT COMPILE
        }
    
    }

BirdWatcherFromAfar is not in the same package as Bird, and it doesn’t inherit from Bird. This means it is not allowed
to access protected members of Bird.

Got that? Subclasses and classes in the same package are the only ones allowed to access protected members.

There is one gotcha for protected access. Consider this class:

    package chapter05.applying_access_modifiers.pond.swan; // Different package than Bird

    import chapter05.applying_access_modifiers.pond.shore.Bird;
    
    public class Swan extends Bird { // Swan is a subclass of Bird

        public void swim() {
            floatInWater(); // protected access is ok
            System.out.print(text); // protected access is ok
        }
    
        public void helpOtherSwanSwim() {
            Swan other = new Swan();
            other.floatInWater(); // subclass access to superclass
            System.out.print(other.text);  // subclass access to superclass
        }
    
        public void helpOtherBirdSwim() {
            Bird other = new Bird();
            other.floatInWater(); // DOES NOT COMPILE
            System.out.print(other.text); // DOES NOT COMPILE
        }
    }

Looking at it a different way, the protected rules apply under two scenarios:

- A member is used without referring to a variable. In this case, we are taking advantage of inheritance, and protected
  access is allowed.
- A member is used through a variable. In this case, the rules for the reference type of the variable are what matter.
  If it is a subclass, protected access is allowed. This works for references to the same class or a subclass.

We’re going to try this again to make sure you understand what is going on. Can you figure out why these examples don’t
compile?

    package chapter05.applying_access_modifiers.pond.goose;
    
    public class GooseWatcher {
    
        public void watch() {
            Goose goose = new Goose();
            goose.floatInWater(); // DOES NOT COMPILE
            This code doesn’t compile because we are not in the goose object.
        }
    }

This code doesn’t compile because we are not in the goose object. The floatInWater() method is declared in Bird.
GooseWatcher is not in the same package as Bird, nor does it extend Bird. Goose extends Bird. That only lets Goose refer
to floatInWater(), not callers of Goose.

## Public Access

public means anyone can access the member from anywhere.

The Java module system redefines “anywhere,” and it becomes possible to restrict access to public code outside a
module. We cover this in more detail in Chapter 12, “Modules.” When given code samples, you can assume they are in the
same module unless explicitly stated otherwise.

    package chapter05.applying_access_modifiers.pond.duck;

        public class DuckTeacher {
    
        public String name = "helpful";
    
        public void swim() {
            System.out.print(name);
        }
    }

DuckTeacher allows acces to any class that wants it.

    package chapter05.applying_access_modifiers.pond.goose;

    import chapter05.applying_access_modifiers.pond.duck.DuckTeacher;
    
    public class LostDuckling {

        public void swim() {
            var teacher = new DuckTeacher();
            teacher.swim(); // allowed
            System.out.print("Thanks" + teacher.name); // allowed
        }
    }

## Reviewing Access Modifiers

![](applying_access_modifiers/access-modifiers-table.png)
