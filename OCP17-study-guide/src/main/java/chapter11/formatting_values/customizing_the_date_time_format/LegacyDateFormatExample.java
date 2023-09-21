package chapter11.formatting_values.customizing_the_date_time_format;

import java.text.DateFormat;
import java.util.Date;

public class LegacyDateFormatExample {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("Date :" + date);

        DateFormat dateFormat = DateFormat.getInstance();
        System.out.println("getInstance() : " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance();
        System.out.println("getDateInstance() : " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("getDateInstance(DateFormat.SHORT):" + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("getDateInstance(DateFormat.MEDIUM):" + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("getDateInstance(DateFormat.LONG):" + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("getDateInstance(DateFormat.LONG):" + dateFormat.format(date));
    }
}
