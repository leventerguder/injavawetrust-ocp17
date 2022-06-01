package chapter02;

public class TernaryOperatorUnperformedSideEffects {

    public static void main(String[] args) {

        unperformedSideEffect1();
        unperformedSideEffect2();
    }

    private static void unperformedSideEffect1() {
        int sheep = 1;
        int zzz = 1;
        int sleep = zzz < 10 ? sheep++ : zzz++;
        System.out.print(sheep + "," + zzz); // 2,1
    }

    private static void unperformedSideEffect2() {
        int sheep = 1;
        int zzz = 1;
        int sleep = sheep >= 10 ? sheep++ : zzz++;
        System.out.print(sheep + "," + zzz); // 1,2
    }

}
