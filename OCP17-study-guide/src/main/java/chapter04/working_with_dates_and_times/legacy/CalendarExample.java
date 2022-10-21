package chapter04.working_with_dates_and_times.legacy;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {

        // Calendar c = new Calendar(); // illegal, Calendar is abstract

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
    }
}
