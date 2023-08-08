package chapter07.creating_nested_classes;

public interface OuterNestedInterface {

    // private interface PrivateNestedInterFace { } // DOES NOT COMPILE

    // Modifier 'public' is redundant for interface members
    public interface PublicNestedInterface {
        public abstract void testMethod();
    }

    // Modifier 'static' is redundant for inner interfaces
    public static interface PublicStaticNestedInterface {
        public static final int VALUE = 2023;

    }

    public static class NestedClass {

    }
}
