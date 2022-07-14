package chapter09.usingcommoncollectionapis;

import java.util.List;
import java.util.Set;

public class DeterminingEquality {

    public static void main(String[] args) {
        var list1 = List.of(1, 2);
        var list2 = List.of(2, 1);

        var set1 = Set.of(1, 2);
        var set2 = Set.of(2, 1);

        System.out.println(list1.equals(list2)); // false , because the elements are in a different order, and a List cares about order.
        System.out.println(set1.equals(set2)); // true , because a Set is not sensitive to order
        System.out.println(list1.equals(set1)); // false , because the types are different.
    }
}
