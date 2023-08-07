package chapter07.creating_nested_classes;

public class OuterClass3 {

    static class StaticNested {
    }

    class InnerClass {

    }


    // Modifier 'static' is redundant for inner records
    static record Person(String name, String surname) {

    }

    // Modifier 'static' is redundant for inner enums
    static enum Colors {
        RED, BLUE, YELLOW
    }

    public static void main(String[] args) {

        StaticNested staticNested = new StaticNested();

        InnerClass innerClass = new OuterClass3().new InnerClass();
        InnerClass innerClass2 = new OuterClass3().new InnerClass();

        Person person = new Person("name", "surname");
        System.out.println(person);

        Colors color = Colors.RED;
    }

    void method() {
        StaticNested staticNested = new StaticNested();

        InnerClass innerClass = new InnerClass();
        InnerClass innerClass2 = new InnerClass();

        Person person = new Person("name", "surname");
        System.out.println(person);

        Colors color = Colors.RED;
    }
}
