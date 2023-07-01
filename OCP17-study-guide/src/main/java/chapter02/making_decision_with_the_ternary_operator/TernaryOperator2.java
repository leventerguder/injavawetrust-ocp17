package chapter02.making_decision_with_the_ternary_operator;

public class TernaryOperator2 {


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

        int owl = 5;

        int food1 = owl < 4 ? owl > 2 ? 3 : 4 : 5;
        int food2 = (owl < 4 ? ((owl > 2) ? 3 : 4) : 5);

        System.out.println(food1);
        System.out.println(food2);

        owl = 1;
        int food3 = owl < 4 ? owl > 2 ? 3 : 4 : 5;

        System.out.println(food3);

//
//        /*
//        you should know that there is no requirement that second and
//        third expressions in ternary operations have the same data types,
//         */
//        int stripes = 7;
//        System.out.print((stripes > 5) ? 21 : "Zebra");
//
//        // int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE

    }
}
