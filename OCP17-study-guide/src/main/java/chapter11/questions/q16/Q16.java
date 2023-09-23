package chapter11.questions.q16;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q16 {

    public static void main(String[] args) {

        var f = DateTimeFormatter.ofPattern("hh o'clock"); // IllegalArgumentException
        System.out.println(f.format(ZonedDateTime.now()));
    }
}
