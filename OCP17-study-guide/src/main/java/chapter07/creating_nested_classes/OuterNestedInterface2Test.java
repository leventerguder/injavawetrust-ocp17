package chapter07.creating_nested_classes;

public class OuterNestedInterface2Test implements OuterNestedInterface2.PublicNestedInterface {

    @Override
    public void innerMethod() {
    }

}

class Outer2 implements OuterNestedInterface2 {

    @Override
    public void outerMethod() {
    }

}

class Outer3 implements OuterNestedInterface2, OuterNestedInterface2.PublicNestedInterface {

    @Override
    public void outerMethod() {
    }

    @Override
    public void innerMethod() {
    }
}