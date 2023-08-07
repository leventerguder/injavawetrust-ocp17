package chapter07.creating_nested_classes;

public class OuterClass6 {

    public static void main(String[] args) {
        OuterClass6 outer = new OuterClass6();
        outer.createALocalInner();
    }

    private int outerInstanceVariable = 100;
    private static int outerStaticVariable = 200;

    void createALocalInner() {

        // LocalInner localInner = new LocalInner(); /// DOES NOT COMPILE

        interface LocalInterface {
            void method();
        }
        final class LocalInner implements LocalInterface {

            void instanceMethod() {
                System.out.println("local-class-instance method");
                System.out.println(outerInstanceVariable);
                System.out.println(outerStaticVariable);
            }

            static void staticMethod() {
                System.out.println("local-class-static method");
                // System.out.println(outerInstanceVariable); // DOES NOT COMPILE
                System.out.println(outerStaticVariable);
            }

            @Override
            public void method() {
                System.out.println("override!");
            }
        }

        LocalInner localInner = new LocalInner();

        localInner.instanceMethod();
        LocalInner.staticMethod();

    }

    void createALocalEnum() {

        enum Colors {
            RED, BLUE, YELLOW;
        }

        System.out.println(Colors.RED);
    }

    static void createALocalRecord() {

        record Person(String name, String surname) {
        }

        Person person = new Person("user", "admin");
    }

    static void createASealedClass() {

//        sealed class Animal {
//
//        }

        // Local class must not extend sealed class
//        final class Dog extends Animal {
//
//        }
    }
}
