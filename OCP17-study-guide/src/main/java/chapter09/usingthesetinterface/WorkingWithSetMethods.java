package chapter09.usingthesetinterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSetMethods {

    public static void main(String[] args) {
        hashSetMethod();
        System.out.println();
        treeSetMethod();
    }

    private static void hashSetMethod() {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);               //true
        boolean b2 = set.add(10);               //true
        boolean b3 = set.add(66);               //false
        boolean b4 = set.add(8);                //true
        set.forEach(System.out::println);
    }

    private static void treeSetMethod() {
        Set<Integer> set = new TreeSet<>();
        boolean b1 = set.add(66);               // true
        boolean b2 = set.add(10);               // true
        boolean b3 = set.add(66);               // false
        boolean b4 = set.add(8);                // true
        set.forEach(System.out::println);
    }
}
