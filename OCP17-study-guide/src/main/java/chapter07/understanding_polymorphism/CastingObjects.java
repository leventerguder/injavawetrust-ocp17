package chapter07.understanding_polymorphism;

public class CastingObjects {

    public static void main(String[] args) {

        Lemur lemur = new Lemur();
        Primate primate = lemur; // Implicit Cast to supertype
        Lemur lemur2 = (Lemur) primate; // Explicit Cast to subtype
        // Lemur lemur3 = primate; // DOES NOT COMPILE (missing cast)
    }
}
