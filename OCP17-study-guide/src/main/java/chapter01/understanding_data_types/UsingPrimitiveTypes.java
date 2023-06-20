package chapter01.understanding_data_types;

public class UsingPrimitiveTypes {

    public static void main(String[] args) {

        boolean activated = true;

        byte size = 100;
        // byte height = 128; // DOES NOT COMPILE , max value 127

        System.out.println("byte max value : " + Byte.MAX_VALUE);
        System.out.println("byte min value : " + Byte.MIN_VALUE);

        short count = 15000;
        //short total = 35000; // DOES NOT COMPILE , max value 32767

        System.out.println("short max value : " + Short.MAX_VALUE);
        System.out.println("short min value : " + Short.MIN_VALUE);


        float sum = 150;
        // float square = 125.56; // DOES NOT COMPILE
        float square = 125.56f;
        float square2 = 12312.4534F;
    }
}
