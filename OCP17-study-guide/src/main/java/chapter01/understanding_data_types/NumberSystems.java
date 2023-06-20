package chapter01.understanding_data_types;

public class NumberSystems {

    public static void main(String[] args) {

        // Octal (digits 0–7), which uses the number 0 as a prefix

        int octalVar1 = 017;
        // 017 -> 8^1*1 + 8^0*7 = 15

        int octalVar2 = 025;
        // 025 -> 8^1*2 + 8^0*5 = 21

        //int octalVar3 = 038; // DOES NOT COMPILE
        // [0-7] numbers are valid.

        System.out.println(octalVar1);
        System.out.println(octalVar2);


        // Hexadecimal (digits 0–9 and letters A–F/a–f), which uses 0x or 0X as a prefix
        // Hexadecimal is case insensitive
        // 10 -> A , 11 -> B , 12 -> C , 13 -> D , 14 ->E , 15 -> F
        int hexadecimal1 = 0xFF;
        // 0xFF -> 16^1*15 + 16^0*15 = 255

        int hexadecimal2 = 0X234;
        // 0x234 -> 16^2*2 + 16^1*3 + 16^0*4 = 564


        // int hexadecimal3 = 0xcafeg; // DOES NOT COMPILE
        //[0-F]
        // g is invalid.

        System.out.println(hexadecimal1);
        System.out.println(hexadecimal2);

        // Binary (digits 0–1), which uses the number 0 followed by b or B as a prefix

        int binary1 = 0b10;
        // 0b10 -> 2^1*1 + 2^0*0 = 2

        int binary2 = 0B1101;
        // 0b10 -> 2^3*1 + 2^2*1 + 2^0*1 = 14

        //int binary3 = 0B210; // DOES NOT COMPILE
        // [0-1]

        System.out.println(binary1);
        System.out.println(binary2);
    }
}
