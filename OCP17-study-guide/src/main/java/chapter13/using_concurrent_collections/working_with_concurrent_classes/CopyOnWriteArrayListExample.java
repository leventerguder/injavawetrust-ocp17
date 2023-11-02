package chapter13.using_concurrent_collections.working_with_concurrent_classes;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String[] args) {

        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
        for (var n : favNumbers) {
            System.out.print(n + " "); // 4 3 42
            favNumbers.add(n + 1);
        }

        System.out.println();
        System.out.println("Size: " + favNumbers.size()); // Size: 6
        System.out.println(favNumbers); // [4, 3, 42, 5, 4, 43]
    }
}
