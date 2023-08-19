package chapter08.questions.q20;

import java.util.List;

interface Yawn {
    String yawn(double d, List<Integer> time);
}

class Sloth implements Yawn {
    public String yawn(double zzz, List<Integer> time) {
        return "Sleep: " + zzz;
    }
}

public class Vet {
    public static String takeNap(Yawn y) {
        return y.yawn(10, null);
    }

    public static void main(String... unused) {
        System.out.print(takeNap(new Sloth()));

        // System.out.print(takeNap((z,f) -> { String x = ""; return "Sleep: " + x })); // DOES NOT COMPILE

        // System.out.println(takeNap((t,s) -> { String t = ""; return "Sleep: " + t; })); // DOES NOT COMPILE

        // System.out.println(takeNap((w,q) -> {"Sleep: " + w})); // DOES NOT COMPILE

        // System.out.println(takeNap((e,u) -> { String g = ""; "Sleep: " + e })); // DOES NOT COMPILE

        System.out.println();
        System.out.println(takeNap((a, b) -> "Sleep: " + (double) (b == null ? a : a)));

        System.out.println();
        System.out.println(takeNap((r,k) -> { String g = ""; return "Sleep:"; }));
    }
}
