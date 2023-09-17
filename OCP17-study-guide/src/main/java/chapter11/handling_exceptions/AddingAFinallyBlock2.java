package chapter11.handling_exceptions;

public class AddingAFinallyBlock2 {


    public static void main(String[] unused) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("t");
        } catch (Exception e) {
            sb.append("c");
        } finally {
            sb.append("f");
        }
        sb.append("a");
        System.out.print(sb.toString());
    }
}
