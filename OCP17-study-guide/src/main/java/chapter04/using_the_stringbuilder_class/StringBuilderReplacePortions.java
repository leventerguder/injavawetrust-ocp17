package chapter04.using_the_stringbuilder_class;

public class StringBuilderReplacePortions {

    public static void main(String[] args) {

        replace1();
        replace2();
        replace3();
        replace4();
        replace5();
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

    private static void replace3() {
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 5, "XxXxX");
        System.out.println(builder);
    }

    private static void replace4() {
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "XxXxX");
        System.out.println(builder);
    }
    private static void replace5() {
        var builder = new String("pigeon dirty");
        builder = builder.replace("pig", "l");
        System.out.println(builder);
    }
}
