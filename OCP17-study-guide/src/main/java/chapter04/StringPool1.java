package chapter04;

public class StringPool1 {

    public static void main(String[] args) {

        var x = "Hello World";
        var y = "Hello World";
        var z = "Hello " + "World";
        System.out.println(x == y); // true
        System.out.println(x == z); // true
    }
}
