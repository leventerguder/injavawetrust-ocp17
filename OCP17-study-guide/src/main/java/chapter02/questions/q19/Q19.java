package chapter02.questions.q19;

public class Q19 {

    public static void main(String[] args) {
        int start = 7;
        int end = 4;
        end += ++start;
        /*
        the pre-increment operator is executed first,
        so start is incremented to 8,
        and the new value is returned as the right side of the expression
         */
        start = (byte) (Byte.MAX_VALUE + 1);

        //  Due to overflow, this will result in a negative number.

        System.out.println(start); // -128
        System.out.println(end);   // 12
    }

}
