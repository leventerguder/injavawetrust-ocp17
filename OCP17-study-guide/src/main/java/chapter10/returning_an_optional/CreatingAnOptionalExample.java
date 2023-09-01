package chapter10.returning_an_optional;

import java.util.Optional;

import static chapter10.returning_an_optional.OptionalAverageUtil.average;

public class CreatingAnOptionalExample {


    public static void main(String[] args) {

        System.out.println(average(90, 100));
        System.out.println(average());

        System.out.println("### isPresent ### ");
        Optional<Double> opt = average(90, 100);
        if (opt.isPresent())
            System.out.println(opt.get()); // 95

        Optional<Double> opt2 = average();
        // System.out.println(opt2.get()); // NoSuchElementException

        System.out.println("### empty ### ");
        Object value = null;
        Optional o = (value == null) ? Optional.empty() : Optional.of(value);
        System.out.println(o);

        System.out.println("### ofNullable ### ");

        Optional o2 = Optional.ofNullable(value);
        System.out.println(o2);

        System.out.println("### ifPresent ### ");
        Optional<Double> opt3 = average(90, 100);
        opt3.ifPresent(System.out::println);
    }

}
