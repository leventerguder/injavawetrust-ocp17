package chapter07.creating_nested_classes;

public class OuterClass5Test {


    public static void main(String[] args) {
        OuterClass5.StaticNested staticNested = new OuterClass5.StaticNested();
        staticNested.innerMethod();

        System.out.println();

        OuterClass5.StaticNested.staticInnerMethod();

    }
}
