package chapter07.questions.q21;

import java.time.LocalDate;

public record RabbitFood(int size, String brand, LocalDate expires) {
    public static int MAX_STORAGE = 100;

    // Non-canonical record constructor must delegate to another constructor
//    public RabbitFood() {
//
//    }
}