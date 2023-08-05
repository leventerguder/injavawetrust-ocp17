package chapter07.creating_nested_classes;

public class ShadowingOuter {

    private String shadowing = "Outer Test";

    public static void main(String[] args) {
        InnerClass innerClass = new ShadowingOuter().new InnerClass();
        innerClass.printTest();
    }

    public class InnerClass {
        private String shadowing = "Inner Test";

        public void printTest() {
            String shadowing = "Local Test";
            System.out.println(shadowing);
            System.out.println(this.shadowing);
            System.out.println(ShadowingOuter.this.shadowing);
        }
    }
}
