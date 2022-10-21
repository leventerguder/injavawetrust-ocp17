package chapter04.working_with_dates_and_times.legacy;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample2 {

    public static void main(String[] args) {

        Date d1 = new Date(1000000000000L);
        System.out.println("1st date " + d1.toString());


        Calendar c = Calendar.getInstance();
        c.setTime(d1);                          // #1
        if (Calendar.SUNDAY == c.getFirstDayOfWeek())   // #2
            System.out.println("Sunday is the first day of the week");
        System.out.println("trillionth milli day of week is "
                + c.get(Calendar.DAY_OF_WEEK));
        c.add(Calendar.MONTH, 1);
        Date d2 = c.getTime();
        System.out.println("new date " + d2.toString());
    }
}
