package chapter03.controlling_flow_with_branching;

public class UnreachableCode {

    void unreachableCode() {
        int checkDate = 0;
        while (checkDate < 10) {
            checkDate++;
            if (checkDate > 100) {
                break;
                //checkDate++; // DOES NOT COMPILE
            }
        }
    }

    void unreachableCode2() {
        int minute = 1;
        WATCH:
        while (minute > 2) {
            if (minute++ > 2) {
                continue WATCH;
                // System.out.print(minute); // DOES NOT COMPILE
            }
        }
    }

    void unreachableCode3() {
        int hour = 2;
        switch (hour) {
            case 1:
                return;
            // hour++; // DOES NOT COMPILE
            case 2:
        }
    }
}
