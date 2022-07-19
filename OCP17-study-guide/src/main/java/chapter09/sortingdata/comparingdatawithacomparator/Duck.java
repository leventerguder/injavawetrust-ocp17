package chapter09.sortingdata.comparingdatawithacomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Duck implements Comparable<Duck> {

    private String name;

    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name); // sorts ascendingly by name
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {

        Comparator<Duck> byWeight = new Comparator<Duck>() {

            public int compare(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };

        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks); // sort by name

        System.out.println(ducks); // [Puddles, Quack]

        Collections.sort(ducks, byWeight);

        System.out.println(ducks); // [Quack, Puddles]
    }
}
