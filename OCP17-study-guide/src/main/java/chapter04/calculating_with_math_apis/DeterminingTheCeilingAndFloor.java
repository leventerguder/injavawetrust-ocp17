package chapter04.calculating_with_math_apis;

public class DeterminingTheCeilingAndFloor {

    public static void main(String[] args) {

        double c = Math.ceil(3.14); // 4.0
        double f = Math.floor(3.14); // 3.0

        System.out.println(c);
        System.out.println(f);

        System.out.println(Math.ceil(9.00001));
        System.out.println(Math.floor(9.9999));

        System.out.println(Math.round(9.00001));
        System.out.println(Math.round(9.9999));

    }
}
