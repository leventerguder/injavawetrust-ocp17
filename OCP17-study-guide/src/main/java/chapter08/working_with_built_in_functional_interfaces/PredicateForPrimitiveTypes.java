package chapter08.working_with_built_in_functional_interfaces;

import chapter05.overloading_methods.SystemOut;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateForPrimitiveTypes {

    public static void main(String[] args) {

        doublePredicateExample();
        intPredicateExample();
        longPredicateExample();
    }

    private static void doublePredicateExample() {

        System.out.println("### doublePredicateExample ###");

        DoublePredicate dp1 = (d) -> d > 1.5;
        DoublePredicate dp2 = PredicatePrimitiveHelper::predicateDouble;
        DoublePredicate dp3 = d -> PredicatePrimitiveHelper.predicateDouble(d);

        DoublePredicate dp4 = Double::isInfinite;
        DoublePredicate dp5 = Double::isNaN;
        DoublePredicate dp6 = Double::isFinite;

        System.out.println(dp1.test(0.5));
        System.out.println(dp2.test(1.1));
        System.out.println(dp3.test(2.5));

        System.out.println(dp4.test(Double.POSITIVE_INFINITY));
        System.out.println(dp5.test(Double.NaN));
        System.out.println(dp6.test(Double.MAX_VALUE));
    }

    private static void intPredicateExample() {

        System.out.println("### intPredicateExample ###");

        IntPredicate dp1 = (d) -> d > 1.5;
        IntPredicate dp2 = PredicatePrimitiveHelper::predicateDouble;
        IntPredicate dp3 = PredicatePrimitiveHelper::predicateInt;
        IntPredicate dp4 = d -> PredicatePrimitiveHelper.predicateDouble(d);
        IntPredicate dp5 = d -> PredicatePrimitiveHelper.predicateInt(d);

        System.out.println(dp1.test(5));
        System.out.println(dp2.test(5));
        System.out.println(dp3.test(34));
        System.out.println(dp3.test(54));
        System.out.println(dp4.test(26));
        System.out.println(dp5.test(36));
    }

    private static void longPredicateExample() {

        System.out.println("### longPredicateExample ###");

        LongPredicate dp1 = (long d) -> d > 1.5;
        LongPredicate dp2 = PredicatePrimitiveHelper::predicateLong;
        LongPredicate dp3 = PredicatePrimitiveHelper::predicateDouble;
        // LongPredicate dp4 = PredicatePrimitiveHelper::predicateInt; // DOES NOT COMPILE
        LongPredicate dp5 = d -> PredicatePrimitiveHelper.predicateLong(d);
        LongPredicate dp6 = d -> PredicatePrimitiveHelper.predicateDouble(d);
        //LongPredicate dp7 = d -> PredicatePrimitiveHelper.predicateInt(d); // DOES NOT COMPILE

        System.out.println(dp1.test(5));
        System.out.println(dp2.test(5));
        System.out.println(dp3.test(26));
        System.out.println(dp5.test(26));
        System.out.println(dp6.test(26));

    }
}


class PredicatePrimitiveHelper {

    static boolean predicateDouble(double d) {
        return d > 1.2;
    }

    static boolean predicateInt(int i) {
        return i > 2;
    }

    static boolean predicateLong(long i) {
        return i > 2;
    }
}