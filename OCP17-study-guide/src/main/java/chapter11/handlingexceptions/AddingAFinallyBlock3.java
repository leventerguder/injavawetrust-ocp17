package chapter11.handlingexceptions;

public class AddingAFinallyBlock3 {


    public static void main(String[] unused) {

        System.out.println(goHome());
    }

    static int goHome() {
        try {
            System.out.print("1");
            return -1;
        } catch (Exception e) {
            System.out.print("2");
            return -2;
        } finally {
            System.out.print("3");
            return -3;

        }
    }
}
