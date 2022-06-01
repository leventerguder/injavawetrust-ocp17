package chapter02;

public class TernaryOperator {

    public static void main(String[] args) {
        int owl = 5;
        int food = owl < 2 ? 3 : 4;
        System.out.println(food); // 4


        int food1 = owl < 4 ? owl > 2 ? 3 : 4 : 5;
        int food2 = (owl < 4 ? ((owl > 2) ? 3 : 4) : 5);

        System.out.println(food1);
        System.out.println(food2);


        int stripes = 7;
        System.out.print((stripes > 5) ? 21 : "Zebra");

        // int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE

    }
}
