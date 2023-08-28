package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class CreatingUnboundWildcardsExample6 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();


        sampleMethod(strings);
        sampleMethod(integers);
        sampleMethod(objects);

        // sampleMethod2(strings); // DOES NOT COMPILE
        // sampleMethod2(integers); // DOES NOT COMPILE
        sampleMethod2(objects);
    }


    public static void sampleMethod(List<?> list) {
        // list.add(100); // DOES NOT COMPILE
    }

    public static void sampleMethod2(List<Object> list) {
        list.add(100);
    }

}
