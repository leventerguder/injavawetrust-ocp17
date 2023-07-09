package chapter03.questions.q10;

import java.time.DayOfWeek;

public class Q10 {

    private DayOfWeek getWeekDay(int day, final int thursday) {

        int otherDay = day;
        int Sunday = 0;

        switch (otherDay) {
            default:
//            case 1:
//                // continue cannot be used inside a switch statement like this
//                continue;
//            case thursday: // not a compile-time constant since any int value can be passed as a parameter.
//                return DayOfWeek.THURSDAY;
            case 2, 10:
                break;
//            case Sunday: // does not compile because  Sunday is not marked as final
//                return DayOfWeek.SUNDAY;
//            case DayOfWeek.MONDAY: // DayOfWeek.MONDAY is not an int value.
//                return DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;
    }
}
