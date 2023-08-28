package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismAndGenerics {

    public static void main(String[] args) {

        parentChildExample();

        numberIntegerExample();

        numberIntegerExample2();

        parentChildExample2();
    }

    private static void parentChildExample() {

        Parent parent = new Child();

        // List<Parent> list = new ArrayList<Child>(); // DOES NOT COMPILE

        Parent[] array = new Child[5];
    }

    private static void numberIntegerExample() {

        //  polymorphism applies here to only the "base" type. And by "base,"
        //  we mean the type of the collection class itself.

        List<Number> numbers1 = new ArrayList<Number>();
        ArrayList<Number> numbers2 = new ArrayList<Number>();
        List<Integer> numbers3 = new ArrayList<Integer>();
        List<Integer> numbers4 = new ArrayList<>();

        // List<Number> numbers5 = new ArrayList<Integer>(); // DOES NOT COMPILE
        // List<Number> numbers6 = new ArrayList<Long>();   // DOES NOT COMPILE

        Number[] numberArray1 = new Integer[3];
    }

    private static void numberIntegerExample2() {

        List<Number> numbers1 = new ArrayList<Number>();
        ArrayList<Number> numbers2 = new ArrayList<Number>();
        List<Integer> numbers3 = new ArrayList<Integer>();
        List<Integer> numbers4 = new ArrayList<>();

        sampleMethod(numbers1);
        sampleMethod(numbers2);
        // sampleMethod(numbers3); // DOES NOT COMPILE
        // sampleMethod(numbers4); // DOES NOT COMPILE


    }
    public static void parentChildExample2() {

        List<Parent> parents = new ArrayList<>();
        List<Child> children = new ArrayList<>();

        sampleMethod2(parents);
        // sampleMethod2(children); // DOES NOT COMPILE

    }

    public static void parentChildArrayExample() {


        Parent[] parents = new Parent[5];
        Child[] children = new Child[5];

        sampleMethod3(parents);
        sampleMethod3(children);
    }

    public static void sampleMethod(List<Number> numbers) {

    }

    public static void sampleMethod2(List<Parent> parents) {

    }

    public static void sampleMethod3(Parent[] array) {

    }

}

class Parent {

}

class Child extends Parent {

}