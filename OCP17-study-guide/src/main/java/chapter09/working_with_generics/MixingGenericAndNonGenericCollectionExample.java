package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class MixingGenericAndNonGenericCollectionExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("jack");
        // names.add(100);

        legacyList(names);
        System.out.println(names);

        String name0 = names.get(0);
        System.out.println(name0);

        String name1 = names.get(1); // java.lang.ClassCastException

    }

    private static void legacyList(List legacy) {
        legacy.add(new StringBuilder("adam"));
        legacy.add(10);
    }
}
