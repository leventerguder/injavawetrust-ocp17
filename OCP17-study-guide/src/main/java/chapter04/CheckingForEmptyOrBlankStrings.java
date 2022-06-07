package chapter04;

public class CheckingForEmptyOrBlankStrings {

    public static void main(String[] args) {

        System.out.println(" ".isEmpty()); // false
        System.out.println("".isEmpty()); // true
        System.out.println(" ".isBlank()); // true
        System.out.println("".isBlank()); // true

    }
}
