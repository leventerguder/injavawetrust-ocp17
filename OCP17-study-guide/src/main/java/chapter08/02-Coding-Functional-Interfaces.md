# Coding Functional Interfaces

A functional interface is an interface that contains a single abstract method. Officially known as a single abstract
method (SAM) rule.

## Defining A Functional Interface

Let’s take a look at an example of a functional interface and a class that implements it:

    @FunctionalInterface 
    public interface Sprint {
        public void sprint(int speed); 
    }

    public class Tiger implements Sprint {
        public void sprint(int speed) {
            System.out.println("Animal is sprinting fast! " + speed);
        }
    }

**The @FunctionalInterface Annotation**

The @FunctionalInterface annotation tells the compiler that you intend for the code to be a functional interface. If the
interface does not follow the rules for a functional interface, the compiler will give you an error.

    // @FunctionalInterface // DOES NOT COMPILE
    public interface Dance {
        void move();

        void rest();
    }

Consider the following four interfaces.

    public interface Dash extends Sprint {}

    public interface Skip extends Sprint { 
        void skip();
    }

    public interface Sleep {
        private void snore() {}
        default int getZzz() { return 1; }
    }

    public interface Climb {
        void reach();
        default void fall() {}
        static int getBackUp() { return 100; }
        private static boolean checkHeight() { return true; }
    }

All four of these are valid interfaces, but not all of them are functional interfaces.
The Dash interface is a functional interface because it extends the Sprint interface and inherits the single abstract
method sprint().

The Skip interface is not a valid functional interface because it has two abstract methods: the inherited sprint()
method and the declared skip() method.

The Sleep interface is also not a valid functional interface. Neither snore() nor getZzz() meets the criteria of a
single abstract method. Even though default methods function like abstract methods, in that they can be overridden in a
class implementing the interface, they are insufficient for satisfying the single abstract method requirement.

Finally, the Climb interface is a functional interface. Despite defining a slew of methods, it contains only one
abstract method: reach().

## Adding Object Methods

All classes inherit certain methods from Object. For the exam, you should know the following Object method signatures:

- public String toString()
- public boolean equals(Object)
- public int hashCode()

If a functional interface includes an abstract method with the same signature as a public method found in Object,
those methods do not count toward the single abstract method test. The motivation behind this rule is that any class
that implements the interface will inherit from Object, as all classes do, and therefore always implement these methods.

Is the Soar class a functional interface?

    public interface Soar { 
        abstract String toString();
    }

It is not. Since toString() is a public method implemented in Object, it does not count toward the single abstract
method test.

    public interface Dive {
        String toString();
        public boolean equals(Object o); 
        public abstract int hashCode(); 
        public void dive();
    }

The dive() method is the single abstract method, while the others are not counted since they are public methods defined
in the Object class.

Do you see why the following is not a valid functional interface?

    public interface Hibernate {
        String toString();

        public boolean equals(Hibernate o);

        public abstract int hashCode();

        public void rest();
    }   

Despite looking a lot like our Dive interface, the Hibernate interface uses equals(Hibernate) instead of equals(Object).
Because this does not match the method signature of the equals(Object) method defined in the Object class, this
interface is counted as containing two abstract methods: equals(Hibernate) and rest().