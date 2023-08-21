package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithGenericsExample1 {
    static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i); // ClassCastException
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add(new StringBuilder("Webby"));
        printNames(names);

        List<String> names2 = new ArrayList<String>();
        // names2.add(new StringBuilder("Webby")); // DOES NOT COMPILE
    }
}
