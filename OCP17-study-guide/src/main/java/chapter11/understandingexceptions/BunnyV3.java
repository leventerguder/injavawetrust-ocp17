package chapter11.understandingexceptions;

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

    private static void eatCarrot() {
    }
}
