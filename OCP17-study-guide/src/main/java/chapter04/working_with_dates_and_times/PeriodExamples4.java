package chapter04.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExamples4 {

    public static void main(String[] args) {

        Period period = Period.of(0, 1, 5);
        System.out.println(period);

        System.out.println("Days : " + period.getDays());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Years : " + period.getYears());
        System.out.println("ChronoUnit.DAYS : " + period.get(ChronoUnit.DAYS));
        System.out.println("multipliedBy : " + period.multipliedBy(2));
        System.out.println("Units : " + period.getUnits()); // Supported units

        Period period2 = Period.ofDays(-5);
        System.out.println(period2);
        System.out.println(period2.negated());
        System.out.println("IsNegative : " + period2.isNegative());
        LocalDate localDate = LocalDate.of(2023, 1, 1);
        System.out.println(localDate.plus(period2));
        System.out.println(localDate.minus(period2));


    }
}
