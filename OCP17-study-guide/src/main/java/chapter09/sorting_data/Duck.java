package chapter09.sorting_data;

import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck> {

    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name); // sorts ascendingly by name
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        ducks.add(new Duck("Donald"));
        // ducks.add(null); // Causes Collections.sort throwing NullPointerException
        // ducks.add(new Duck(null)); // // Causes Collections.sort throwing NullPointerException
        Collections.sort(ducks); // sort by name

        System.out.println(ducks); // [Donald, Puddles, Quack]
    }
}
