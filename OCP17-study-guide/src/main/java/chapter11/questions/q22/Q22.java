package chapter11.questions.q22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q22 {

    public static void main(String[] args) {
        try {
            LocalDateTime book = LocalDateTime.of(2022, 4, 5, 12, 30, 20);
            System.out.print(book.format(DateTimeFormatter.ofPattern("m")));
            System.out.print(book.format(DateTimeFormatter.ofPattern("z")));
            System.out.print(DateTimeFormatter.ofPattern("y").format(book));
        } catch (Throwable e) {
        }
    }
}
