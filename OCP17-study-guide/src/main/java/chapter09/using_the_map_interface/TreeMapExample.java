package chapter09.using_the_map_interface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(100, "value1");
        treeMap.put(10, "value2");
        treeMap.put(50, "value3");
        treeMap.put(40, "value4");
        treeMap.put(60, "value5");
        treeMap.put(5, "value6");

        //treeMap.put(null, "NullPointerException");
        treeMap.put(70, null);
        System.out.println(treeMap);
    }
}
