package chapter04.questions.q17;

public class Q17 {

    public static void main(String[] args) {

        var letters = new StringBuilder("abcdefg");

        System.out.println(letters.substring(1, 2));
        System.out.println(letters.substring(2, 2));
        // System.out.println(letters.substring(6, 5)); // StringIndexOutOfBoundsException
        System.out.println(letters.substring(6, 6));
    }
}
