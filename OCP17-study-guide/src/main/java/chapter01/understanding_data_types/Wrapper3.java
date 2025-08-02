package chapter01.understanding_data_types;

public class Wrapper3 {

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("5", 16)); // 5
        System.out.println(Integer.valueOf("a", 16)); // 10
        System.out.println(Integer.valueOf("F", 16)); // 15
        System.out.println(Integer.valueOf("G", 16)); // NumberFormatException
    }
}
