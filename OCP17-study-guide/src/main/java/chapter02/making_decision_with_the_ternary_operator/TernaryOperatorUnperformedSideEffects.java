package chapter02.making_decision_with_the_ternary_operator;

public class TernaryOperatorUnperformedSideEffects {

    public static void main(String[] args) {

        unperformedSideEffect1();
        unperformedSideEffect2();

        unperformedSideEffect3();
        unperformedSideEffect4();

    }

    private static void unperformedSideEffect1() {
        int sheep = 1;
        int zzz = 1;
        int sleep = zzz < 10 ? sheep++ : zzz++;
        System.out.println(sleep + "," + sheep + "," + zzz); //1, 2, 1
    }

    private static void unperformedSideEffect2() {
        int sheep = 1;
        int zzz = 1;
        int sleep = zzz < 10 ? ++sheep : zzz++;
        System.out.println(sleep + "," + sheep + "," + zzz); //2, 2, 1
    }

    private static void unperformedSideEffect3() {
        int sheep = 1;
        int zzz = 1;
        int sleep = sheep >= 10 ? sheep++ : zzz++;
        System.out.println(sleep + "," + sheep + "," + zzz); //1, 1, 2
    }

    private static void unperformedSideEffect4() {
        int sheep = 1;
        int zzz = 1;
        int sleep = sheep >= 10 ? sheep++ : ++zzz;
        System.out.println(sleep + "," + sheep + "," + zzz); //2, 1, 2
    }

}
