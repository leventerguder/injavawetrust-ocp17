package chapter09.working_with_generics;

public class TrickyCrate<T> {

    public <T> T tricky(T t) {
        return t;
    }

    public T tricky2(T t) {
        return t;
    }

    public <U> U tricky3(U u) {
        return u;
    }
}
