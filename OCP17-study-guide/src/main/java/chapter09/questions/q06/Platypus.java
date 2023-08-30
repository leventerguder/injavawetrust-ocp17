package chapter09.questions.q06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public record Platypus(String name, int beakLength) {

    @Override
    public String toString() {
        return "" + beakLength;
    }

    public static void main(String[] args) {

        optionA();
        optionB();
        optionC();
        optionD();
        optionE();
        optionF();
    }

    private static void optionA() {
        List<Platypus> list = getPlatypuses();

        Collections.sort(list, Comparator.comparing(Platypus::beakLength));

        System.out.println(list);
    }


    private static void optionB() {
        List<Platypus> list = getPlatypuses();

        Collections.sort(list, Comparator.comparing(Platypus::beakLength).reversed());

        System.out.println(list);
    }

    private static void optionC() {
        List<Platypus> list = getPlatypuses();

        Collections.sort(list, Comparator.comparing(Platypus::name)
                .thenComparing(Platypus::beakLength));
        System.out.println(list);
    }

    private static void optionD() {
        List<Platypus> list = getPlatypuses();

        Collections.sort(list, Comparator.comparing(Platypus::name)
                .thenComparing(Comparator.comparing(Platypus::beakLength)
                        .reversed()));

        System.out.println(list);
    }


    private static void optionE() {
        List<Platypus> list = getPlatypuses();

//        Collections.sort(list, Comparator.comparing(Platypus::name)
//                .thenComparingNumber(Platypus::beakLength).reversed()); // DOES NOT COMPILE

        // there is no thenComparingNumber !!!
        System.out.println(list);
    }

    private static void optionF() {
        List<Platypus> list = getPlatypuses();

        Collections.sort(list, Comparator.comparing(Platypus::name)
                .thenComparingInt(Platypus::beakLength).reversed()); // DOES NOT COMPILE
        System.out.println(list);
    }


    private static List<Platypus> getPlatypuses() {
        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);
        return Arrays.asList(p1, p2, p3);
    }
}
