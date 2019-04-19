package nl.workingspirit.schilderen.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

// (c) https://www.logicbig.com/how-to/code-snippets/jcode-java-8-date-time-api-localdatetime-from.html
public class AdvancedApp {

    public static void main(String[] args) {

       get();

    }

    public static void get() {
        LocalDateTime myBirthDate = LocalDateTime.of(1968,8,9,15,30,0);

//       myBirthDate = LocalDateTime.now().minusMonths(1);

        int hour = myBirthDate.get(ChronoField.CLOCK_HOUR_OF_AMPM);

        System.out.println(hour);
        System.out.println(myBirthDate.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)); // => 2 since it is the second day in the week starting on 1-08-1968 and that was a Thursday

        int dayOfWeekInYear = myBirthDate.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR);
        System.out.println("Day of week in year: "+dayOfWeekInYear);

    }

    public static void format() {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        String formattedString = localDateTime.format(dateTimeFormatter);
        System.out.println(formattedString);

        DateTimeFormatterBuilder builder = new  DateTimeFormatterBuilder();
        builder.appendPattern("dd-MMMM-yyyy");

        dateTimeFormatter = builder.toFormatter();

        formattedString = localDateTime.format(dateTimeFormatter);
        System.out.println(formattedString);

        builder.appendPattern(" hh:mm:ss");
        dateTimeFormatter = builder.toFormatter();
        formattedString = localDateTime.format(dateTimeFormatter);
        System.out.println(formattedString);

        builder.appendPattern(" HH:mm:ss");
        dateTimeFormatter = builder.toFormatter();
        formattedString = localDateTime.format(dateTimeFormatter);
        System.out.println(formattedString);
    }

    public static void parse() {

        //parse
        //ISO8601
        LocalDateTime localDateTime = LocalDateTime.parse("2019-04-19T19:23:00");

        System.out.println(localDateTime);
    }

    public static void from() {
        {
            // from zoned to local
            ZonedDateTime zonedDateTime = ZonedDateTime.of(2018, 4, 18,
                    15, 20, 30, 0,
                    ZoneId.systemDefault());
            System.out.println(zonedDateTime);

            LocalDateTime d = LocalDateTime.from(zonedDateTime);
            System.out.println(d);
        }
        {
            OffsetDateTime z = OffsetDateTime.of(2016, 10, 12,
                    15, 20, 30, 0,
                    ZoneOffset.of("-6"));
            System.out.println(z);

            LocalDateTime d = LocalDateTime.from(z);
            System.out.println(d);
        }

        {
            // exception
            LocalDate d = LocalDate.of(2016, 10, 12);
            System.out.println(d);

            LocalDateTime dt = LocalDateTime.from(d);
            System.out.println(dt);
        }
    }
}
