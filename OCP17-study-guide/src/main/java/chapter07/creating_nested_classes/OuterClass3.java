package chapter07.creating_nested_classes;

public class OuterClass3 {

    static class StaticNested {
    }

    class InnerClass {

    }


    // Modifier 'static' is redundant for inner records
    static record Person(String name, String surname) {

    }
}
