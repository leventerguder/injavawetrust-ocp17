package chapter07.creating_nested_classes;

public class OuterClass3Test {

    public static void main(String[] args) {

        OuterClass3.StaticNested staticNested = new OuterClass3.StaticNested();
        OuterClass3.StaticNested staticNested2 = new OuterClass3.StaticNested();

        OuterClass3.InnerClass innerClass = new OuterClass3().new InnerClass();
        OuterClass3.InnerClass innerClass2 = new OuterClass3().new InnerClass();

        OuterClass3.Person person = new OuterClass3.Person("name", "surname");
        System.out.println(person);

        OuterClass3.Colors color = OuterClass3.Colors.RED;

    }
}
