package chapter09.sortingdata;

import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {

    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));

        // Set<Rabbit> rabbits = new TreeSet<>();
        // rabbits.add(new Rabbit()); // ClassCastException

        Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id - r2.id);
        rabbits.add(new Rabbit());

    }
}
