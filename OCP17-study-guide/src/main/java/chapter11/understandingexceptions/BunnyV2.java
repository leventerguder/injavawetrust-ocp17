package chapter11.understandingexceptions;

public class BunnyV2 {

    public static void main(String[] args) {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) {
            System.out.print("sad rabbit");
        }
    }

    private static void eatCarrot() throws NoMoreCarrotsException {
    }
}
