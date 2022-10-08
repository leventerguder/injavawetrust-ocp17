package chapter03.constructing_for_loops;

import java.util.List;

public class ForEachStatement {

    public static void main(String[] args) {

        String[] names = new String[]{"Jack", "Joe", "Leo"};

        System.out.println("Printing traditional for loop...");
        printNames(names);

        System.out.println("Printing for each loop - array ...");
        printNamesForEach(names);

        System.out.println("Printing for each loop - list ...");
        printNamesForEach(List.of(names));
    }

    private static void printNames(String[] names) {
        for (int counter = 0; counter < names.length; counter++)
            System.out.println(names[counter]);
    }

    private static void printNamesForEach(String[] names) {
        for (var name : names)
            System.out.println(name);
    }

    private static void printNamesForEach(List<String> names) {
        for (var name : names)
            System.out.println(name);
    }
}
