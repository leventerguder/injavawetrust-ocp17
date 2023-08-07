package chapter07.creating_nested_classes;

public class OuterClass5 {

    private String outerInstanceVariable = "I am an outer instance variable";
    private static String outerStaticVariable = "I am a static outer instance variable";

    private void outerMethod() {
        System.out.println("outerMethod");
    }

    private static void outerStaticMethod() {
        System.out.println("outerStaticMethod");
    }

    static class StaticNested {
        void innerMethod() {
            //System.out.println(outerInstanceVariable);  // DOES NOT COMPILE
            System.out.println(outerStaticVariable);
            //outerMethod(); // DOES NOT COMPILE
            outerStaticMethod();

            OuterClass5 outerClass5 = new OuterClass5();
            System.out.println(outerClass5.outerInstanceVariable);
            outerClass5.outerMethod();
        }

        static void staticInnerMethod() {
            //System.out.println(outerInstanceVariable);  // DOES NOT COMPILE
            System.out.println(outerStaticVariable);
            //outerMethod(); // DOES NOT COMPILE
            outerStaticMethod();

            OuterClass5 outerClass5 = new OuterClass5();
            System.out.println(outerClass5.outerInstanceVariable);
            outerClass5.outerMethod();
        }
    }
}
