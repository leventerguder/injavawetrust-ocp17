package chapter11.handling_exceptions;

public class DuckedException {

    public static void main(String[] args) {
        System.out.println("main process...");
        flat1();
        System.out.println("Not Printed!!");
    }

    static void flat1() {
        System.out.println("flat1 process...");
        flat2();
    }

    static void flat2() {
        System.out.println("flat2 process...");
        flat3();
    }

    static void flat3() {
        System.out.println("flat3 process...");
        int x = 5 / 0; //

    }
}
