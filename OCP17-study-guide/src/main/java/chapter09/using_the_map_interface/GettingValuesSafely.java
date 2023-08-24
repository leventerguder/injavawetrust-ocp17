package chapter09.using_the_map_interface;

import java.util.HashMap;
import java.util.Map;

public class GettingValuesSafely {

    public static void main(String[] args) {
        Map<Character, String> map = new HashMap<>();
        map.put('x', "spot");

        System.out.println("X marks the " + map.get('x'));
        System.out.println("X marks the " + map.getOrDefault('x', ""));
        System.out.println("Y marks the " + map.get('y'));
        System.out.println("Y marks the " + map.getOrDefault('y', ""));
        System.out.println("Y marks the " + map.getOrDefault('z', "zone"));
    }
}
