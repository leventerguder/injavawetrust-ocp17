package chapter01.understanding_data_types;

public class SignedVsUnsigned {

    public static void main(String[] args) {

        /*
        The primary difference is that short is signed, which means it splits its range across the positive and negative integers.
        Alternatively, char is unsigned, which means its range is strictly positive, including 0.
         */

        short s1 = 100;
        short s2 = +300;
        short s3 = -500;
        short s4 = 0;

        char c1 = 100;
        char c2 = +400;
        char c3 = 0;
        // char c4 = -1; // DOES NOT COMPILE


        System.out.println(Short.MAX_VALUE); // 32767   // 2^15-1 -> 32768-1 = 32767
        System.out.println(Short.MIN_VALUE); // -32768


        System.out.println((int) Character.MAX_VALUE);  // 2^16-1 ->65535
        System.out.println((int) Character.MIN_VALUE);  // 0
    }
}
