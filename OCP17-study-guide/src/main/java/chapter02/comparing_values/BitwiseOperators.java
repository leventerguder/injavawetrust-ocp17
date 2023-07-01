package chapter02.comparing_values;

public class BitwiseOperators {

    public static void main(String[] args) {


        int a = 10;  // 1010
        int b = 5;  //  0101

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);


        int c = 9; // 1001
        int d = 8; // 1000

        System.out.println(c & d);
        System.out.println(c | d);
        System.out.println(c ^ d);

    }
}
