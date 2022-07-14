package chapter09.usingcommoncollectionapis;

import java.util.ArrayList;
import java.util.Collection;

public class RemovingData {

    public static void main(String[] args) {

        Collection<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("hawk")); // true
        System.out.println(birds); // [hawk]
    }
}
