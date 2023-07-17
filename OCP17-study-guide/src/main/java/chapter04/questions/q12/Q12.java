package chapter04.questions.q12;

public class Q12 {

    public static void main(String[] args) {

        var numbers = "012345678".indent(1);
        numbers = numbers.stripLeading();
        System.out.println(numbers.substring(1, 3)); //12
        System.out.println(numbers.substring(7, 7));// A blank line
        System.out.print(numbers.substring(7)); //78
    }
}
