package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class CreatingLowerBoundedWildcardsExample3 {

    public static void main(String[] args) {

        List<Kangal> kangals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();

        List<? extends Dog> extendsDog1 = new ArrayList<Dog>();
        List<? extends Dog> extendsDog2 = new ArrayList<Kangal>();

        List<? extends Animal> extendsAnimal = new ArrayList<>();

        List<? super Kangal> superKangal = new ArrayList<>();
        List<? super Dog> superDog = new ArrayList<>();
        List<? super Animal> superAnimal = new ArrayList<>();

        // sampleMethod(kangals); // DOES NOT COMPILE
        sampleMethod(dogs);
        sampleMethod(animals);

        // sampleMethod(extendsDog1); // DOES NOT COMPILE
        // sampleMethod(extendsDog2); // DOES NOT COMPILE

        // sampleMethod(extendsAnimal); // DOES NOT COMPILE

        // sampleMethod(superKangal); // DOES NOT COMPILE
        sampleMethod(superDog);
        sampleMethod(superAnimal);

    }

    public static void sampleMethod(List<? super Dog> dogs) {
        dogs.add(new Kangal());
        dogs.add(new Dog());
        // dogs.add(new Animal()); // DOES NOT COMPILE
    }

    static class Animal {

    }

    static class Dog extends Animal {

    }

    static class Kangal extends Dog {

    }

    class Cat extends Animal {

    }
}
