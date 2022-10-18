package chapter04.understanding_equality;

public class StringPool2 {

    public static void main(String[] args) {

        var x = "Hello World";
        var z = " Hello World".trim();
        System.out.println(x == z); // false

    }
}
