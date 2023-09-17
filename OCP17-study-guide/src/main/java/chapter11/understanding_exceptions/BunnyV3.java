package chapter11.understanding_exceptions;

public class BunnyV3 {

//    public void bad() {
//        try {
//            eatCarrot();
//        } catch (NoMoreCarrotsException e) { // DOES NOT COMPILE
//            System.out.print("sad rabbit");
//        }
//    }

    // Java knows that eatCarrot() can’t throw a checked exception—which means there’s no
    // way for the catch block in bad() to be reached.

    public void good() {
        try {
            eatCarrot();
        } catch (RuntimeException e) {

        }

        try {
            eatCarrot();
        } catch (Exception e) {

        }
    }

    private static void eatCarrot() {
    }
}
