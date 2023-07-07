package chapter02.questions.q01;

public class Q01 {

//    Which of the following Java operators can be used with boolean variables? (Choose all that apply.)
// +  A. ==
//    B. +
//    C. --
// +   D. !
//    E. %
//    F. ~
// ++   G. Cast with (boolean)

    public static void main(String[] args) {

        boolean active = true; // Assignment Operator

        System.out.println(active == true); // Equality Operator

        System.out.println(!active); //Logical Complement Operator

        System.out.println((boolean) active); // Cast
    }
}
