package chapter13.questions.q13;


public class MyAnnotationTest {

    @MyAnnotation
    void method() {
    }

    @MyAnnotation(name = "admin")
    void method2() {
    }
}
