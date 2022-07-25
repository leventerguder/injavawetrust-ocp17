package chapter10.returninganoptional;

import java.util.Optional;

public class CreatingAnOptionalExample {


    public static void main(String[] args) {
        System.out.println(average(90, 100));
        System.out.println(average());

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent())
            System.out.println(opt.get()); // 95

        Optional<Double> opt2 = average();
        System.out.println(opt2.get()); // NoSuchElementException

        Object value = null;
        Optional o = (value == null) ? Optional.empty() : Optional.of(value);

        Optional o2 = Optional.ofNullable(value);

        Optional<Double> opt3 = average(90, 100);
        opt3.ifPresent(System.out::println);
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }
}
