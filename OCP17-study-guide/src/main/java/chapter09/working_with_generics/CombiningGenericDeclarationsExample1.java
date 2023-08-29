package chapter09.working_with_generics;

import java.util.ArrayList;
import java.util.List;

public class CombiningGenericDeclarationsExample1 {

    public static void main(String[] args) {

        List<?> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();
        List<? super A> list3 = new ArrayList<A>();

        // list1.add(new A()); // DOES NOT COMPILE
        // list2.add(new A()); // DOES NOT COMPILE
        // list3.add(new Object()); // DOES NOT COMPILE
        list3.add(new A());
        list3.add(new B());
        list3.add(new C());

        // List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
        List<? super B> list5 = new ArrayList<A>();
        // list3.add(new Object());
        // list5.add(new A()); // DOES NOT COMPILE
        list5.add(new B());
        list5.add(new C());
        // List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE

        // List<A> list7 = new ArrayList<? extends A>(); // DOES NOT COMPILE
        // List<Number> list8 = new ArrayList<? super A>(); // DOES NOT COMPILE
    }

    static class A {
    }

    static class B extends A {
    }

    static class C extends B {
    }
}

