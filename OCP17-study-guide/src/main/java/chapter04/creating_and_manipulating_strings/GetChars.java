package chapter04.creating_and_manipulating_strings;

public class GetChars {

    public static void main(String[] args) {

        String content = "injavawetrust.com";
        char[] charArray = new char[4];

        content.getChars(2, 6, charArray, 0);

        for (char c : charArray) {
            System.out.print(c + "-");
        }
    }
}
