package chapter11.handling_exceptions;

public class AddingAFinallyBlock5 {


    public static void main(String[] unused) {

        System.out.println(goHome());
    }

    static String goHome() {
        String ref = null;
        try {
            return "try";
        } catch (Exception e) {
            return "catch";
        } finally {
            System.out.println(ref.toUpperCase());
            System.out.print("Exiting");
            return "finally";

        }
    }
}
