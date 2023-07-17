package chapter04.questions.q08;

public class Q08 {

    public static void main(String[] args) {

        method1();
        method2();
        method3();
        // method4(); // StringIndexOutOfBoundsException
        method5();
        method6();

    }

    static void method1() {

        var string = "12345";
        var builder = new StringBuilder("12345");

        System.out.println(builder.charAt(4));
    }

    static void method2() {

        var string = "12345";
        var builder = new StringBuilder("12345");

        System.out.println(builder.replace(2, 4, "6").charAt(3));
    }

    static void method3() {

        var string = "12345";
        var builder = new StringBuilder("12345");

        System.out.println(builder.replace(2, 5, "6").charAt(2));
    }

    static void method4() {

        var string = "12345";
        var builder = new StringBuilder("12345");

        System.out.println(string.charAt(5));
    }

    static void method5() {

        var string = "12345";
        var builder = new StringBuilder("12345");

        // System.out.println(string.length); // DOES NOT COMPILE
    }

    static void method6() {

        var string = "12345";
        var builder = new StringBuilder("12345");

        System.out.println(string.replace("123", "1").charAt(2));

    }
}
