package chapter04.questions.q11;

import java.time.LocalDate;

public class Q11 {
    public static void main(String[] args) {

        var date = LocalDate.of(2022, 4, 3);
        date.plusDays(2);
        //date.plusHours(3); // DOES NOT COMPILE

        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

    }
}
