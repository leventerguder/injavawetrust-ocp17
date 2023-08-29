package chapter09.working_with_generics;

import java.util.List;

public class CreatingUpperBounderWildcardsExample2 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 5, 20, 3, 4, 8);
        List<Double> doubles = List.of(1.0, 5.2, 2.3, 6.5, 5.2, 8.4, 9.6, 10.1);

        System.out.println(total(integers));
        System.out.println(total(doubles));

        System.out.println(totalConverted(integers));
        System.out.println(totalConverted(doubles));
    }

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number : list)
            count += number.longValue();
        return count;
    }

    public static long totalConverted(List list) {
        long count = 0;
        for (Object obj : list) {
            Number number = (Number) obj;
            count += number.longValue();
        }
        return count;
    }
}
