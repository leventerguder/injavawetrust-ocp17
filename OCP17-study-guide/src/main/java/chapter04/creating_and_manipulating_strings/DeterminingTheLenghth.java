package chapter04.creating_and_manipulating_strings;

public class DeterminingTheLenghth {

    public static void main(String[] args) {

        var name = "animals";
        System.out.println(name.length()); // 7

        String empty = "";
        System.out.println(empty.length());// 0

        String whitespace = "   ";
        System.out.println(whitespace.length()); // 3

        String escape = "\\-\"-\n";
        System.out.println(escape.length());

    }
}
