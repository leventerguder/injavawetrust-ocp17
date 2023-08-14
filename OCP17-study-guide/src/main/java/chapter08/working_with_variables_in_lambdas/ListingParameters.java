package chapter08.working_with_variables_in_lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListingParameters {

    public static void main(String[] args) {
        varParameterTest();
    }

    private static void varParameterTest() {


        Predicate<String> p1 = x -> true;
        Predicate<String> p2 = (var x) -> true;
        Predicate<String> p3 = (String x) -> true;

        System.out.println(p1.test("test"));
        System.out.println(p2.test("test"));
        System.out.println(p3.test("test"));
    }

    public void whatAmI() {
        consume((var x) -> System.out.print(x), 123);
    }

    public void consume(Consumer<Integer> c, int num) {
        c.accept(num);
    }

    public void counts(List<Integer> list) {
        list.sort((var x, var y) -> x.compareTo(y));
    }


    public void counts2(List<Integer> list) {
        list.sort((final var x, @Deprecated var y) -> x.compareTo(y));
    }

}
