# Working with Dates and Times

Java provides a number of APIs for working with dates and times. There’s also an old java. util.Date class, but it is
not on the exam. You need an import statement to work with the modern date and time classes. To use it, add this import
to your program:

    import java.time.*;

**Day vs. Date**
In American English, the word date is used to represent two different concepts. Sometimes, it is the month/day/year
combination when something happened, such as January 1, 2000. Sometimes, it is the day of the month, such as “Today’s
date is the 6th.”
That’s right; the words day and date are often used as synonyms. Be alert to this on the exam, especially if you live
someplace where people are more precise about this distinction.

## Creating Dates and Times

When working with dates and times, the first thing to do is to decide how much information you need.
The exam gives you four choices:

**LocalDate** Contains just a date—no time and no time zone. A good example of LocalDate is your birthday this year. It
is your birthday for a full day, regardless of what time it is.

**LocalTime** Contains just a time—no date and no time zone. A good example of LocalTime is midnight. It is midnight at
the same time every day.

**LocalDateTime** Contains both a date and time but no time zone. A good example of LocalDateTime is "the stroke of
midnight on New Year’s Eve."

**ZonedDateTime** Contains a date, time, and time zone. A good example of ZonedDateTime is "a conference call at 9:00
a.m. EST." If you live in California, you’ll have to get up really early since the call is at 6:00 a.m. local time!

    public static LocalDate now()
    public static LocalDate of(int year, int month, int dayOfMonth) 
    public static LocalDate of(int year, Month month, int dayOfMonth)

Up to now, we’ve been continually telling you that Java counts starting with 0. Well, months are an exception. For
months in the new date and time methods, Java counts starting from 1, just as we humans do.

    public static LocalTime now()
    public static LocalTime of(int hour, int minute)
    public static LocalTime of(int hour, int minute, int second)
    public static LocalTime of(int hour, int minute, int second, int nanos)

You can combine dates and times into one object:

    public static LocalDateTime now()

    public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
    public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
    public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)

    public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
    public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
    public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)

    public static LocalDateTime of(LocalDate date, LocalTime time)

In order to create a ZonedDateTime, we first need to get the desired time zone.

    public static ZonedDateTime now()
    public static ZonedDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos, ZoneId zone)
    public static ZonedDateTime of(LocalDate date, LocalTime time, ZoneId zone)
    public static ZonedDateTime of(LocalDateTime dateTime, ZoneId zone)

Notice that there isn’t an option to pass in the Month enum. Also, we did not use a con- structor in any of the
examples. The date and time classes have private constructors along with static methods that return instances. This is
known as the factory pattern. The exam creators may throw something like this at you:

    var d = new LocalDate(); // DOES NOT COMPILE

Another trick is what happens when you pass invalid numbers to of(), for example:

    var d = LocalDate.of(2022, Month.JANUARY, 32) // DateTimeException

## Manipulating Dates and Times

The date and time classes are immutable.

    var date = LocalDate.of(2022, Month.JANUARY, 20);
    System.out.println(date); //2022-01-20

    date = date.plusDays(2); // 2022-01-22
    System.out.println(date);

    date = date.plusWeeks(1); //2022-01-29
    System.out.println(date);

    date = date.plusMonths(1); //2022-02-28
    System.out.println(date);

    // Java is smart enough to realize that February 29, 2022 does not exist, and it gives us February 28, 2022, instead.

    date = date.plusYears(5); // 2027-02-28
    System.out.println(date);

It is common for date and time methods to be chained. For example, without the print statements, the previous example
could be rewritten as follows:

    var date = LocalDate.of(2024, Month.JANUARY, 20);
    var time = LocalTime.of(5, 15);
    var dateTime = LocalDateTime.of(date, time)
        .minusDays(1).minusHours(10).minusSeconds(30);
    System.out.println(dateTime);

What do you think this prints?

    var date = LocalDate.of(2024, Month.JANUARY, 20);
    date.plusDays(10);
    System.out.println(date);

It prints January 20, 2024. Adding 10 days was useless because the program ignored the result.

    var date = LocalDate.of(2024, Month.JANUARY, 20); 
    date = date.plusMinutes(1); // DOES NOT COMPILE

LocalDate does not contain time. This means that you cannot add minutes to it.

|                                | Can call on LocalDate | Can call on LocalTime | Can call on LocalDateTime or ZonedDateTime |
|--------------------------------|-----------------------|-----------------------|--------------------------------------------|
| plusYears()<br/>minusYears     | Yes                   | No                    | Yes                                        | 
| plusMonths()<br/>minusMonths   | Yes                   | No                    | Yes                                        | 
| plusWeeks()<br/>minusWeeks     | Yes                   | No                    | Yes                                        |
| plusDays()<br/>minusDays       | Yes                   | No                    | Yes                                        |
| plusHours()<br/>plusWeeks      | No                    | Yes                   | Yes                                        |
| plusMinutes()<br/>minusMinutes | No                    | Yes                   | Yes                                        |
| plusSeconds()<br/>minusSeconds | No                    | Yes                   | Yes                                        |
| plusNanos()<br/>minusNanos     | No                    | Yes                   | Yes                                        |

## Working with Periods

