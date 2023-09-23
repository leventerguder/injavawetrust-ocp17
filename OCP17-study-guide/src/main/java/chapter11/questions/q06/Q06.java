package chapter11.questions.q06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q06 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2022-04-30",
                DateTimeFormatter.ISO_LOCAL_DATE_TIME); // DateTimeParseException

        System.out.println(date.getYear() + " " +
                date.getMonth() + " " +
                date.getDayOfMonth());

    }
}
