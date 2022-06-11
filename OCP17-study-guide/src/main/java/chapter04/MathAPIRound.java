package chapter04;

public class MathAPIRound {

    public static void main(String[] args) {

        long low = Math.round(123.45); // 123
        long high = Math.round(123.50); // 124
        int fromFloat = Math.round(123.45f); // 123

        System.out.println(low);
        System.out.println(high);
        System.out.println(fromFloat);
    }
}
