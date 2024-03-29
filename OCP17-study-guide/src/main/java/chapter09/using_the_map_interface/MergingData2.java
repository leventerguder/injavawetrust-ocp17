package chapter09.using_the_map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergingData2 {

    public static void main(String[] args) {

        // The merge() method also has logic for what happens if null values or missing keys are involved.

        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Sam", null);

        String tom = favorites.merge("Tom", "Skyride", mapper);
        String sam = favorites.merge("Sam", "Skyride", mapper);
        System.out.println(favorites); // {Tom=Skyride, Sam=Skyride}
        System.out.println(tom);
        System.out.println(sam);

        // Notice that the mapping function isn’t called. If it were, we’d have a NullPointerException.
        // The mapping function is used only when there are two actual values to decide between.
    }
}
