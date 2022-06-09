package chapter04;

public class StringPool5 {

    public static void main(String[] args) {

        var name = "Hello World";
        var name2 = new String("Hello World").intern();
        System.out.println(name == name2); // true

    }
}
