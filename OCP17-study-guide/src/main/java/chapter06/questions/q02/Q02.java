package chapter06.questions.q02;

public abstract class Q02 {

//    Which modifier pairs can be used together in a method declaration? (Choose all that apply.)
// ++   A. static and final
// ++   B. private and static
//    C. static and abstract
//    D. private and abstract
//    E. abstract and final
// ++   F. private and final

    static final void method1() {

    }

    private static void method2() {

    }

    // static abstract void method3() {} // DOES NOT COMPILE

    // private abstract void method4(){} // DOES NOT COMPILE

    // abstract final void method4() {} // DOES NOT COMPILE

    private final void method5() {}
}
