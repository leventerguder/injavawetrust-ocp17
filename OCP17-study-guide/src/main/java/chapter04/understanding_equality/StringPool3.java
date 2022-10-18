package chapter04.understanding_equality;

public class StringPool3 {

    public static void main(String[] args) {

        var singleString = "hello world";
        var concat = "hello ";
        concat += "world";
        System.out.println(singleString == concat); // false

    }
}
