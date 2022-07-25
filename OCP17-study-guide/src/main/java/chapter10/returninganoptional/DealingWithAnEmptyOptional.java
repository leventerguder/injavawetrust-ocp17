package chapter10.returninganoptional;

import java.util.Optional;

public class DealingWithAnEmptyOptional {

    public static void main(String[] args) {

        Optional<Double> opt = average();
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }
}
