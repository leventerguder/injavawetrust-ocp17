package chapter11.handling_exceptions;

public class AddingAFinallyBlock4 {


    public static void main(String[] unused) {

        System.out.println(goHome());
    }

    static int goHome() {
        try {
            System.out.println("##1##");
            return -1;
        } catch (Exception e) {
            System.out.println("2");
            return -2;
        } finally {
            System.out.println("##3##");
            return -3;

        }
    }
}
