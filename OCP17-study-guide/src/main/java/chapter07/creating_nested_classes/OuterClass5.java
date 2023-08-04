package chapter07.creating_nested_classes;

public class OuterClass5 {

    private String outerInstanceVariable = "I am an outer instance variable";
    private static String outerStaticVariable = "I am a static outer instance variable";

    private void outerMethod() {

    }

    private static void outerStaticMethod() {

    }

    static class StaticNested {
        void method() {
            //System.out.println(outerInstanceVariable);  // DOES NOT COMPILE
            System.out.println(outerStaticVariable);
            //outerMethod(); // DOES NOT COMPILE
            outerStaticMethod();
        }
    }

}
