package chapter09.using_common_collection_apis;

import java.util.Collection;
import java.util.List;

public class Iterating {

    public static void main(String[] args) {
        Collection<String> cats = List.of("Annie", "Ripley");
        cats.forEach(System.out::println);
        cats.forEach(c -> System.out.println(c));
    }

}
