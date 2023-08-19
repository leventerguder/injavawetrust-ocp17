package chapter08.questions.q09;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Q09 {

//    Which statements are true? (Choose all that apply.)
// ++   A. The Consumer interface is good for printing out an existing value.
//    B. The Supplier interface is good for printing out an existing value.
//    C. The IntegerSupplier interface returns an int.
//    D. The Predicate interface returns an int.
//    E. The Function interface has a method named test().
// ++   F. The Predicate interface has a method named test().

    public static void main(String[] args) {

        Consumer<String> consumer = System.out::println;
        consumer.accept("hello consumer!");

        Predicate<String> predicate = String::isEmpty;
        System.out.println(predicate.test("not-empty"));
    }


}
