package chapter09.questions.q04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Q04 {

    public static void main(String[] args) {

        // HashSet<Number> hs = new HashSet<Integer>(); // DOES NOT COMPILE
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        // List<> list = new ArrayList<String>(); // DOES NOT COMPILE
        // List<Object> values = new HashSet<Object>(); // DOES NOT COMPILE
        // List<Object> objects = new ArrayList<? extends Object>(); // DOES NOT COMPILE
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
