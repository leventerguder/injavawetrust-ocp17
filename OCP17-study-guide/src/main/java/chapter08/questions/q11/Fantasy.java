package chapter08.questions.q11;

import java.util.function.Predicate;

public class Fantasy {
    public static void scary(String animal) {
        // var dino = s -> "dino".equals(animal);  // DOES NOT COMPILE//
        // var dragon = s -> "dragon".equals(animal); // DOES NOT COMPILE
        // var combined = dino.or(dragon);
        // System.out.println(combined.test(animal));
    }

    public static void main(String[] args) {
        scary("dino");
        scary("dragon");
        scary("unicorn");
    }
}