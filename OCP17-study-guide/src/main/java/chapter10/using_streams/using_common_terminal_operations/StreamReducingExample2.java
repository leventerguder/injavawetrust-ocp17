package chapter10.using_streams.using_common_terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamReducingExample2 {

    public static void main(String[] args) {
        reduce1();
        reduce2();
        reduce4();
        reduce5();
    }

    private static void reduce1() {

        System.out.println("### reduce1 ###");
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6);
        int result = numbers.reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(result);
    }

    private static void reduce2() {

        System.out.println("### reduce2 ###");
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6);
        int result = numbers.reduce(0, Integer::sum);
        System.out.println(result);
    }

    private static void reduce3() {
        Stream<User> users = Stream.of(new User("John", 30), new User("Julie", 35));
        // int computedAges = users.reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge()); // DOES NOT COMPILE
    }

    private static void reduce4() {
        System.out.println("### reduce4 ###");
        Stream<User> users = Stream.of(new User("John", 30), new User("Julie", 35));
        int computedAges = users.reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
        System.out.println(computedAges);
    }

    private static void reduce5() {
        System.out.println("### reduce5 ###");
        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
        int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);
        System.out.println(computedAges);
    }

    static class User {
        private String name;

        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
