package chapter04.understanding_equality;

public class UnderstandingEqualityStringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello World");
        StringBuilder sb2 = new StringBuilder("Hello World");

        System.out.println(sb1 == sb2); // false
        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.toString() == sb2.toString()); // false
        System.out.println(sb1.toString().equals(sb2)); // false
        System.out.println(sb1.toString().equals(sb2.toString())); // true
    }
}
