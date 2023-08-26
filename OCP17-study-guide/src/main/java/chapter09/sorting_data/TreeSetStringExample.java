package chapter09.sorting_data;

import java.util.TreeSet;

public class TreeSetStringExample {

    public static void main(String[] args) {

        TreeSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("Abc");
        sortedSet.add("zaa");
        sortedSet.add("AZc");
        sortedSet.add("abc");
        sortedSet.add("Zbc");
        sortedSet.add("1Zaz");
        sortedSet.add("1ZZz");
        // sortedSet.add(null); // NullPointerException
        System.out.println(sortedSet);
    }
}
