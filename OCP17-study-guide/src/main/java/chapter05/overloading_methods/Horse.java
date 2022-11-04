package chapter05.overloading_methods;

public class Horse {

    public static void walk(int[] ints) {
        System.out.println("int[]");
    }

    public static void walk(Integer[] integers) {
        System.out.println("Integer[]");
    }

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 5, 4};
        Horse.walk(numbers);

        Integer[] sizes = {10, 20, 30};

        Horse.walk(sizes);
    }
}
