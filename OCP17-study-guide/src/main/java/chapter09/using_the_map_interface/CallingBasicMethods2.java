package chapter09.using_the_map_interface;

import java.util.HashMap;
import java.util.Map;

public class CallingBasicMethods2 {

    public static void main(String[] args) {

        hashMapExample();

    }

    private static void hashMapExample() {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key : map.keySet())
            System.out.print(key + ","); // koala,giraffe,lion,

        // System.out.println(map.contains("lion")); // DOES NOT COMPILE
        System.out.println(map.containsKey("lion")); // true
        System.out.println(map.containsValue("lion")); // false
        System.out.println(map.size()); // 3
        map.clear();
        System.out.println(map.size()); // 0
        System.out.println(map.isEmpty()); // true
    }


}
