package chapter02.questions.q14;

public class Q14 {

//    Which of the following statements are correct? (Choose all that apply.)
//    A. The return value of an assignment operation expression can be void.
// ++   B. The inequality operator (!=) can be used to compare objects.
//    C. The equality operator (==) can be used to compare a boolean value with a numeric value.
//    D. During runtime, the & and | operators may cause only the left side of the expression to be evaluated.
// ++ E. The return value of an assignment operation expression is the value of the newly assigned variable.
//    F. In Java, 0 and false may be used interchangeably.
// ++   G. The logical complement operator (!) cannot be used to flip numeric values.

    void method1() {

        StringBuilder sb1 = new StringBuilder("object1");

        StringBuilder sb2 = new StringBuilder("object2");


        System.out.println(sb1 != sb2);
    }
}
