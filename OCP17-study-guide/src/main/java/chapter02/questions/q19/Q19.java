package chapter02.questions.q19;

public class Q19 {

    public static void main(String[] args) {
        int start = 7;
        int end = 4;
        end += ++start;
        start = (byte) (Byte.MAX_VALUE + 1);

        System.out.println(start); // -128
        System.out.println(end);   // 12
    }

}
