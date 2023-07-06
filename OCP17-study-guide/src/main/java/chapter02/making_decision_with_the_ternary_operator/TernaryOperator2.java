package chapter02.making_decision_with_the_ternary_operator;

public class TernaryOperator2 {

    public static void main(String[] args) {

        int owl = 5;

        int food1 = owl < 4 ? owl > 2 ? 3 : 4 : 5;
        int food2 = (owl < 4 ? ((owl > 2) ? 3 : 4) : 5);

        System.out.println(food1);
        System.out.println(food2);

        owl = 1;
        int food3 = owl < 4 ? owl > 2 ? 3 : 4 : 5;

        System.out.println(food3);

    }
}
