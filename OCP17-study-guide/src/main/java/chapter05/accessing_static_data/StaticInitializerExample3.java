package chapter05.accessing_static_data;

import java.util.ArrayList;
import java.util.List;

public class StaticInitializerExample3 {

    private final static List<Integer> numbers = new ArrayList<>();

    static {
        System.out.println("static initializer - 1");
        numbers.add(10);
        numbers.add(20);
    }

    static {
        System.out.println("static initializer - 2");
        numbers.add(30);
        numbers.add(40);
    }

    public static void main(String[] args) {
        System.out.println("main method...");
        System.out.println(numbers);
    }
}
