package chapter11.handling_exceptions;

public class ApplyingAMultiCatchBlock2 {

    public static void main(String[] args) {

//        try {
//            System.out.println(Integer.parseInt(args[1]));
//        } catch (ArrayIndexOutOfBoundsException e| NumberFormatException e) { // DOES NOT COMPILE
//            System.out.println("Missing or invalid input");
//        }
//
//        try {
//            System.out.println(Integer.parseInt(args[1]));
//        } catch (ArrayIndexOutOfBoundsException e1| NumberFormatException e2) { // DOES NOT COMPILE
//            System.out.println("Missing or invalid input");
//        }

        //  the variable name must appear only once and at the end!
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e3) { // DOES NOT COMPILE
            System.out.println("Missing or invalid input");
        }
    }
}
