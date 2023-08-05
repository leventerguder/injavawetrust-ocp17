package chapter07.understanding_polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UsingInterfaceReference {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("horse");
        System.out.println(animals.getClass());

        sortAndPrintZooAnimals(animals);
        System.out.println();

        List<String> animalsLinkedList = new LinkedList<>();
        animalsLinkedList.add("cat");
        animalsLinkedList.add("dog");
        animalsLinkedList.add("bird");
        animalsLinkedList.add("horse");
        System.out.println(animalsLinkedList.getClass());

        sortAndPrintZooAnimals(animalsLinkedList);
    }

    public static void sortAndPrintZooAnimals(List<String> animals) {
        Collections.sort(animals);
        for (String a : animals) System.out.println(a);
    }
}
