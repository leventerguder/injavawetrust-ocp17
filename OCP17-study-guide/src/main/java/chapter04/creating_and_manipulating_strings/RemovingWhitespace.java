package chapter04.creating_and_manipulating_strings;

public class RemovingWhitespace {

    public static void main(String[] args) {

        System.out.println("abc".strip());          // abc
        System.out.println("\t a b c\n".strip());   // a b c

        String text = " abc\t ";

        System.out.println(text.trim().length());   // 3
        System.out.println(text.strip().length());  // 3
        System.out.println(text.stripLeading().length()); // 5
        System.out.println(text.stripTrailing().length()); // 4
    }
}
