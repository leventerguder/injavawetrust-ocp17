package chapter04;

public class StringBuilderCommonMethods {

    public static void main(String[] args) {

        // These four methods work exactly the same as in the String class.
        var sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
    }
}
