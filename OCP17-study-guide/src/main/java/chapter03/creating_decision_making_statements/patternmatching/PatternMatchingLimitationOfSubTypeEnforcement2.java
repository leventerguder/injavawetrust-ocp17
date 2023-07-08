package chapter03.creating_decision_making_statements.patternmatching;

public class PatternMatchingLimitationOfSubTypeEnforcement2 {

    public static void main(String[] args) {

        Animal animal = new Bird();
        patternMatchingMethodSample(animal);

        animal = new Horse();
        patternMatchingMethodSample(animal);

        patterMatchingMethodSample2(animal);
    }

    private static void patterMatchingMethodSample2(Animal animal) {
        Chicken chicken = new Chicken();

        if (chicken instanceof Bird) {
        }
        // if(chicken instanceof Bird chick) {} // DOES NOT COMPILE

        if (animal instanceof Bird) {
        }
        if (animal instanceof Bird bird) {
        }

        Bird bird = new Bird();

        // if (bird instanceof Animal animal) {} // DOES NOT COMPILE
        if (bird instanceof Animal) {
        }
    }

    private static void patternMatchingMethodSample(Animal animal) {
        if (animal instanceof Bird obj) {
            System.out.println("Bird object!");
        } else if (animal instanceof Dog obj) {
            System.out.println("Dog object!");
        } else if (animal instanceof Cat obj) {
            System.out.println("Cat object!");
        }//else if (animal instanceof Animal obj) { } // DOES NOT COMPILE
        else if (animal instanceof Walkable obj) {
            System.out.println("Walkable obj");
        }
    }
}

interface Flyable {

}

interface Walkable {
}

class Bird extends Animal implements Flyable {

}

class Chicken extends Bird implements Walkable {
}

final class Cat extends Animal {
}

class Dog extends Animal {
}

class Animal {
}

class Horse extends Animal implements Walkable {
}