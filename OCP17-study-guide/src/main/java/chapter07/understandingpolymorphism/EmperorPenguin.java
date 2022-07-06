package chapter07.understandingpolymorphism;

public class EmperorPenguin extends Penguin {

    public int getHeight() {
        return 8;
    }

    public static void main(String[] fish) {
        new EmperorPenguin().printInfo();
    }
}
