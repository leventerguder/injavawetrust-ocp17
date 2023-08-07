package chapter07.creating_nested_classes;

public class OuterClass8 {

    void method() {

        // private class LocalInner {} // DOES NOT COMPILE

        final class LocalInner2 {
        }

        abstract class LocalInner3 {
        }

        abstract class LocalInner4 extends LocalInner3 {
        }

        // static enum LocalEnum { // DOES NOT COMPILE
        enum LocalEnum {
            RED, BLUE, YELLOW
        }

        // static record Person(int age, String name, String surname) {
        record Person(int age, String name, String surname) {
        }
    }
}
