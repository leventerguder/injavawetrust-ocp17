package chapter09.sorting_data;

import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {

    static class Rabbit {
        int id;

        public Rabbit(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Rabbit{" +
                    "id=" + id +
                    '}';
        }
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));

        // Set<Rabbit> rabbits = new TreeSet<>();
        // rabbits.add(new Rabbit()); // ClassCastException

        Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r2.id - r1.id);
        rabbits.add(new Rabbit(10));
        rabbits.add(new Rabbit(0));
        rabbits.add(new Rabbit(20));
        rabbits.add(new Rabbit(50));

        System.out.println(rabbits);

    }
}
