package chapter13.questions.q11;

import java.util.List;

public class Q11 {

    public static void main(String[] args) {

        Integer i1 = List.of(1, 2, 3, 4, 5).stream().findAny().get();
        synchronized (i1) { // y1
            Integer i2 = List.of(6, 7, 8, 9, 10)
                    .parallelStream()
                    .sorted()
                    .findAny().get(); // y2
            System.out.println(i1 + " " + i2);
        }

        /*
        There are two important things to notice. First, synchronizing on the first variable doesn’t
        impact the results of the code. Second, sorting on a parallel stream does not mean that
        findAny() will return the first record.

        But even on serial streams, findAny() is free to select any element!
         */
    }
}
