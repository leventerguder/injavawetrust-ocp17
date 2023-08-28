package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class AnimalGeneric {

    public static void checkAnimals(List<AnimalV2> animals) {
        for (AnimalV2 a : animals) {
            a.checkup();
        }
    }

    public static void addAnimal(List<AnimalV2> animals) {
        animals.add(new Dog());
    }


    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<Bird> birds = new ArrayList<Bird>();
        birds.add(new Bird());

        // checkAnimals(dogs); // send a List<Dog>   // DOES NOT COMPILE
        // checkAnimals(cats); // send a List<Cat>   // DOES NOT COMPILE
        // checkAnimals(birds); // send a List<Bird> // DOES NOT COMPILE

        List<AnimalV2> animals = new ArrayList<>();
        animals.add(new Cat());  // OK
        animals.add(new Dog());  // OK
        animals.add(new Bird());

        checkAnimals(animals);
        addAnimal(animals);
    }
}

class AnimalV2 {
    public void checkup() {

    }
}

class Dog extends AnimalV2 {
}

class Cat extends AnimalV2 {
}

class Bird extends AnimalV2 {
}