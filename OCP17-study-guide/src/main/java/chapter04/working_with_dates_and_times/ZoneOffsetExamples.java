package chapter04.working_with_dates_and_times;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;
import java.util.Set;

public class ZoneOffsetExamples {

    public static void main(String[] args) {

        printOffSetV1("+04:00");
        // printOffSetV1("04:00"); //  Invalid ID for ZoneOffset, non numeric characters found: 04:00
        // printOffSetV1("+4:00"); // Invalid ID for ZoneOffset, non numeric characters found: +4:00

        // printOffSetV1("+23:00"); //  Zone offset hours not in valid range: value 23 is not in the range -18 to 18

        printOffSetV2("Europe/Rome");
    }

    private static void printOffSetV1(String offsetId) {
        ZoneOffset zoneOffset = ZoneOffset.of(offsetId);
        System.out.println(zoneOffset);
        System.out.println(zoneOffset.getRules());
    }

    private static void printOffSetV2(String zoneId) {
        LocalDateTime now = LocalDateTime.now();
        ZoneId zone = ZoneId.of(zoneId);
        ZoneOffset zoneOffSet = zone.getRules().getOffset(now);
        ZoneRules zoneRules = zoneOffSet.getRules();
        System.out.println("zoneRules : " + zoneRules);
        System.out.println("zoneOffSet : " + zoneOffSet);
    }
}
