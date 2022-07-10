package chapter08.usingmethodreference;

public class CallingInstanceMethodsOnAParticularObject {

    public static void main(String[] args) {

        var str = "Zoo";
        StringStart methodRef = str::startsWith;
        StringStart lambda = s -> str.startsWith(s);

        System.out.println(methodRef.beginningCheck("A"));
        System.out.println(lambda.beginningCheck("A"));

        var str2 = "";
        StringChecker methodRef2 = str2::isEmpty;
        StringChecker lambda2 = () -> str2.isEmpty();

        System.out.println(methodRef2.check());
        System.out.println(lambda2.check());


        var str3 = "";
        StringChecker lambda3 = () -> str.startsWith("Zoo");

        // StringChecker methodReference3 = str::startsWith; // DOES NOT COMPILE
        // StringChecker methodReference3 = str::startsWith ("Zoo"); // DOES NOT COMPILE
    }
}
