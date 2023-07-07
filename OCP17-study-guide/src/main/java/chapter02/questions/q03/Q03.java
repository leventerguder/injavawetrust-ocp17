package chapter02.questions.q03;

public class Q03 {

//    What change, when applied independently, would allow the following code snippet to compile? (Choose all that apply.)
//    3: long ear = 10;
//    4: int hearing = 2 * ear;

//    A. No change; it compiles as is.
// ++    B. Cast ear on line 4 to int.
// ++    C. Change the data type of ear on line 3 to short.
// ++    D. Cast 2 * ear on line 4 to int.
//    E. Change the data type of hearing on line 4 to short.
//++    F. Change the data type of hearing on line 4 to long.


    // Cast ear on line 4 to int.
    void method1() {
        long ear = 10;
        int hearing = 2 * (int) ear;
    }

    void method2() {
        short ear = 10;
        int hearing = 2 * ear;
    }

    // Cast 2 * ear on line 4 to int.
    void method3() {
        long ear = 10;
        int hearing = (int) (2 * ear);
    }

    // Change the data type of hearing on line 4 to long.
    void method4() {
        long ear = 10;
        long hearing = 2 * ear;
    }
}
