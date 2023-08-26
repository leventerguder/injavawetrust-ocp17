package chapter09.sorting_data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingAList {

    public static void main(String[] args) {

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy, hoppy]
        //bunnies.sort((b1, b2) -> b1.compareTo(b2));
        //bunnies.sort(String::compareTo);

       // bunnies.sort((b1, b2) -> Integer.compare(b1.length(), b2.length()));
       bunnies.sort(Comparator.comparingInt(String::length));
        System.out.println(bunnies); // [floppy, hoppy, long ear]

    }
}
