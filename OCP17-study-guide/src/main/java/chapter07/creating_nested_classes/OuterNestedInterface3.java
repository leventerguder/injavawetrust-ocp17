package chapter07.creating_nested_classes;

public interface OuterNestedInterface3 {

    default void defaultMethod() {
        System.out.println("default method");
    }

    public static void staticMethod() {
        System.out.println("static method");
    }

    private static void privateStaticMethod() {
        System.out.println("private static method");
    }

    class ImplicitlyStatic {

        void method() {
            //Non-static method 'defaultMethod()' cannot be referenced from a static context
            // defaultMethod();

            staticMethod();
            privateStaticMethod();
        }
    }

    // Modifier 'static' is redundant for inner classes of interfaces
    static class StaticNested {

        void method() {
            staticMethod();
            privateStaticMethod();
        }
    }

    public static enum NestedEnum {
        RED, BLUE, BLACK;
    }

    public static final record ImmutableRecord(int value) {
    }

    public static sealed class Parent {

    }

    public static final class Child extends Parent {
    }
}
