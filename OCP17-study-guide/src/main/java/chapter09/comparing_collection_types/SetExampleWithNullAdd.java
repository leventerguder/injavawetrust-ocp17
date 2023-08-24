package chapter09.comparing_collection_types;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExampleWithNullAdd {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(null);
        set.add(null);
        set.add(null);

        System.out.println(set);

        Set<LinkedHashSet> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(null); // NullPointerException

    }
}
