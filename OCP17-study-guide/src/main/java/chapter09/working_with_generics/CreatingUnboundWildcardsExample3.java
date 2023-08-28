package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class CreatingUnboundWildcardsExample3 {


    public static void main(String[] args) {

        throwArrayStoreException();
    }

    public static void sample() {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(42));

        // List<String> cannot be assigned to List<Object>.
        // Java is trying to protect us from ourselves with this one

        //List<Object> objects = numbers; // DOES NOT COMPILE
        //objects.add("forty two");
        //System.out.println(numbers.get(1));
    }

    public static void throwArrayStoreException() {

        Object[] objects = new Object[5];
        Integer[] integers = new Integer[5];
        integers[0] = 42;

        objects = integers;

        objects[1] = "forty two"; //  java.lang.ArrayStoreException: java.lang.String


    }
}
