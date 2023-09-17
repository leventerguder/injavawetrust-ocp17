package chapter11.recognizing_exception_classes;

public class StackOverflowErrorExample {

    public static void main(String[] args) {


        method1();
    }

    static void method1() {
        method2();
    }

    static void method2() {
        method1();
    }
}
