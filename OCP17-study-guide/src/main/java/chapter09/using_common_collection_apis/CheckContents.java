package chapter09.using_common_collection_apis;

import java.util.ArrayList;
import java.util.Collection;

public class CheckContents {

    public static void main(String[] args) {

        Collection<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        System.out.println(birds.contains("hawk")); // true
        System.out.println(birds.contains("robin")); // false
    }
}
