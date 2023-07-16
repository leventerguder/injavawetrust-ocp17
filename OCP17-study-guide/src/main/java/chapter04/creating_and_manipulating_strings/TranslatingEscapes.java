package chapter04.creating_and_manipulating_strings;

public class TranslatingEscapes {

    public static void main(String[] args) {

        System.out.println("---------");

        System.out.println("1\t2");
        System.out.println("1\"2");
        System.out.println("1\n2");
        System.out.println("1\s2");

        System.out.println("---------");

        var str = "1\\t2";
        System.out.println(str); // 1\t2
        System.out.println(str.translateEscapes()); // 1 2

        System.out.println("---------");

        var str2 = "1\\n2";
        System.out.println(str2);
        System.out.println(str2.translateEscapes());

        System.out.println("---------");

        var str3 = "1\\s2";
        System.out.println(str3); // 1\s2
        System.out.println(str3.translateEscapes()); // 1 2

        System.out.println("---------");

        var str4 = "1\\\"2";
        System.out.println(str4); // 1\"2
        System.out.println(str4.translateEscapes()); // 1"2

        System.out.println("---------");

        var str5 = "1\\\'2";
        System.out.println(str5); // 1\'2
        System.out.println(str5.translateEscapes()); // 1'2
    }
}
