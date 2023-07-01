package chapter02.making_decision_with_the_ternary_operator;

public class TernaryOperator3 {

    public static void main(String[] args) {



        /*
        you should know that there is no requirement that second and
        third expressions in ternary operations have the same data types,
         */
        int stripes = 7;
        System.out.println((stripes > 5) ? 21 : "Zebra");

        Object obj = stripes > 5 ? 21 : "Zebra";
        System.out.println(obj);

        // int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE

    }
}
