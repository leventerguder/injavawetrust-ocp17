package chapter04.working_with_dates_and_times.legacy;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class LegacyDate {

    public static void main(String[] args) {

        Date date1 = new Date();
        Date date2 = new Date(1000); //1 second after
        Date date3 = Date.from(Instant.now());
        Date date4 = Date.from(ZonedDateTime.now().toInstant());
        Date date5 = new Date(date1.getTime() + 3_600_000); // add 1 hour

        System.out.println("date1 : " + date1);
        System.out.println("date2 : " + date2);
        System.out.println("date3 : " + date3);
        System.out.println("date4 : " + date4);
        System.out.println("date5 : " + date5);


        System.out.println("currentTimeMillis() : " + System.currentTimeMillis());

        System.out.println("instant : " + date1.toInstant());

        ZonedDateTime zonedDateTime = date1.toInstant().atZone(ZoneId.systemDefault());
        System.out.println("zonedDateTime : " + zonedDateTime);

    }

}
