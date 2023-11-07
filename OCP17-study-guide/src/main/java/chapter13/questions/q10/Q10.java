package chapter13.questions.q10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q10 {

    public static void main(String[] args) {
        List<Integer> lions = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> tigers = new CopyOnWriteArrayList<>(lions);
        Set<Integer> bears = new ConcurrentSkipListSet<>();
        bears.addAll(lions);

        for (Integer item : tigers)
            tigers.add(4); // x1
        for (Integer item : bears)
            bears.add(5); // x2
        System.out.println(lions.size() + " " + tigers.size() + " " + bears.size()); // 3 6 4

        System.out.println(lions);
        System.out.println(tigers);
        System.out.println(bears);

        /*
        CopyOnWriteArrayList class is designed to preserve the original list on iteration, so
        the first loop will be executed exactly three times and, in the process, will increase the size of
        tigers to six elements.
         */

        /*
        The ConcurrentSkipListSet class allows modifications, and
        since it enforces the uniqueness of its elements, the value 5 is added only once, leading to a
        total of four elements in bears. F
         */
    }
}
