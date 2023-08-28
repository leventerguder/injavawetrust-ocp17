package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class CreatingUnboundWildcardsExample2 {


    public static void sample() {

        List<Object> objects = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        // objects = strings; // DOES NOT COMPILE
        // objects = integers; // DOES NOT COMPILE
    }

    public static void arrays() {

        Object[] objects = new Object[5];
        String[] strings = new String[5];
        Integer[] integers = new Integer[5];

        objects = strings;
        objects = integers;

    }
}
