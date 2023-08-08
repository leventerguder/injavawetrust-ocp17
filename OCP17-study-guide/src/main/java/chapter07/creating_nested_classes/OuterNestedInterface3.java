package chapter07.creating_nested_classes;

public class OuterNestedInterface3 {

    class Inner {

    }

    static class StaticNested {

    }

    static enum NestedEnum {
        RED, BLUE, BLACK;
    }

    static final record ImmutableRecord(int value) {
    }

    sealed class Parent {

    }

    final class Child extends Parent {
    }
}
