package chapter04.using_the_stringbuilder_class;

public class StringBuilderCommonMethods {

    public static void main(String[] args) {

        // These four methods work exactly the same as in the String class.
        var sb = new StringBuilder("animals");

        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);


        StringBuilder sb2 = new StringBuilder();
        boolean isEmpty = sb2.isEmpty();

        System.out.println("isEmpty : " + isEmpty);
        sb2.append("content");

        CharSequence charSequence = sb2.subSequence(sb2.lastIndexOf("o"), sb2.lastIndexOf("en"));

        System.out.println(charSequence);
    }
}
