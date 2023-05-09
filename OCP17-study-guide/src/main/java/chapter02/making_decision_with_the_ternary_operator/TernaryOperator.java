package chapter02.making_decision_with_the_ternary_operator;

public class TernaryOperator {

    public static void main(String[] args) {
        int owl = 5;
        int food = owl < 2 ? 3 : 4;
        System.out.println(food); // 4


        int food1 = owl < 4 ? owl > 2 ? 3 : 4 : 5;
        int food2 = (owl < 4 ? ((owl > 2) ? 3 : 4) : 5);

        System.out.println(food1);
        System.out.println(food2);


        /*
        you should know that there is no requirement that second and
        third expressions in ternary operations have the same data types,
         */
        int stripes = 7;
        System.out.print((stripes > 5) ? 21 : "Zebra");

        // int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE

    }
}
