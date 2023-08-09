package chapter07.understanding_polymorphism;

public class CrestedPenguin extends Penguin2 {
    public static int getHeight() {
        return 8;
    }

    public static void main(String... fish) {
        new CrestedPenguin().printInfo();
    }
}
