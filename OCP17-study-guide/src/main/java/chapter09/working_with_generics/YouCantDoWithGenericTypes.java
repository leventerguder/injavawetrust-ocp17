package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class YouCantDoWithGenericTypes {

    public static void main(String[] args) {

    }
}

class Animal<T> {

//    T getAnimal() {
//        return new T(); // Type parameter 'T' cannot be instantiated directly
//    }

    void sample() {
        // T t = new T(); // DOES NOT COMPILE
        // T[] tArray = new T[10]; // DOES NOT COMPILE

        T t2;
        T[] tArray2;
    }

    void sample2(T t) {

        System.out.println(t instanceof String);
    }

    void sample3(List<T> list){

        // System.out.println(list instanceof ArrayList<Integer>); // DOES NOT COMPILE
        // System.out.println(list instanceof List<Integer>); // DOES NOT COMPILE
    }


    void sample4() {

        //Animal<int> animal = new Animal<>(); // DOES NOT COMPILE
        Animal<Integer> animalV2 = new Animal<>();

        //List<short> list = new ArrayList<>(); // DOES NOT COMPILE
        List<Short> listV2 = new ArrayList<>();
    }

    private T instanceVariable;
    // static T staticVariable; // DOES NOT COMPILE

    protected T[] arrayInstanceVariable;

    public Animal() {
    }

    public Animal(T instanceVariable, T[] arrayInstanceVariable) {
        this.instanceVariable = instanceVariable;
        this.arrayInstanceVariable = arrayInstanceVariable;
    }
}
