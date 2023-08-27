package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class MixingGenericAndNonGenericCollectionExample2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("jack");
        legacyList(names);

        names.forEach(System.out::println); // java.lang.ClassCastException

    }

    private static void legacyList(List legacy) {
        legacy.add(new StringBuilder("adam"));
    }
}
