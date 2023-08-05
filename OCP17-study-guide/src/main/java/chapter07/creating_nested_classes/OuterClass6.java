package chapter07.creating_nested_classes;

public class OuterClass6 {

    public static void main(String[] args) {
        OuterClass6 outer = new OuterClass6();
        outer.createALocalInner();
    }

    void createALocalInner() {

        // LocalInner localInner = new LocalInner(); /// DOES NOT COMPILE

        interface LocalInterface {
            void method();
        }
       final class LocalInner implements LocalInterface {

            void instanceMethod() {
                System.out.println("local-class-instance method");
            }

            static void staticMethod() {
                System.out.println("local-class-static method");
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
}
