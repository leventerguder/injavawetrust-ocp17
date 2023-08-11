package chapter08.writing_simple_lambdas;

interface MyInterface {
    void sample(Integer i);
}
interface InterfaceV1 {

    boolean sample();
}

interface InterfaceV2 {

    boolean sample(String str);
}

interface InterfaceV3 {

    boolean sample(String str1, String str2);
}

public class ValidLambdas {

    MyInterface myInterface = s -> {};
    InterfaceV1 v1 = () -> true;
    InterfaceV2 v2 = x -> x.startsWith("test");

    InterfaceV2 v22 = (String x) -> x.startsWith("test");

    InterfaceV3 v3 = (x, y) -> {
        return x.startsWith("test");
    };

    InterfaceV3 v32 = (String x, String y) -> x.startsWith("test");

}
