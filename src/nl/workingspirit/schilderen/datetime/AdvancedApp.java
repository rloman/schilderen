package nl.workingspirit.schilderen.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

// (c) https://www.logicbig.com/how-to/code-snippets/jcode-java-8-date-time-api-localdatetime-from.html
public class AdvancedApp {

    public static void main(String[] args) {

        parse();

    }

    public static void parse() {

        //parse
        //ISO8601
        LocalDateTime localDateTime = LocalDateTime.parse("2019-04-19T19:23:00");

        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        String formattedString = localDateTime.format(dateTimeFormatter);
        System.out.println(formattedString);


        DateTimeFormatterBuilder builder = new  DateTimeFormatterBuilder();
        builder.appendPattern("dd-MM-yyyy");

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
