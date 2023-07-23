package chapter05.overloading_methods;

public class Glider2 {

    public static String glide(int i, int j) {
        return "1";
    }

    public static String glide(long i, long j) {
        return "2";
    }

    public static String glide(Integer i, Integer j) {
        return "3";
    }

    public static String glide(int... nums) {
        return "4";
    }

    public static void main(String[] args) {

        System.out.println(glide(1, 2));

    }
}
