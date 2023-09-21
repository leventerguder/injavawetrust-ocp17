package chapter11.supporting_internationalization_and_localization.localizing_dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatExample {

    public static void main(String[] args) {

        Date date = new Date();


        DateFormat usDateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println(usDateFormat.format(date));

        DateFormat itDateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALY);
        System.out.println(itDateFormat.format(date));

        DateFormat trDateFormat = DateFormat.getDateInstance(DateFormat.FULL, new Locale("tr", "TR"));
        System.out.println(trDateFormat.format(date));

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MMM.yyy", new Locale("tr", "TR"));
        System.out.println(sdf.format(date));
    }
}
