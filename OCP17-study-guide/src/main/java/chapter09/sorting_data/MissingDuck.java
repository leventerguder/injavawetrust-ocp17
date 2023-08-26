package chapter09.sorting_data;


import java.util.ArrayList;
import java.util.Collections;

public class MissingDuck implements Comparable<MissingDuck> {
    private String name;

    public int compareTo(MissingDuck quack) {
        if (quack == null)
            throw new IllegalArgumentException("Poorly formed duck!");
        if (this.name == null && quack.name == null)
            return 0;
        else if (this.name == null) return -1;
        else if (quack.name == null) return 1;
        else return name.compareTo(quack.name);
    }

    @Override
    public String toString() {
        return "MissingDuck{" +
                "name='" + name + '\'' +
                '}';
    }

    public MissingDuck(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<MissingDuck>();

        ducks.add(null); // java.lang.IllegalArgumentException: Poorly formed duck!
        ducks.add(new MissingDuck(null));
        ducks.add(new MissingDuck("Puddles"));
        ducks.add(new MissingDuck("Donald"));

        Collections.sort(ducks); // sort by name

        System.out.println(ducks);
    }
}