package chapter09.using_common_collection_apis;

import java.util.ArrayList;
import java.util.Collection;

public class RemovingData {

    public static void main(String[] args) {

        Collection<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // false
        System.out.println(birds.remove("hawk")); // true
        System.out.println(birds); // [hawk]


        Collection<String> cat = new ArrayList<>();
        cat.add("Tekir"); //[Tekir]
        cat.add("Pamuk"); //[Tekir, Pamuk]
        cat.add("Boncuk"); //[Tekir, Pamuk, Boncuk]
        System.out.println(cat.remove("Pamuk")); //true
        System.out.println(cat.remove("Pamuk")); //false
        System.out.println(cat);
    }
}
