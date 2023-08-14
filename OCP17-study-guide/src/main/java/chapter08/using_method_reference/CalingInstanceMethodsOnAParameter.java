package chapter08.using_method_reference;

public class CalingInstanceMethodsOnAParameter {

    public static void main(String[] args) {

        StringParameterChecker methodRef = String::isEmpty;
        StringParameterChecker lambda = s -> s.isEmpty();

        StringParameterChecker stringParameterChecker = MyClass2::staticMethod;
        StringParameterChecker stringParameterChecker2 = new MyClass2()::method;


        System.out.println(methodRef.check("Zoo"));
        System.out.println(lambda.check("Zoo"));


        MyInterface lambdaMyInterface = MyClass3::isNull;

        StringTwoParameterChecker methodRef2 = String::startsWith;
        StringTwoParameterChecker lambda2 = (s, p) -> s.startsWith(p);

        System.out.println(methodRef2.check("Zoo", "Z"));
        System.out.println(lambda2.check("Zoo", "A"));

        MyInterface2 myInterface2 = MyClass4::instanceMethod;
    }
}

class MyClass2 {

    static boolean staticMethod(String str) {
        return str.startsWith("a");
    }

    boolean method(String str) {
        return str.startsWith("a");
    }
}


interface MyInterface {
    boolean method(MyClass3 myClass3);
}

class MyClass3 {

    boolean isNull() {
        return this == null;
    }
}

interface MyInterface2 {

    Integer method(MyClass4 myclass4, String str);
}

class MyClass4 {

    Integer instanceMethod(String str) {
        return Integer.parseInt(str);
    }
}