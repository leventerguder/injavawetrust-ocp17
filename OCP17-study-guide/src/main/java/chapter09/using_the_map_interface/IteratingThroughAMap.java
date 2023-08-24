package chapter09.using_the_map_interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingThroughAMap {

    public static void main(String[] args) {

        // default void forEach(BiConsumer<? super K, ? super V> action)

        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');

        System.out.println("### map.forEach ###");
        map.forEach((k, v) -> System.out.println("key : " + k + " value: " + v));

        System.out.println("### values().forEach ###");
        map.values().forEach(System.out::println);

        System.out.println("### entrySet().forEach ###");
        map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        System.out.println("### map.keySet() for ###");
        Set<Integer> keys = map.keySet();

        for (Integer key : keys) {
            System.out.println("key : " + key + " value : " + map.get(key));
        }

        System.out.println("### map.values() for ###");
        Collection<Character> values = map.values();
        for (Character value : values) {
            System.out.println(value);
        }

        System.out.println("### map.entrySet() for ###");
        Set<Map.Entry<Integer, Character>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Character> entry : entrySet) {
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }

        System.out.println("### iterator() while ###");
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }
    }

}
