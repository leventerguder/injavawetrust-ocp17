package chapter09.sorting_data;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStringBuilderKeyExample {

    public static void main(String[] args) {

        Map<StringBuilder, Integer> map = new TreeMap<>();

        map.put(new StringBuilder("jane"), 25);
        map.put(new StringBuilder("mike"), 20);
        map.put(new StringBuilder("george"), 30);
        map.put(new StringBuilder("jack"), 10);
        map.put(new StringBuilder("ken"), 40);
        map.put(new StringBuilder("angelica"), 5);

        System.out.println(map);
    }
}
