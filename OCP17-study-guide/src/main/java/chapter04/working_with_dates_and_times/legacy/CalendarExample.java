package chapter04.working_with_dates_and_times.legacy;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {

        // Calendar c = new Calendar(); // illegal, Calendar is abstract

        Calendar cal = Calendar.getInstance();

        System.out.println("getCalendarType : " + cal.getCalendarType());

        Date date1 = cal.getTime();


        System.out.println("Calendar: " + cal);
        System.out.println("Date1 : " + date1);
        System.out.println("Day of month : " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month : " + cal.get(Calendar.MONTH)); // January -> 0

        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DAY_OF_MONTH, 10);

        Date date2 = cal.getTime();
        System.out.println("Date2 : " + date2);
        System.out.println("Month : " + cal.get(Calendar.MONTH)); // January -> 0

    }
}
