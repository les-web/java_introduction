package exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Exercise5 {

    public static void main(String[] args) {


        System.out.println("--------------- Age calculation for given birth date --------------------");
        System.out.println("Give the birth date in the format YYYY/MM/DD :");

        Scanner scanner = new Scanner(System.in);  // uruchamiamy wczytywanie danych

        LocalDate currentTime = LocalDate.now();

        String someDate = scanner.nextLine();
        String format = "yyyy/MM/dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate someDateParsed = LocalDate.parse(someDate, formatter);
        Period period = Period.between(someDateParsed, currentTime);
        int yearsBetweenTwoDates = period.getYears();
        System.out.println("Age in years " + yearsBetweenTwoDates);


    }
}