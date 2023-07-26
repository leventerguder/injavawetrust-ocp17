package chapter06.questions.q03;

import chapter07.creating_nested_classes.A;

import java.util.ArrayList;
import java.util.List;

public class Q03 {

//    Which of the following statements about methods are true? (Choose all that apply.)
//    A. Overloaded methods must have the same signature.
//++    B. Overridden methods must have the same signature.
//++    C. Hidden methods must have the same signature.
//    D. Overloaded methods must have the same return type.
//    E. Overridden methods must have the same return type.
//    F. Hidden methods must have the same return type.

    void overloaded(int number) {
    }

    int overloaded(double number) {
        return 0;
    }
}

class SuperClass {


    CharSequence overridden(int number) {
        return new StringBuilder();
    }

    static List hidden() {
        return List.of();
    }
}

class SubType extends SuperClass {

    @Override
    String overridden(int number) {
        return "hello world";
    }

    static ArrayList hidden() {
        return new ArrayList();
    }
}
