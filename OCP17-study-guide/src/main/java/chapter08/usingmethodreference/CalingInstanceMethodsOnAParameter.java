package chapter08.usingmethodreference;

public class CalingInstanceMethodsOnAParameter {

    public static void main(String[] args) {

        StringParameterChecker methodRef = String::isEmpty;
        StringParameterChecker lambda = s -> s.isEmpty();

        System.out.println(methodRef.check("Zoo"));
        System.out.println(lambda.check("Zoo"));

        StringTwoParameterChecker methodRef2 = String::startsWith;
        StringTwoParameterChecker lambda2 = (s, p) -> s.startsWith(p);

        System.out.println(methodRef2.check("Zoo", "Z"));
        System.out.println(lambda2.check("Zoo", "A"));
    }
}
