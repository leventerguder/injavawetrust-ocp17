package chapter04.working_with_dates_and_times;

import java.time.Instant;
import java.time.ZoneId;
import java.time.zone.ZoneRules;
import java.util.Set;

public class ZoneIdExamples {

    public static void main(String[] args) {

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        System.out.println("System Default Zone : " + ZoneId.systemDefault());
        System.out.println("Zone Count : " + zoneIds.size());
        for (String zoneId : zoneIds)
            System.out.println(zoneId);

        System.out.println();

        printDayLightSavings(ZoneId.of("Europe/Berlin"));
        printDayLightSavings(ZoneId.of("Europe/Istanbul"));
        printDayLightSavings(ZoneId.of("America/Chicago"));
        printDayLightSavings(ZoneId.of("Asia/Kolkata"));


    }

    private static void printDayLightSavings(ZoneId zoneId) {

        System.out.println("##########");
        System.out.println(zoneId);
        ZoneRules zoneRules = zoneId.getRules();
        System.out.println(zoneRules);
        boolean isDaylightSavings = zoneRules.isDaylightSavings(Instant.now());


        System.out.println("isDaylightSavings : " + isDaylightSavings);
        System.out.println("nextTransition : " + zoneRules.nextTransition(Instant.now()));

    }
}
