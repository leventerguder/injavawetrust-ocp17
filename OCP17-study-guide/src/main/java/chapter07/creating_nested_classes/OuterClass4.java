package chapter07.creating_nested_classes;

public class OuterClass4 {

    static class StaticNested {
        private String instanceVariable = "I am an instance variable";
        private static String staticVariable = "I am a static variable";

        void method() {
            System.out.println(instanceVariable);
            System.out.println(staticVariable);
            System.out.println("StaticNested method");
        }

        static void staticMethod() {
            // System.out.println(instanceVariable); // DOES NOT COMPILE
            System.out.println(staticVariable);
            System.out.println("StaticNested static method");
        }
    }

}
