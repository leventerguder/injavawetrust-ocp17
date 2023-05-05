package chapter02.assigning_values;

public class OverFlowAndUnderflow {

    public static void main(String[] args) {

        /*
        Since 2147483647 is the maximum int value, adding any strictly positive value to it will
        cause it to wrap to the smallest negative number.
         */

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(2147483647 + 1); // -2147483648


        byte b = (byte)-200;
        System.out.println(b);
    }
}
