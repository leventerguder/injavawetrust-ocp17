package chapter04.understanding_equality;

public class StringPool4 {

    public static void main(String[] args) {

        var x = "Hello World";
        var y = new String("Hello World");
        System.out.println(x == y); // false
    }
}
