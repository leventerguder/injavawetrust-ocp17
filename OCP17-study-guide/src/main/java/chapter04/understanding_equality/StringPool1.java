package chapter04.understanding_equality;

public class StringPool1 {

    public static void main(String[] args) {

        var x = "Hello World";
        var y = "Hello World";
        var z = "Hello " + "World";
        System.out.println(x == y); // true
        System.out.println(x == z); // true


        var x2 = "Hello World";
        var z2Part1 = "Hello";
        var z2Part2 = " World";
        var z2 = z2Part1 + z2Part2;

        System.out.println(z2 == x2);
    }
}
