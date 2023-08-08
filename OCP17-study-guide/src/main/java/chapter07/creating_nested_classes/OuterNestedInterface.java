package chapter07.creating_nested_classes;

public class OuterNestedInterface {

    private interface PrivateNestedInterFace {
    }

    interface PublicNestedInterface {
        public abstract void testMethod();
    }

    // Modifier 'static' is redundant for inner interfaces
    public static interface PublicStaticNestedInterface {
        public static final int VALUE = 2023;

    }
}
