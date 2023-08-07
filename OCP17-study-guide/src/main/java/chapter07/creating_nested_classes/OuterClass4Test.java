package chapter07.creating_nested_classes;

public class OuterClass4Test {

    public static void main(String[] args) {

        OuterClass4.StaticNested.staticMethod();

        OuterClass4.StaticNested staticNestedRef = new OuterClass4.StaticNested();
        staticNestedRef.method();


    }
}
