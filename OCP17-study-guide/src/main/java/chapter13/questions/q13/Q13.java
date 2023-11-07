package chapter13.questions.q13;

import java.util.List;

public class Q13 {

    public static void main(String[] args) {

//        System.out.print(List.of("duck", "flamingo", "pelican")
//                .parallelStream().parallel() // q1
//                .reduce(0,
//                        (c1, c2) -> c1.length() + c2.length(), // q2
//                        (s1, s2) -> s1 + s2)); // q3

        // C. The code will not compile because of line q2.

        // The problem here is that c1 is an Integer and c2 is a String.
    }

    void method() {

        System.out.print(List.of("duck", "flamingo", "pelican")
                .parallelStream().parallel() // q1
                .reduce(0,
                        (c1, c2) -> c1 + c2.length(), // q2
                        (s1, s2) -> s1 + s2)); // q3
    }

    void methodV2() {

        System.out.print(List.of("duck", "flamingo", "pelican")
                .parallelStream().parallel() // q1
                .reduce(0,
                        (c1, c2) -> c1 + c2.length(), // q2
                        Integer::sum)); // q3
    }
}
