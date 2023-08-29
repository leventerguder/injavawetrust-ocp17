package chapter09.working_with_generics;

import java.util.List;

public class PassingGenericArgumentsExample1 {


    public static void main(String[] args) {
        var reference = new PassingGenericArgumentsExample1();

        List<String> strings = List.of("e1", "e2");
        List<Integer> integers = List.of(10, 20);

        System.out.println(reference.first(strings));
        System.out.println(reference.first(integers));
    }

    <T> T first(List<? extends T> list) {
        return list.get(0);
    }

//    <T><? extends T> second(List<? extends T> list) { // DOES NOT COMPILE
//        return list.get(0);
//    }

    // The next method, second(), does not compile because the return type isn’t actually a type. You are writing the method.
    //You know what type it is supposed to return. You don’t get to specify this as a wildcard.

//    <B extends A> B third(List<B> list) {
//        return new B(); // DOES NOT COMPILE
//    }

    <T extends A> B thirdV2(List<B> list) {
        return new B();
    }

//    <? extends A> B thirdV3(List<? extends A> list) {
//        return new B();
//    }

    B thirdV4(List<? extends B> list) {
        return list.get(0);
    }

    <T> T thirdV5(List<T> list) {
        return list.get(0);
    }

    <T extends A> T thirdV6(List<T> list) {
        return list.get(0);
    }
//
//    <T super A> T thirdV7(List<T> list) {
//        return list.get(0);
//    }

    void fourth(List<? super B> list) {
    }

    <T> void fourthV2(List<? super T> list) {
    }

    <T extends B> void fourthV3(List<? super T> list) {
    }

    <T extends A> void fourthV4(List<? super A> list) {
    }

    <T extends A> void fourthV5(List<? extends T> list) {
    }

//    <X> void fifth(List<X super B> list) { // DOES NOT COMPILE
//    }

    <X> void fifthV2(List<? super B> list) { // DOES NOT COMPILE
    }

    <X> void fifthV3(List<X> list) {
    }

    <X extends B> void fifthV4(List<X> list) {
    }

    static class A {
    }

    static class B extends A {
    }

    static class C extends B {
    }
}
