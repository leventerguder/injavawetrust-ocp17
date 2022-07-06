package chapter07.understandingpolymorphism;

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());

        // System.out.println(hasTail.age); // DOES NOT COMPILE
        // System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
    }
}