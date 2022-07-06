package chapter07.understandingpolymorphism;

public class CrestedPenguin extends Penguin3 {
    public static int getHeight() {
        return 8;
    }

    public static void main(String... fish) {
        new CrestedPenguin().printInfo();
    }
}
