package chapter09.sorting_data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LegacyDuck implements Comparable {
    private String name;

    public int compareTo(Object obj) {
        LegacyDuck d = (LegacyDuck) obj; // cast because no generics
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {

        var ducks = new ArrayList();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        ducks.add(new Duck("Donald"));
        Collections.sort(ducks); // sort by name

        System.out.println(ducks); // [Donald, Puddles, Quack]
    }
}