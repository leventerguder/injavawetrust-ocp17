package chapter04;

public class StringBuilderToString {

    public static void main(String[] args) {

        var sb = new StringBuilder("ABC");
        String s = sb.toString();
        System.out.println(s);
    }
}
