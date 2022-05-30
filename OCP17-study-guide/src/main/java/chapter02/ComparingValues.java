package chapter02;

import java.io.File;

public class ComparingValues {

    public static void main(String[] args) {
        comparingValues1();
        comparingValues2();
        comparingValues3();
        comparingValues4();
    }

    private static void comparingValues1() {
        System.out.println("comparingValues1");
        // boolean monkey = true == 3; // DOES NOT COMPILE
        // boolean ape = false != "Grape"; // DOES NOT COMPILE
        // boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE
    }

    private static void comparingValues2() {
        System.out.println("comparingValues2");
        boolean bear = false;
        boolean polar = (bear = true); // Not comparing operator!
        System.out.println(polar); // true
    }

    private static void comparingValues3() {
        System.out.println("comparingValues3");
        var monday = new File("schedule.txt");
        var tuesday = new File("schedule.txt");
        var wednesday = tuesday;
        System.out.println(monday == tuesday); // false
        System.out.println(tuesday == wednesday); // true
    }

    private static void comparingValues4() {
        System.out.println("comparingValues4");
        System.out.print(null == null); // true
    }
}
