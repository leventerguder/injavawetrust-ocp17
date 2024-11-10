package chapter13.questions.q11;

public class SafeVarArgsTest {

    @SafeVarargs
    public static <T> void method(T... args) {

    }

    @SafeVarargs
    <U> SafeVarArgsTest(U... u) {

    }
}
