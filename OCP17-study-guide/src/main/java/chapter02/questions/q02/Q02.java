package chapter02.questions.q02;

public class Q02 {


//    What data type (or types) will allow the following code snippet to compile? (Choose all that apply.)
//    byte apples = 5;
//    short oranges = 10;
//    _____ bananas = apples + oranges;
// ++   A. int
// ++   B. long
//    C. boolean
// ++   D. double
//    E. short
//    F. byte


    void method1() {
        byte apples = 5;
        short oranges = 10;
        int bananas = apples + oranges;
    }

    void method2() {
        byte apples = 5;
        short oranges = 10;
        long bananas = apples + oranges;
    }

    void method3() {
        byte apples = 5;
        short oranges = 10;
        double bananas = apples + oranges;
    }
}
