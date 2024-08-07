package chapter09.using_the_map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergingData3 {

    public static void main(String[] args) {

        // The final thing to know about merge() is what happens when the mapping function is called and returns null.
        // The key is removed from the map when this happens:

        BiFunction<String, String, String> mapper = (v1, v2) -> null;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Bus Tour");

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String sam = favorites.merge("Sam", "Skyride", mapper);

        System.out.println(favorites); // {Tom=Bus Tour, Sam=Skyride}
        System.out.println(jenny);
        System.out.println(sam);

        // Tom was left alone since there was no merge() call for that key.
        // Sam was added since that key was not in the original list.
        // Jenny was removed because the mapping function returned null.
    }
}
