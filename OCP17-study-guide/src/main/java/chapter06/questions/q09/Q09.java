package chapter06.questions.q09;

public class Q09 {

//    Which of the following statements about overridden methods are true? (Choose all that apply.)
//    A. An overridden method must contain method parameters that are the same or covariant with the method parameters in the inherited method.
//++    B. An overridden method may declare a new exception, provided it is not checked.
//    C. An overridden method must be more accessible than the method in the parent class.
//    D. An overridden method may declare a broader checked exception than the method in the parent class.
//    E. If an inherited method returns void, then the overridden version of the method must return void.
//    F. None of the above
}


class SuperClass {

    void thisIsOverloaded(Number number) {
    }

    void overridden(Number number) {
    }
}

class SubClass extends SuperClass {

    void thisIsOverloaded(Integer number) {
    }

    void overridden(Number number) throws IllegalArgumentException {
    }
}