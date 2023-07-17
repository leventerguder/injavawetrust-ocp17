package chapter04.calculating_with_math_apis;

public class FindingTheMinimumAndMaximum {

    public static void main(String[] args) {

        int first = Math.max(3, 7); // 7
        int second = Math.min(7, -9); // -9

        double third = Math.min(100.5, 200.5);
        float fourth = Math.max(10.2f, 10.22f);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
