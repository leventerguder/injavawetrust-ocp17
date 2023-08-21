package chapter09.working_with_generics;

import java.util.List;

public class PassingGenericArgumentsExample1 {

    <T> T first(List<? extends T> list) {
        return list.get(0);
    }

//    <T><?extends T> second(List<? extends T> list) { // DOES NOT COMPILE
//        return list.get(0);
//    }

    // The next method, second(), does not compile because the return type isn’t actually a type. You are writing the method.
    //You know what type it is supposed to return. You don’t get to specify this as a wildcard.

//    <B extends A> B third(List<B> list) {
//        return new B(); // DOES NOT COMPILE
//    }

    void fourth(List<? super B> list) {}

    // <X> void fifth(List<X super B> list) { // DOES NOT COMPILE }
}
