package chapter02.making_decision_with_the_ternary_operator;

public class TernaryOperator {


    private static void withoutTernary() {
        int owl = 5;
        int food;
        if (owl < 2) {
            food = 3;
        } else {
            food = 4;
        }
        System.out.println(food); // 4
    }

    private static void withTernary() {
        int owl = 5;
        int food = owl < 2 ? 3 : 4;
        System.out.println(food); // 4

    }

    public static void main(String[] args) {

        withoutTernary();
        withTernary();
    }
}
