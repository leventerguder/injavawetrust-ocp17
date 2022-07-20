package chapter09.sortingdata;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearchExample2 {

    public static void main(String[] args) {

        var names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        var index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println(index);
    }
}
