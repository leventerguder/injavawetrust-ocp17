package chapter11.supporting_internationalization_and_localization.localizing_dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.format.FormatStyle.*;

public class DateTimeFormatterExample2 {

    public static void main(String[] args) {


        ofLocalizedDateExample();
        ofLocalizedTimeExample();
        ofLocalizedDateTimeExample();
    }


    private static void ofLocalizedDateExample() {

        System.out.println("### ofLocalizedDateExample ###");

        LocalDate today = LocalDate.now();

        DateTimeFormatter dateTimeFormatterTR = DateTimeFormatter
                .ofLocalizedDate(LONG)
                .withLocale(new Locale("tr", "TR"));

        DateTimeFormatter dateTimeFormatterIT = DateTimeFormatter
                .ofLocalizedDate(LONG)
                .withLocale(Locale.ITALY);

        DateTimeFormatter dateTimeFormatterGE = DateTimeFormatter
                .ofLocalizedDate(LONG)
                .withLocale(Locale.GERMANY);


        System.out.println(dateTimeFormatterTR.format(today));
        System.out.println(dateTimeFormatterIT.format(today));
        System.out.println(dateTimeFormatterGE.format(today));
    }

    private static void ofLocalizedTimeExample() {

        System.out.println("### ofLocalizedTimeExample ###");
        LocalTime now = LocalTime.now();
        DateTimeFormatter dateTimeFormatterTr = DateTimeFormatter
                .ofLocalizedTime(SHORT)
                .withLocale(new Locale("tr", "TR"));


        DateTimeFormatter dateTimeFormatterGE = DateTimeFormatter
                .ofLocalizedTime(MEDIUM)
                .withLocale(Locale.GERMANY);

        System.out.println(dateTimeFormatterTr.format(now));
        System.out.println(dateTimeFormatterGE.format(now));
    }
    private static void ofLocalizedDateTimeExample() {

        System.out.println("### ofLocalizedDateTimeExample ###");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatterTr = DateTimeFormatter
                .ofLocalizedDateTime(FULL, SHORT)
                .withLocale(new Locale("tr", "TR"));

        DateTimeFormatter dateTimeFormatterFR = DateTimeFormatter
                .ofLocalizedDateTime(FULL, SHORT)
                .withLocale(Locale.FRANCE);

        System.out.println(dateTimeFormatterTr.format(now));
        System.out.println(dateTimeFormatterFR.format(now));
    }
}
