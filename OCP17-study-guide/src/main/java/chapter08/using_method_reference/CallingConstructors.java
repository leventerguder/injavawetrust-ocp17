package chapter08.using_method_reference;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CallingConstructors {

    public static void main(String[] args) {

        emptyStringCreatorExample();

        stringCopierExample();

        sampleFunctionalInterfaceExample();

        anotherFunctionalInterfaceExample();

        moreFunctionalInterfaceExample();

    }

    private static void emptyStringCreatorExample() {
        EmptyStringCreator methodRef = String::new;
        EmptyStringCreator lambda = () -> new String();

        var myString = methodRef.create();
        System.out.println(myString.equals("Snake")); // false

        String createdString = lambda.create();
        System.out.println(createdString);
    }


    private static void stringCopierExample() {
        StringCopier methodRef = String::new;
        StringCopier lambda = x -> new String(x);

        var myString = methodRef.copy("Zebra");
        System.out.println(myString.equals("Zebra")); // true

        String copy = lambda.copy("Zebra");
        System.out.println(copy);
    }

    private static void sampleFunctionalInterfaceExample() {
        SampleFunctionalInterface sampleFunctionalInterface = MyClassConstructor::new;
        MyClassConstructor myClassConstructor = sampleFunctionalInterface.method();
        System.out.println(myClassConstructor);
    }

    private static void anotherFunctionalInterfaceExample() {
        AnotherFunctionalInterface anotherFunctionalInterface = MyClassConstructor::new;
        MyClassConstructor myClassConstructor = anotherFunctionalInterface.method(100);
        System.out.println(myClassConstructor);
    }

    private static void moreFunctionalInterfaceExample() {
        MoreFunctionalInterface lambda1 = () -> new ArrayList<>();
        MoreFunctionalInterface lambda2 = () -> new LinkedList<>();
        MoreFunctionalInterface lambda3 = () -> List.of("str1", "str2", "str3");
        MoreFunctionalInterface lambda4 = () -> {
            List<String> values = new ArrayList<>();
            values.add("str1");
            values.add("str2");
            values.add("str3");
            return values;
        };

        MoreFunctionalInterface methodRef1 = ArrayList::new;
        MoreFunctionalInterface methodRef2 = LinkedList::new;

        List<String> list1 = lambda1.values();
        List<String> list2 = lambda2.values();
        List<String> list3 = lambda3.values();
        List<String> list4 = lambda4.values();
        List<String> list5 = methodRef1.values();
        List<String> list6 = methodRef2.values();

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list5);
        System.out.println(list6);
    }

}

interface SampleFunctionalInterface {

    MyClassConstructor method();
}

interface AnotherFunctionalInterface {

    MyClassConstructor method(int number);
}

interface MoreFunctionalInterface {
    List<String> values();
}

class MyClassConstructor {

    private int value;

    MyClassConstructor() {
        this.value = 1;
    }

    MyClassConstructor(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyClassConstructor{" +
                "value=" + value +
                '}';
    }
}

