package chapter02.questions.q10;

public class Q10 {

    public static void main(String[] args) {
//        short height = 1, weight = 3;
//        short zebra = (byte) weight * (byte) height; // DOES NOT COMPILE
//        double ox = 1 + height * 2 + weight;
//        long giraffe = 1 + 9 % height + 1;
//        System.out.println(zebra);
//        System.out.println(ox);
//        System.out.println(giraffe);

        /*
        Even though both height and weight are cast to byte,
        the multiplication operator automatically promotes them to int,
        resulting in an attempt to store an int in a short variable.
        For this reason, the code does not compile,
         */

        // Fixed
        short height = 1, weight = 3;
        short zebra = (short) ((byte) weight * (byte) height); // DOES NOT COMPILE
        double ox = 1 + height * 2 + weight;
        long giraffe = 1 + 9 % height + 1;
        System.out.println(zebra); // 3
        System.out.println(ox);  //6.0
        System.out.println(giraffe); // 2
    }
}
