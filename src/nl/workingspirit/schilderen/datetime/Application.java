package nl.workingspirit.schilderen.datetime;

import javax.print.attribute.standard.Chromaticity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Application {

    public static void main(String[] args) {
//        Date oldSchool = new Date(); // try not to use this!

        // vanaf java 8
        // know
        LocalDate birthDayWietse = LocalDate.of(1993, 6, 7);  // new LocalDate(1993,6,7);

        LocalDate vandaag = LocalDate.now();
        System.out.println(vandaag);

        // know
        Period leeftijdWietse = Period.between(birthDayWietse, vandaag);

        System.out.println(leeftijdWietse);
        System.out.println(leeftijdWietse.getYears());
        System.out.println(leeftijdWietse.getDays());

        // know (in real life)
        long aantalDagenWietse = ChronoUnit.DAYS.between(birthDayWietse, vandaag);

        System.out.println(aantalDagenWietse);

        // LocalDateTime

        LocalDateTime nu = LocalDateTime.now();

        System.out.println(nu);

        LocalDateTime ghislaine = LocalDateTime.of(1980, 3, 15,14,0,0);
        LocalDateTime eline = LocalDateTime.of(1991, 2, 4, 19, 58,0);

        long seconds = ChronoUnit.SECONDS.between(ghislaine, eline);
        System.out.println(seconds);

        long hours = ChronoUnit.HOURS.between(ghislaine, eline);
        System.out.println(hours);

        LocalDate todayMinus4Month = LocalDate.now().minusMonths(4).plusWeeks(3).minusDays(2);
        System.out.println(todayMinus4Month);



//        LocalDateT target =  LocalDate.from()
        String myBirthDate = "1974-09-11";
        LocalDate markDate = LocalDate.parse(myBirthDate);

        System.out.println(markDate.getDayOfWeek());

    }
}
