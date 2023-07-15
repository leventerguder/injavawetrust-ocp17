package chapter04.creating_and_manipulating_strings;

public class ToCharArray {

    public static void main(String[] args) {
        String content = "injavawetrust.com";

        char[] chars = content.toCharArray();

        for (char c : chars) {
            System.out.print(c + "-");
        }
    }
}
