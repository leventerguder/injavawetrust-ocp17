package chapter07.creating_nested_classes;

public class OuterClass {


    private String privateVariable = "OuterClass-instance-variable";
    private static String privateStatic = "OuterClass-static-variable";

    public static void main(String[] args) {
        OuterClass.InnerClass innerRef = new OuterClass().new InnerClass();
        innerRef.innerTestMethod();
        InnerClass.innerStaticMethod();
        System.out.println(innerRef.privateInnerVariable);
        System.out.println(InnerClass.privateStaticInnerVariable);
    }

    private void outerTestMethod() {
        System.out.println("Outer Test Method");
    }

    private static void outerStaticTestMethod() {
        System.out.println("Outer Static Test Method");
    }

    class InnerClass {
        private String privateInnerVariable = "InnerClass-instance-variable";
        private static String privateStaticInnerVariable = "InnerClass-static-variable";

        private void innerTestMethod() {
            System.out.println(privateVariable);
            outerTestMethod();
        }

        private static void innerStaticMethod() {
            System.out.println(privateStatic);
            outerStaticTestMethod();
        }
    }
}

