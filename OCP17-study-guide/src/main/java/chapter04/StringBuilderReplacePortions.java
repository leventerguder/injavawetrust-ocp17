package chapter04;

public class StringBuilderReplacePortions {

    public static void main(String[] args) {

        replace1();
        replace2();
    }

    private static void replace1() {
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder); // pigsty dirty
    }

    private static void replace2() {
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 100, "");
        System.out.println(builder);
    }

}
