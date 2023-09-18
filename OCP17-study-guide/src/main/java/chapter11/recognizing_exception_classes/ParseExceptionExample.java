package chapter11.recognizing_exception_classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExceptionExample {

    public static void main(String[] args) {

        String dateStr = "2023 12 01";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date;

        try {
            date = dateFormat.parse(dateStr);
            System.out.println(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
