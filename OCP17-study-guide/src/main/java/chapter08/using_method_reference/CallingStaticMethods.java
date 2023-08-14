package chapter08.using_method_reference;

public class CallingStaticMethods {

    public static void main(String[] args) {

        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);
        Converter methodRef2 = StaticMethodRef::deferred;

        System.out.println(methodRef.round(101.1));
        System.out.println(lambda.round(101.1));
        System.out.println(methodRef2.round(101.1));

        GreetingInterface greetingInterfaceMethodRef = StaticMethodRef::printMessage;
        GreetingInterface greetingInterfaceLamda = () -> StaticMethodRef.printMessage();

        // GreetingInterface greetingInterfaceLamda2 =  -> StaticMethodRef.printMessage(); // DOES NOT COMPILE
        // GreetingInterface greetingInterfaceLamda3 =  x -> StaticMethodRef.printMessage(); // DOES NOT COMPILE
    }

}

class StaticMethodRef {

    static long deferred(double num) {
        return (long) (num * 2);
    }

    static void printMessage() {
        System.out.println("hello printMessage!");
    }
}
