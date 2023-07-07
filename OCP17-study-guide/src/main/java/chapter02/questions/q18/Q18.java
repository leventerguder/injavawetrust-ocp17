package chapter02.questions.q18;

public class Q18 {

//    Which of the following can be used to change the order of operation in an expression? (Choose all that apply.)
//    A. [ ]
//    B. < >
// ++   C. ( )
//    D. \ /
//    E. { }
//    F. " "

//    Only parentheses, ( ), can be used to change the order of operation in an expression.

    public static void main(String[] args) {

        int number = 10 * 2 + 5;
        System.out.println(number);

        int number2 = 10 * (2 + 5);
        System.out.println(number2);
    }
}
