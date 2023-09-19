package chapter11.formatting_values;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CustomizingTheDateTimeFormatExample {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f));

        // M is used for month, while y is used for year.
        // Using m instead of M means it will return the minute of the hour, not the month of the year.

        Date date = new Date();
        DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy E  HH:mm:ss:SS a ");
        System.out.println(sdf.format(date));

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
    }
}
