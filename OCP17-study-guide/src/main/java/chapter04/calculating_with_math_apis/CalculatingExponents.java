package chapter04.calculating_with_math_apis;

public class CalculatingExponents {

    public static void main(String[] args) {

        double squared1 = Math.pow(5, 2); // 25.0
        double squared2 = Math.pow(-5, 2); // 25.0

        double squared3 = Math.pow(12, 2);
        double squared4 = Math.pow(3, 3);

        System.out.println(squared1);
        System.out.println(squared2);
        System.out.println(squared3);
        System.out.println(squared4);

    }
}
