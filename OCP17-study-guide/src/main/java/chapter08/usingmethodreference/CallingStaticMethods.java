package chapter08.usingmethodreference;

public class CallingStaticMethods {

    public static void main(String[] args) {

        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);

        System.out.println(methodRef.round(101.1));
        System.out.println(lambda.round(101.1));

        Converter mr = StaticMethodRef::deferred;

    }

}

class StaticMethodRef {

    static long deferred(double num) {
        return (long) (num * 2);
    }
}
