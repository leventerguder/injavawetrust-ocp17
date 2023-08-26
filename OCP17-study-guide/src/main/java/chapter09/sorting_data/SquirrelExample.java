package chapter09.sorting_data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SquirrelExample {

    public static void main(String[] args) {

        multiFieldComparator();

        thenComparingInt();

        reversedMethod();

    }

    private static void multiFieldComparator() {

        List<Squirrel> squirrels = createSquirrels();

        // Collections.sort(squirrels); // DOES NOT COMPILE

        Collections.sort(squirrels, new MultiFieldComparator());

        System.out.println("### After Collections.sort ### ");

        squirrels.forEach(System.out::println);
    }


    private static void thenComparingInt() {
        List<Squirrel> squirrels = createSquirrels();

        Comparator<Squirrel> c = Comparator
                .comparing(Squirrel::getSpecies)
                .thenComparingInt(Squirrel::getWeight);

        // squirrels.sort(c);

        Collections.sort(squirrels, c);

        System.out.println("### After Collections.sort ### ");

        squirrels.forEach(System.out::println);
    }

    private static void reversedMethod() {
        List<Squirrel> squirrels = createSquirrels();

        Comparator<Squirrel> c = Comparator
                .comparing(Squirrel::getSpecies)
                .reversed();

        // squirrels.sort(c);

        Collections.sort(squirrels, c);

        System.out.println("### After Collections.sort ### ");

        squirrels.forEach(System.out::println);
    }


    private static List<Squirrel> createSquirrels() {
        Squirrel squirrel1 = new Squirrel(2, "red squirrel");
        Squirrel squirrel2 = new Squirrel(1, "gray squirrel");
        Squirrel squirrel3 = new Squirrel(5, "black squirrel");
        Squirrel squirrel4 = new Squirrel(3, "eastern gray squirrel");
        Squirrel squirrel5 = new Squirrel(4, "fox squirrel");
        Squirrel squirrel6 = new Squirrel(2, "fox squirrel");
        Squirrel squirrel7 = new Squirrel(3, "fox squirrel");


        List<Squirrel> squirrels = new ArrayList<>();
        squirrels.add(squirrel1);
        squirrels.add(squirrel2);
        squirrels.add(squirrel3);
        squirrels.add(squirrel4);
        squirrels.add(squirrel5);
        squirrels.add(squirrel6);
        squirrels.add(squirrel7);
        return squirrels;
    }
}
