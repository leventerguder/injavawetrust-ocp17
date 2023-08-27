package chapter09.working_with_generics;

public class MoreV2<T> {

    // public static void sink(T t) {} // DOES NOT COMPILE

    public T identity(T t) {
        return t;
    }

    public <U> U identityV2(U u) {
        return u;
    }
}
