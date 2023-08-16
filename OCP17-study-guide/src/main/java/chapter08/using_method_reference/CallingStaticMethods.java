package chapter08.using_method_reference;

public class CallingStaticMethods {

    public static void main(String[] args) {

        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);
        Converter lambda2 = (double x) -> Math.round(x);
        Converter methodRef2 = StaticMethodRef::deferred;

        System.out.println(methodRef.round(101.1));
        System.out.println(lambda.round(101.1));
        System.out.println(methodRef2.round(101.1));

        GreetingInterface greetingInterfaceMethodRef = StaticMethodRef::printMessage;

        GreetingInterface greetingInterfaceLamda = () -> StaticMethodRef.printMessage();

        greetingInterfaceMethodRef.message();
        greetingInterfaceLamda.message();

        // GreetingInterface greetingInterfaceLamda2 =  -> StaticMethodRef.printMessage(); // DOES NOT COMPILE
        // GreetingInterface greetingInterfaceLamda3 =  x -> StaticMethodRef.printMessage(); // DOES NOT COMPILE

        GreetingInterface greetingInterfaceLambda4 = () -> StaticMethodRef.printMessageV2();
        GreetingInterface greetingInterfaceLambda5 = () -> { StaticMethodRef.printMessageV2(); };
        // GreetingInterface greetingInterfaceLambda6 = () -> { return StaticMethodRef.printMessageV2(); }; // DOES NOT COMPILE
        GreetingInterface greetingInterfaceMethodRef2 = StaticMethodRef::printMessageV2;

        GreetingInterface greetingInterfaceLambda7 = () -> StaticMethodRef.printMessageV3("hello printMessageV3");
        // GreetingInterface greetingInterfaceMethodRef3 = StaticMethodRef::printMessageV3; // DOES NOT COMPILE

        greetingInterfaceMethodRef2.message();
        greetingInterfaceLambda4.message();
        greetingInterfaceLambda5.message();
        greetingInterfaceLambda7.message();


    }

}

class StaticMethodRef {

    static long deferred(double num) {
        return (long) (num * 2);
    }

    static void printMessage() {
        System.out.println("hello printMessage!");
    }

    static String printMessageV2() {
        String message = "hello printMessageV2";
        System.out.println(message);
        return message;
    }

    static void printMessageV3(String message) {
        System.out.println(message);
    }
}
