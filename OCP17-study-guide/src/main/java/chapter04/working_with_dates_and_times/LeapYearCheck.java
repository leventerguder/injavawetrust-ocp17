package chapter04.working_with_dates_and_times;

import java.time.Year;

public class LeapYearCheck {

    public static void main(String[] args) {

        System.out.println("1980: " + Year.isLeap(1980));
        System.out.println("2000: " + Year.isLeap(2000));
        System.out.println("2016: " + Year.isLeap(2016));
        System.out.println("2020: " + Year.isLeap(2020));
        System.out.println("2096: " + Year.isLeap(2096));
        System.out.println("2100: " + Year.isLeap(2100));
        System.out.println("2104: " + Year.isLeap(2104));
        System.out.println("2200: " + Year.isLeap(2200));
        System.out.println("2300: " + Year.isLeap(2300));
        System.out.println("2304: " + Year.isLeap(2304));
        System.out.println("2400: " + Year.isLeap(2400));
    }
}
