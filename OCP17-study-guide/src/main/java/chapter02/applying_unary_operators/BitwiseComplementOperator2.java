package chapter02.applying_unary_operators;

public class BitwiseComplementOperator2 {

    public static void main(String[] args) {

        int value = 8;
        int complement = ~value;
        System.out.println(value); // 8
        System.out.println(complement); // -9

        //8  -> 00000000 00000000 00000000 00001000
        //-9 -> 11111111 11111111 11111111 11110111
        // https://www.binaryconvert.com/convert_signed_int.html

        int value2 = 15;
        int complement2 = ~value2;
        System.out.println(value2); // 15
        System.out.println(complement2); // -16


        //15  -> 00000000 00000000 00000000 00001111
        //-16 -> 11111111 11111111 11111111 11110000
        // https://www.binaryconvert.com/convert_signed_int.html
    }
}
