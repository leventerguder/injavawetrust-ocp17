package chapter07.creating_nested_classes;

public interface OuterNestedInterface2 {
    public abstract void outerMethod();

    public interface PublicNestedInterface {
        public abstract void innerMethod();
    }
}

