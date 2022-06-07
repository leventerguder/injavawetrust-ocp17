package chapter04;

public class SearchinForSubstring {

    public static void main(String[] args) {

        System.out.println("abc".startsWith("a"));
        System.out.println("abc".startsWith("A"));

        System.out.println("abc".endsWith("c"));
        System.out.println("abc".endsWith("a"));

        System.out.println("abc".contains("b"));
        System.out.println("abc".contains("B"));

    }
}
