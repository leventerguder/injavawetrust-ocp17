package chapter11.supportinginternationalizationandlocalization;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.format.FormatStyle.*;

public class DateTimeFormatterExample2 {

    public static void print(DateTimeFormatter dtf, LocalDateTime dateTime, Locale locale) {
        System.out.println(dtf.format(dateTime) + " --- " + dtf.withLocale(locale).format(dateTime));
    }

    public static void main(String[] args) {

        Locale localeTR = new Locale("tr", "TR");
        Locale.setDefault(localeTR);
        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 15, 12, 34);

        print(DateTimeFormatter.ofLocalizedDate(MEDIUM), dt, localeTR);
        print(DateTimeFormatter.ofLocalizedTime(MEDIUM), dt, localeTR);
        print(DateTimeFormatter.ofLocalizedDateTime(FULL, SHORT), dt, localeTR);
    }
}
