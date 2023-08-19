package chapter08.questions.q13;

import java.util.function.Supplier;

public class Q13 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                // Supplier<Integer> supplier = () -> length; // A  - DOES NOT COMPILE
                // System.out.println(supplier.get()); // B
            } else {
                int j = i;
                Supplier<Integer> supplier = () -> j; //C
                System.out.println(supplier.get()); //D
            }
        }
    }
}
