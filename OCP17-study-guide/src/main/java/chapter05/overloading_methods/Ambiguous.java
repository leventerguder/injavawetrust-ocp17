package chapter05.overloading_methods;

public class Ambiguous {

    private static void fly(int a, long b) {
        System.out.println("int , long");
    }

    private static void fly(long a, int b) {
        System.out.println("long , int");
    }

    public static void main(String[] args) {

        // fly(1, 2); // DOES NOT COMPILE Ambiguous method call!
        fly(1L, 2);
        fly(1, 2L);
    }
}
