package chapter04.creating_and_manipulating_strings;

public class Concatenating {

    public static void main(String[] args) {

        System.out.println(1 + 2);          // 3
        System.out.println("a" + "b");      // ab
        System.out.println("a" + "b" + 3);  // ab3
        System.out.println(1 + 2 + "c");    // 3c
        System.out.println("c" + 1 + 2);    // c12
        System.out.println("c" + null);     // cnull


        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 64


        var s = "1";    // s currently holds "1"
        s += "2";       // s currently holds "12"
        s += "3";       // s currently holds "123"
        System.out.println(s);  // 123
    }
}
