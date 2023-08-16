package chapter08.using_method_reference;

import java.util.Random;

public class CalingInstanceMethodsOnAParameter {

    public static void main(String[] args) {

        exampleMethodStringParameterChecker();

        exampleMethodStringChecker();

        exampleStringParameterCheckerHelperClass();

        exampleHelperClassParameter();

        exampleStringTwoParameterChecker();

        exampleHelperClassParameter2();
    }

    private static void exampleMethodStringParameterChecker() {

        System.out.println("### exampleMethodStringParameterChecker ###");

        StringParameterChecker methodRef = String::isEmpty;
        StringParameterChecker lambda = s -> s.isEmpty();
        System.out.println(methodRef.check("Zoo"));
        System.out.println(lambda.check("Zoo"));
    }

    private static void exampleMethodStringChecker() {

        System.out.println("### exampleMethodStringChecker ###");

        var str = "Zoo";
        //StringParameterChecker methodRef = str::isEmpty; // DOES NOT COMPILE
        StringChecker methodRef = str::isEmpty;
        StringChecker lambda = () -> str.isEmpty();

        System.out.println(methodRef.check());
        System.out.println(lambda.check());
    }

    private static void exampleStringParameterCheckerHelperClass() {

        System.out.println("### exampleStringParameterCheckerHelperClass ###");

        StringParameterChecker stringParameterChecker1 = HelperClass::staticMethod;
        StringParameterChecker stringParameterChecker2 = new HelperClass()::method;
        HelperClass helperRef = new HelperClass();
        StringParameterChecker stringParameterChecker3 = helperRef::method;
        //Static method referenced through non-static qualifier
        // StringParameterChecker stringParameterChecker4 = helperRef::staticMethod; // DOES NOT COMPILE

        StringParameterChecker stringParameterChecker4 = s -> helperRef.method(s);
        StringParameterChecker stringParameterChecker5 = (String s) -> HelperClass.staticMethod(s);

        System.out.println(stringParameterChecker1.check("abc"));
        System.out.println(stringParameterChecker2.check("abc"));
        System.out.println(stringParameterChecker3.check("abc"));
        System.out.println(stringParameterChecker4.check("abc"));
        System.out.println(stringParameterChecker5.check("abc"));
    }


    private static void exampleHelperClassParameter() {

        System.out.println("### exampleHelperClassParameter ###");

        MyInterface lambda1 = hcp -> hcp.isNull();
        MyInterface lambda2 = (HelperClassParameter hcp) -> hcp.isNull();
        MyInterface lambda3 = (HelperClassParameter hcp) -> false;

        MyInterface methodReference = HelperClassParameter::isNull;

        System.out.println(lambda1.method(new HelperClassParameter()));
        System.out.println(lambda2.method(new HelperClassParameter()));
        System.out.println(lambda3.method(new HelperClassParameter()));

        System.out.println(methodReference.method(new HelperClassParameter()));
    }

    private static void exampleStringTwoParameterChecker() {

        System.out.println("### exampleStringTwoParameterChecker ###");

        StringTwoParameterChecker lambda = (s, p) -> s.startsWith(p);
        StringTwoParameterChecker methodRef = String::startsWith;

        System.out.println(methodRef.check("Zoo", "Z"));
        System.out.println(lambda.check("Zoo", "A"));
    }


    private static void exampleHelperClassParameter2() {

        System.out.println("### exampleHelperClassParameter2 ###");

        MyInterface2 lambda1 = (hpc, str) -> hpc.instanceMethod(str);
        MyInterface2 lambda2 = (HelperClassParameter2 hpc, String str) ->
        {
            return hpc.instanceMethod(str);
        };

        MyInterface2 lambda3 = (HelperClassParameter2 hpc, String str) ->
        {
            return Integer.parseInt(str);
        };

        MyInterface2 lambda4 = (HelperClassParameter2 hpc, String str) ->
        {
            return new Random().nextInt();
        };


        MyInterface2 methodReference = HelperClassParameter2::instanceMethod;

        // MyInterface2 methodReference2 = HelperClassParameter2::instanceMethod2; // DOES NOT COMPILE

        // MyInterface2 methodReference3 = HelperClassParameter2::instanceMethod3; // DOES NOT COMPILE

        // MyInterface2 methodReference4 = HelperClassParameter2::staticMethod; // DOES NOT COMPILE

        MyInterface2 methodReference4 = HelperClassParameter2::staticMethod2;

        System.out.println(lambda1.method(new HelperClassParameter2(),"100"));
        System.out.println(lambda2.method(new HelperClassParameter2(),"100"));
        System.out.println(lambda3.method(new HelperClassParameter2(),"100"));
        System.out.println(lambda4.method(new HelperClassParameter2(),"100"));
        System.out.println(methodReference.method(new HelperClassParameter2(),"100"));
        System.out.println(methodReference4.method(new HelperClassParameter2(),"100"));

    }
}

class HelperClass {

    static boolean staticMethod(String str) {
        return str.startsWith("a");
    }

    boolean method(String str) {
        return str.startsWith("a");
    }
}

interface MyInterface {
    boolean method(HelperClassParameter hpc);
}

class HelperClassParameter {

    boolean isNull() {
        return this == null;
    }
}

interface MyInterface2 {

    Integer method(HelperClassParameter2 hpc, String str);
}

class HelperClassParameter2 {

    Integer instanceMethod(String str) {
        return Integer.parseInt(str);
    }

    Integer instanceMethod2(StringBuilder sb) {
        return Integer.parseInt(sb.toString());
    }

    Integer instanceMethod2(String str, Integer number) {
        return Integer.parseInt(str) + number;

    }

    static Integer staticMethod(String str) {
        return Integer.parseInt(str);
    }

    static Integer staticMethod2(HelperClassParameter2 hpc, String str) {
        return Integer.parseInt(str);
    }

}