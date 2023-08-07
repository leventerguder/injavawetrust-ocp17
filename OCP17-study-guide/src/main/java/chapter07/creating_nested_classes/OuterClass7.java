package chapter07.creating_nested_classes;

public class OuterClass7 {

    private String privateVar = "I am an Outer variable!";

    private Integer number = 10;

    private void outerMethod() {
        System.out.println("I am an Outer method!");
    }

    public static void main(String[] args) {
        OuterClass7 outer = new OuterClass7();
        outer.createALocalInner();
    }

    void createALocalInner() {

        class LocalInner {

            private Integer number = 20;
            private static int size = 100;

            private void localInnerMethod() {
                System.out.println(privateVar);
                System.out.println(number);
                System.out.println(this.number);
                System.out.println(OuterClass7.this.number);
                outerMethod();
            }

            private static void staticInnerMethod() {
                // System.out.println(privateVar); // DOES NOT COMPILE
                // outerMethod(); // DOES NOT COMPILE
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.localInnerMethod();
    }
}
