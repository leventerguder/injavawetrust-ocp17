package chapter08.using_method_reference;

public class CallingInstanceMethodsOnAParticularObject {

    public static void main(String[] args) {

        exampleMethod1StringStart();

        exampleMethod2StringStart();

        exampleMethod3StringStart();

        var callingInstanceMethodsOnAParticularObject = new CallingInstanceMethodsOnAParticularObject();
        callingInstanceMethodsOnAParticularObject.exampleMethod4StringStart();

        exampleMethod1StringChecker();

        exampleMethod2StringChecker();

        exampleMethod3StringChecker();

        exampleMethod1Calculator();


    }

    private static MyClass myClassStaticVariable = new MyClass();
    private MyClass myClassInstanceVariable = new MyClass();

    private static void exampleMethod1StringStart() {
        System.out.println("### exampleMethod1StringStart ###");

        var str = "Zoo";
        StringStart methodRef = str::startsWith;
        StringStart lambda = s -> str.startsWith(s);

        System.out.println(methodRef.beginningCheck("A"));
        System.out.println(lambda.beginningCheck("A"));
    }

    private static void exampleMethod2StringStart() {

        System.out.println("### exampleMethod2StringStart ###");

        StringStart stringStart1 = MyClass::staticMethod;
        StringStart stringStart2 = new MyClass()::instanceMethod;
        MyClass myClassRef = new MyClass();
        StringStart stringStart3 = myClassRef::instanceMethod;
        // Static method referenced through non-static qualifier
        //StringStart stringStart4 = myClassRef::staticMethod; // DOES NOT COMPILE
        StringStart stringStart5 = ss -> myClassRef.instanceMethod(ss);
        StringStart stringStart6 = ss -> MyClass.staticMethod(ss);

        System.out.println(stringStart1.beginningCheck("MyClass"));
        System.out.println(stringStart2.beginningCheck("MyClass"));
        System.out.println(stringStart3.beginningCheck("MyClass"));
        System.out.println(stringStart5.beginningCheck("MyClass"));
        System.out.println(stringStart6.beginningCheck("MyClass"));
    }

    private static void exampleMethod3StringStart() {

        System.out.println("### exampleMethod3StringStart ###");

        StringStart stringStart1 = myClassStaticVariable::instanceMethod;
        // StringStart stringStart2 = myClassInstanceVariable::instanceMethod; // DOES NOT COMPILE

        //Static method referenced through non-static qualifier
        // StringStart stringStart3 = myClassStaticVariable::staticMethod; // DOES NOT COMPILE

        System.out.println(stringStart1.beginningCheck("MyClass"));
    }

    private void exampleMethod4StringStart() {

        System.out.println("### exampleMethod4StringStart ###");

        StringStart stringStart1 = myClassStaticVariable::instanceMethod;
        StringStart stringStart2 = myClassInstanceVariable::instanceMethod;

        // Static method referenced through non-static qualifier
        // StringStart stringStart3 = myClassStaticVariable::staticMethod; // DOES NOT COMPILE
        // StringStart stringStart4 = myClassStaticVariable::staticMethod; // DOES NOT COMPILE

        StringStart stringStart5 = MyClass::staticMethod;

        System.out.println(stringStart1.beginningCheck("MyClass"));
        System.out.println(stringStart2.beginningCheck("MyClass"));
        System.out.println(stringStart5.beginningCheck("MyClass"));
    }

    private static void exampleMethod1StringChecker() {

        System.out.println("### exampleMethod1StringChecker ###");

        var str = "";
        StringChecker methodRef = str::isEmpty;
        StringChecker lambda = () -> str.isEmpty();

        System.out.println(methodRef.check());
        System.out.println(lambda.check());
    }

    private static void exampleMethod2StringChecker() {

        System.out.println("### exampleMethod2StringChecker ###");

        MyClassEmptyCheck myClassEmptyCheck = new MyClassEmptyCheck();

        StringChecker stringChecker1 = myClassEmptyCheck::instanceMethod;
        StringChecker stringChecker2 = MyClassEmptyCheck::staticMethod;

        System.out.println(stringChecker1.check());
        System.out.println(stringChecker2.check());
    }

    private static void exampleMethod3StringChecker() {

        var str = "";
        StringChecker lambda = () -> str.startsWith("Zoo");
        //StringChecker lambda2 = s -> str.startsWith("Zoo"); // DOES NOT COMPILE
        //StringChecker lambda3 = (String s) -> str.startsWith("Zoo"); // DOES NOT COMPILE

        System.out.println(lambda.check());

        // StringChecker methodReference = str::startsWith; // DOES NOT COMPILE
        // StringChecker methodReference = str::startsWith ("Zoo"); // DOES NOT COMPILE
    }

    private static void exampleMethod1Calculator() {
        Calculator lambda1 = (i, j) -> i * j;
        Calculator lambda2 = (int i, int j) -> i + j;

        // Incompatible parameter types in lambda expression: expected int but found Integer
        // Calculator lambda3 = (Integer i, Integer j) -> i + j; // DOES NOT COMPILE

        Calculator lambda4 = (var i, var j) -> i / j;
        Calculator lambda5 = (int i, int j) -> {
            return i - j;
        };

        CalculatorHelper calculatorHelper = new CalculatorHelper();
        Calculator lambda6 = (int i, int j) -> calculatorHelper.sum(i, j);
        Calculator lambda7 = (int i, int j) -> calculatorHelper.multiply(i, j);

        Calculator methodReference1 = calculatorHelper::sum;
        Calculator methodReference2 = calculatorHelper::multiply;

        //Static method referenced through non-static qualifier
        // Calculator methodReference3 = calculatorHelper::subtraction; // DOES NOT COMPILE
        Calculator methodReference4 = CalculatorHelper::subtraction;

        System.out.println(lambda1.calculate(10, 5));
        System.out.println(lambda2.calculate(10, 5));
        System.out.println(lambda4.calculate(10, 5));
        System.out.println(lambda5.calculate(10, 5));
        System.out.println(lambda6.calculate(10, 5));
        System.out.println(lambda7.calculate(10, 5));

        System.out.println(methodReference1.calculate(10, 5));
        System.out.println(methodReference2.calculate(10, 5));
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

class CalculatorHelper {

    int sum(int num1, int num2) {
        return num1 + num2;
    }

    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
}