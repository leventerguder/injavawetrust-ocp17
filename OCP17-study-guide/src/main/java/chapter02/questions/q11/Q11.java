package chapter02.questions.q11;

public class Q11 {

    public static void main(String[] args) {

        int sample1 = (2 * 4) % 3; //2
        int sample2 = 3 * 2 % 3; //0
        int sample3 = 5 * (1 % 2); //5
        System.out.println(sample1 + ", " + sample2 + ", " + sample3);

        /*
         * and % have the same operator precedence,
         * so the expression is evaluated from left to right unless parentheses are present.
         */
    }
}