There are five ways to create a Period class:

    public static Period of(int years, int months, int days)
    public static Period ofDays(int days)
    public static Period ofWeeks(int weeks)
    public static Period ofMonths(int months)
    public static Period ofYears(int years)

    var annually = Period.ofYears(1); // every 1 year
    var quarterly = Period.ofMonths(3); // every 3 months
    var everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks 
    var everyOtherDay = Period.ofDays(2); // every 2 days
    var everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

There’s one catch. You cannot chain methods when creating a Period.

    var wrong = Period.ofYears(1).ofWeeks(1); // every week

    // This tricky code is really like writing the following:
    var wrong = Period.ofYears(1);
    wrong = Period.ofWeeks(1);

![](working_with_dates_and_times/period.png)

As you can see, the P always starts out the String to show it is a period measure. Then come the number of years, number
of months, and number of days. If any of these are zero, they are omitted.

### Working with Durations

There is also Duration, which is intended for smaller units of time. For Duration, you can specify the number of days,
hours, minutes, seconds, or nanoseconds. And yes, you could pass 365 days to make a year, but you really
shouldn’t—that’s what Period is for.

Duration is output beginning with PT, which you can think of as a period of time. A Duration is stored in hours,
minutes, and seconds. The number of seconds includes fractional seconds.

    public static Duration of(long amount, TemporalUnit unit) 
    public static Duration ofDays(long days)
    public static Duration ofHours(long hours)
    public static Duration ofMinutes(long minutes)
    public static Duration ofSeconds(long seconds)
    public static Duration ofSeconds(long seconds, long nanoAdjustment)
    public static Duration ofNanos(long nanos)

### ChronoUnit for Differences

ChronoUnit is a great way to determine how far apart two Temporal values are. Temporal includes LocalDate, LocalTime,
and so on. ChronoUnit is in the java. time.temporal package.

    var two = LocalTime.of(6, 30);
    var date = LocalDate.of(2016, 1, 20); 
    System.out.println(ChronoUnit.HOURS.between(one, two)); 
    System.out.println(ChronoUnit.MINUTES.between(one, two)); 
    System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException

### Period vs Duration

Remember that Period and Duration are not equivalent. This example shows a Period and
Duration of the same length:

    var date = LocalDate.of(2022, 5, 25); 
    var period = Period.ofDays(1);
    var days = Duration.ofDays(1);


    System.out.println(date.plus(period)); // 2022–05–26 
    System.out.println(date.plus(days)); // Unsupported unit: Seconds

Since we are working with a LocalDate, we are required to use Period. Duration has time units in it, even if we don’t
see them, and they are meant only for objects with time.

|               | Period | Duration |
|---------------|--------|----------|
| LocalDate     | Yes    | No       |
| LocalDateTime | Yes    | Yes      |  
| LocalTime     | No     | Yes      |
| ZonedDateTime | Yes    | Yes      |

## Working with Instants

The Instant class represents a specific moment in time in the GMT time zone. Suppose that you want to run a timer:

    var now = Instant.now();
    // do something time consuming 
    var later = Instant.now();

    var duration = Duration.between(now, later); 
    System.out.println(duration.toMillis()); // Returns number milliseconds

If you have a ZonedDateTime, you can turn it into an Instant:

    var date = LocalDate.of(2022, 5, 25);
    var time = LocalTime.of(11, 55, 00);
    var zone = ZoneId.of("US/Eastern");
    var zonedDateTime = ZonedDateTime.of(date, time, zone);
    var instant = zonedDateTime.toInstant(); // 2022–05–25T15:55:00Z 
    System.out.println(zonedDateTime); // 2022–05–25T11:55–04:00[US/Eastern] 
    System.out.println(instant); // 202–05–25T15:55:00Z

You cannot convert a LocalDateTime to an Instant. Remember that an Instant is a point in time. A LocalDateTime does not
contain a time zone, and it is therefore not universally recognized around the world as the same moment in time.

## Accounting for Daylight Saving Time

You only have to work with U.S. daylight saving time on the exam, and that’s what we describe here.

![](working_with_dates_and_times/daylight.png)

For example, on March 13, 2022, we move our clocks forward an hour and jump from 2:00 a.m. to 3:00 a.m. This means that
there is no 2:30 a.m. that day. If we wanted to know the time an hour later than 1:30, it would be 3:30.

    var date = LocalDate.of(2022, Month.MARCH, 13);
    var time = LocalTime.of(1, 30);
    var zone = ZoneId.of("US/Eastern");
    var dateTime = ZonedDateTime.of(date, time, zone);
    System.out.println(dateTime); // 2022–03-13T01:30-05:00[US/Eastern]
    System.out.println(dateTime.getHour()); // 1
    System.out.println(dateTime.getOffset()); // -05:00


    dateTime = dateTime.plusHours(1);
    System.out.println(dateTime); // 2022–03-13T03:30-04:00[US/Eastern]
    System.out.println(dateTime.getHour()); // 3
    System.out.println(dateTime.getOffset()); // -04:00

Notice that two things change in this example. The time jumps from 1:30 to 3:30. The UTC offset also changes.

Finally, trying to create a time that doesn’t exist just rolls forward:

    var date = LocalDate.of(2022, Month.MARCH, 13);
    var time = LocalTime.of(2, 30);
    var zone = ZoneId.of("US/Eastern");
    var dateTime = ZonedDateTime.of(date, time, zone);
    System.out.println(dateTime); // 2022–03–13T03:30–04:00[US/Eastern]

Java is smart enough to know that there is no 2:30 a.m. that night and switches over to the appropriate GMT offset.
