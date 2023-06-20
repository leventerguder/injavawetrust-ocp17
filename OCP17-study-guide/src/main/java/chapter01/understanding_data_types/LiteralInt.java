package chapter01.understanding_data_types;

public class LiteralInt {

    public static void main(String[] args) {

        // long max = 3123456789; // DOES NOT COMPILE
        long max = 3123456789L; // Now Java knows it is a long

        // long literal = -2147483649; // DOES NOT COMPILE

        long literal = -2147483649l; // Watch out the "l"

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // 2147483648
    }


}
