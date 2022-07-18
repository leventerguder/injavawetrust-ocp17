package chapter09.usingthemapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CallingBasicMethods {

    public static void main(String[] args) {

        hashMapExample();

        System.out.println();

        treeMapExample();
    }

    private static void hashMapExample() {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key : map.keySet())
            System.out.print(key + ","); // koala,giraffe,lion,
    }

    private static void treeMapExample() {
        Map<String, String> map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key : map.keySet())
            System.out.print(key + ","); // giraffe,koala,lion,
    }


}
