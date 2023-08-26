package chapter09.sorting_data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DuckV2 implements Comparable<DuckV2> {

    private String name;

    private int weight;

    public DuckV2(String name, int weight) {
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
    public int compareTo(DuckV2 d) {
        return name.compareTo(d.name); // sorts ascendingly by name
    }

    @Override
    public String toString() {
        return "DuckV2{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {

        localInnerClass();

        byWeightLambda();

        methodReference();
    }

    private static void localInnerClass() {

        System.out.println("### localInnerClass ###");
        Comparator<DuckV2> byWeight = new Comparator<>() {

            public int compare(DuckV2 d1, DuckV2 d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };

        var ducks = new ArrayList<DuckV2>();
        ducks.add(new DuckV2("Quack", 7));
        ducks.add(new DuckV2("Puddles", 10));
        ducks.add(new DuckV2("Donald", 5));
        Collections.sort(ducks); // sort by name

        System.out.println(ducks); // [Donald, Puddles, Quack]

        Collections.sort(ducks, byWeight);

        System.out.println(ducks); // [Donald, Quack, Puddles]
    }

    private static void byWeightLambda() {

        System.out.println("### byWeightLambda ###");

        Comparator<DuckV2> byWeight = (d1, d2) -> d1.getWeight() - d2.getWeight();

        var ducks = new ArrayList<DuckV2>();
        ducks.add(new DuckV2("Quack", 7));
        ducks.add(new DuckV2("Puddles", 10));
        ducks.add(new DuckV2("Donald", 5));
        Collections.sort(ducks); // sort by name

        System.out.println(ducks); // [Donald, Puddles, Quack]

        Collections.sort(ducks, byWeight);

        System.out.println(ducks); // [Donald, Quack, Puddles]
    }

    private static void methodReference() {

        System.out.println("### methodReference ###");

        Comparator<DuckV2> byWeight = Comparator.comparing(DuckV2::getWeight);

        var ducks = new ArrayList<DuckV2>();
        ducks.add(new DuckV2("Quack", 7));
        ducks.add(new DuckV2("Puddles", 10));
        ducks.add(new DuckV2("Donald", 5));
        Collections.sort(ducks); // sort by name

        System.out.println(ducks); // [Donald, Puddles, Quack]

        Collections.sort(ducks, byWeight);

        System.out.println(ducks); // [Donald, Quack, Puddles]
    }
}
