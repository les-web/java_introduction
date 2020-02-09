package datetime;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();

        System.out.println("Aktualne data i czas " + currentTime);
        System.out.println("Dzis jest " + currentTime.getDayOfYear());

        String someDate = "1957/03/03 20:34";
        String format = "yyyy/MM/dd HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDateTime someDateParsed = LocalDateTime.parse(someDate,formatter);
        System.out.println("Jakaś data to " + someDateParsed);

        System.out.println("czy teraz jest przed 1957/03/23 ?" + currentTime.isBefore(someDateParsed));

        Period period = Period.between( someDateParsed.toLocalDate(), currentTime.toLocalDate());
        int daysBetweenTwoDates = period.getDays();
        int yearsBetweenTwoDates = period.getYears();
        System.out.println("Roznica w latach " + yearsBetweenTwoDates);
    }
}
