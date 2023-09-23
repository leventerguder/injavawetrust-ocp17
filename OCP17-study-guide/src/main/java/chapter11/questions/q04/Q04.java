package chapter11.questions.q04;

public class Q04 {

    public static void main(String[] args) {


        try {
            int a = 0;
            int b = 0;
            System.out.print(a / b);
        } catch (RuntimeException e) {
            System.out.print(-1);
        }
//        catch (ArithmeticException e) { // DOES NOT COMPILE
//            System.out.print(0);
//        }
        finally {
            System.out.print("done");
        }
    }
}
