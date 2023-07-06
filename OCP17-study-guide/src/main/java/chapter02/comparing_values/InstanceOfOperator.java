package chapter02.comparing_values;

public class InstanceOfOperator {

    public static void main(String[] args) {

        Bird bird = new Bird();

        System.out.println("bird instanceof Bird : " + (bird instanceof Bird));
        System.out.println("bird instanceof Object :" + (bird instanceof Object));
        //System.out.println("bird instanceof Cat : " + (bird instanceof Cat)); // DOES NOT COMPILE , Inconvertible types; cannot cast
        // System.out.println("bird instanceof Dog : " + (bird instanceof Dog)); // DOES NOT COMPILE , Inconvertible types; cannot cast
        System.out.println("bird instanceof Flyable : " + (bird instanceof Flyable));
        System.out.println("bird instanceof Walkable : " + (bird instanceof Walkable));
        System.out.println();

        Object object = bird;
        // Cat cat = bird;
        // Dog dog = bird;
        Flyable flyable = bird;
        // Walkable walkable = bird;


        Cat cat = new Cat(); // Cat is a final class. Can not be extended.

        //System.out.println("cat instanceof Bird : " + (cat instanceof Bird)); // DOES NOT COMPILE
        System.out.println("cat instanceof Object : " + (cat instanceof Object));
        System.out.println("cat instanceof Cat : " + (cat instanceof Cat));
        // System.out.println("cat instanceof Dog : " + (cat instanceof Dog));  // DOES NOT COMPILE
        // System.out.println("cat instanceof Flyable : " + (cat instanceof Flyable)); // DOES NOT COMPILE
        // System.out.println("cat instanceof Walkable : " + (cat instanceof Walkable)); // DOES NOT COMPILE
        System.out.println();

        Bird chicken = new Chicken();

        System.out.println("chicken instanceof Chicken : " + (chicken instanceof Chicken));
        System.out.println("chicken instanceof Bird : " + (chicken instanceof Bird));
        System.out.println("chicken instanceof Object : " + (chicken instanceof Object));
        // System.out.println("chicken instanceof Cat : " + (chicken instanceof Cat)); //DOES NOT COMPILE
        // System.out.println("chicken instanceof Dog : " + (chicken instanceof Dog));  // DOES NOT COMPILE
        System.out.println("chicken instanceof Flyable : " + (chicken instanceof Flyable));
        System.out.println("chicken instanceof Walkable : " + (chicken instanceof Walkable));
    }
}

interface Flyable {

}

interface Walkable {
}

class Bird implements Flyable {

}

class Chicken extends Bird implements Walkable {
}

final class Cat {
}

class Dog {
}