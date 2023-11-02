package chapter13.using_concurrent_collections.understanding_memory_consistency_errors;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExceptionExample3 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (Integer number : numbers) {
            if (number == 3) {
                numbers.remove(number);    //ConcurrentModificationException
            }
        }
    }
}
