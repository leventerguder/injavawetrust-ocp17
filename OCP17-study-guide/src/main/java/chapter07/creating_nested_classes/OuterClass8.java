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

        enum LocalEnum {
            RED, BLUE, YELLOW
        }

        record Person(int age, String name, String surname) {
        }
    }
}
