package chapter04.creating_and_manipulating_strings;

public class CodePointAt {

    public static void main(String[] args) {

        int unicode = "abc".codePointAt(0);
        System.out.print(String.format("\\u%04x", unicode));

    }
}
