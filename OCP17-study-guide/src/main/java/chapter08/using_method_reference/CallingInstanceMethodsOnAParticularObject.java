package chapter08.using_method_reference;

public class CallingInstanceMethodsOnAParticularObject {

    public static void main(String[] args) {

        var str = "Zoo";
        StringStart methodRef = str::startsWith;
        StringStart lambda = s -> str.startsWith(s);


        StringStart stringStart1 = MyClass::staticMethod;
        StringStart stringStart2 = new MyClass()::instanceMethod;
        MyClass myClass = new MyClass();
        StringStart stringStart3 = myClass::instanceMethod;
        StringStart stringStart4 = ss -> myClass.instanceMethod(ss);

        System.out.println(stringStart1.beginningCheck("MyClass"));
        System.out.println(stringStart2.beginningCheck("MyClass"));
        System.out.println(stringStart3.beginningCheck("MyClass"));
        System.out.println(stringStart4.beginningCheck("MyClass"));

        System.out.println(methodRef.beginningCheck("A"));
        System.out.println(lambda.beginningCheck("A"));

        var str2 = "";
        StringChecker methodRef2 = str2::isEmpty;
        StringChecker lambda2 = () -> str2.isEmpty();

        System.out.println(methodRef2.check());
        System.out.println(lambda2.check());

        MyClassEmptyCheck myClassEmptyCheck = new MyClassEmptyCheck();

        StringChecker stringChecker1 = myClassEmptyCheck::instanceMethod;
        StringChecker stringChecker2 = MyClassEmptyCheck::staticMethod;


        var str3 = "";
        StringChecker lambda3 = () -> str.startsWith("Zoo");

        System.out.println(lambda3.check());

        // StringChecker methodReference3 = str::startsWith; // DOES NOT COMPILE
        // StringChecker methodReference3 = str::startsWith ("Zoo"); // DOES NOT COMPILE
    }
}


class MyClass {

    boolean instanceMethod(String str) {
        return str.startsWith("My");
    }

    static boolean staticMethod(String str) {
        return str.startsWith("My");
    }
}

class MyClassEmptyCheck {
    boolean instanceMethod() {
        return "".isEmpty();
    }

    static boolean staticMethod() {
        return "".isEmpty();
    }
}