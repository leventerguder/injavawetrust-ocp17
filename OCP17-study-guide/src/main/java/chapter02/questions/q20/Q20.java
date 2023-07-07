package chapter02.questions.q20;

public class Q20 {

//    Which of the following statements about unary operators are true? (Choose all that apply.)
//++    A. Unary operators are always executed before any surrounding numeric binary or ternary
//    operators.
//    B. The - operator can be used to flip a boolean value.
//    C. The pre-increment operator (++) returns the value of the variable before the increment is applied.
//++    D. The post-decrement operator (--) returns the value of the variable before the decrement is applied.
//++    E. The ! operator cannot be used on numeric values.
//    F. None of the above

    // Unary operators have the highest order of precedence!

    void method1() {
        boolean bool = true;
        //System.out.println(-bool); // DOES NOT COMPILE
        System.out.println(!bool);
    }

    /*
     the pre-increment/pre-decrement operators return the new value of the variable,
     while the post-increment/post-decrement operators return the original variable
     */

    void method2() {
        int i = 10;
        System.out.println(i++); // 10

        int j = 10;
        System.out.println(++j); // 11
    }

    void method3() {

        int x = 20;
        //System.out.println(!x); // DOES NOT COMPILE
        System.out.println(~x);
    }
}
