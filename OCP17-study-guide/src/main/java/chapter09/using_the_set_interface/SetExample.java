package chapter09.using_the_set_interface;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        integerHashSetExample();

        stringHashSetExample();

        stringBuilderSetExample();

    }

    private static void stringBuilderSetExample() {
        Set<StringBuilder> cities = new HashSet<>();
        System.out.println(cities.add(new StringBuilder("Istanbul"))); // true
        System.out.println(cities.add(new StringBuilder("Berlin"))); // true
        System.out.println(cities.add(new StringBuilder("London"))); // true
        System.out.println(cities.add(new StringBuilder("Istanbul"))); // true
        System.out.println(cities.add(new StringBuilder("Istanbul"))); // true


        System.out.println(cities.size()); // 5
        System.out.println(cities); // unpredictable ; [Istanbul, Istanbul, Berlin, London, Istanbul]

        StringBuilder city1 = new StringBuilder("Istanbul");
        StringBuilder city2 = new StringBuilder("Istanbul");

        System.out.println("city1.equals(city2) : " + city1.equals(city2)); // false
    }

    private static void stringHashSetExample() {
        Set<String> cities = new HashSet<>();

        System.out.println(cities.add("Istanbul")); // true
        System.out.println(cities.add("Berlin"));   // true
        System.out.println(cities.add("London"));   // true
        System.out.println(cities.add("Istanbul")); // false


        System.out.println(cities.size());
        System.out.println(cities); // unpredictable ; [Berlin, London, Istanbul]

        String city1 = new String("Istanbul");
        String city2 = new String("Istanbul");

        System.out.println("city1.equals(city2) : " + city1.equals(city2)); // true
    }

    private static void integerHashSetExample() {
        System.out.println("integerHashSetExample");
        Set<Integer> numbers = new HashSet<>();
        System.out.println(numbers.add(10)); // true
        System.out.println(numbers.add(20)); // true
        System.out.println(numbers.add(30)); // true
        System.out.println(numbers.add(null)); // true
        System.out.println(numbers.add(10)); // false
        System.out.println(numbers.add(20)); // false
        System.out.println(numbers.add(30)); // false
        System.out.println(numbers.add(null)); // false

        System.out.println(numbers.size()); // 4
        System.out.println(numbers);  // unpredictable ;  [null, 20, 10, 30]

        Integer number1 = Integer.valueOf(10);
        Integer number2 = Integer.valueOf(10);

        System.out.println("number1.equals(number2) : " + number1.equals(number2)); // true
    }
}
