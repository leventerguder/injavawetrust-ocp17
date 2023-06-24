package chapter01.questions.q14;

public class Q14 {

    public static void main(String[] args) {

        // short numPets = 5L; // DOES NOT COMPILE
        //The L suffix makes the literal value a long,
        // which cannot be stored inside a short directly.

        // int numGrains = 2.0; // DOES NOT COMPILE
        // int is an integral type, but 2.0 is a double literal value

        String name = "Scruffy";

        // numPets and numGrains are both primitives,
        // and you can call methods only on reference types, not primitive values.
        // int d = numPets.length();
        // int e = numGrains.length;

        int f = name.length();
    }
}
