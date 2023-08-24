package chapter09.using_the_map_interface;

import java.util.HashMap;
import java.util.Map;

public class PuttingIfAbsent {

    public static void main(String[] args) {

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);

        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        favorites.putIfAbsent("Tom", null);
        favorites.putIfAbsent("Jane", null);

        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Jane=null, Sam=Tram}

    }
}
