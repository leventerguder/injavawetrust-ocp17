package chapter09.questions.q18;

public class Q18 {

    // When using generic types in a method, the generic specification goes before the return type.
    public static <T> T identity(T t) {
        return t;
    }
}
