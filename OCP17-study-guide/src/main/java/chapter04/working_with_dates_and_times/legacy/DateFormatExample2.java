package chapter04.working_with_dates_and_times.legacy;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatExample2 {

    public static void main(String[] args) {

        Date d1 = new Date();
        System.out.println("d1 = " + d1);
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        String s = df.format(d1);
        System.out.println(s);
        try {
            Date d2 = df.parse(s);
            System.out.println("parsed = " + d2);
        } catch (ParseException pe) {
            System.out.println("parse exc");
        }
    }
}
