package chapter04;

public class TranslatingEscapes {

    public static void main(String[] args) {
        var str = "1\\t2";
        System.out.println(str); // 1\t2
        System.out.println(str.translateEscapes()); // 1 2
    }
}
