package exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
Cwiczenia klasowe 20200209

1. W tablicy użytkowników znajdź takiego, którego połączenie imienia i nazwiska jest najdluzsze
2. W tablicy użytkowników oblicz średni wiek użytkowników
3. W tablicy użytkowników wyświetl tylko tych, których imię i nazwisko zaczyna się na te samą literę
4. Wczytaj imię, nazwisko wiek, utwórz obiekty klasy user. Następnie wyświetl je
5. Wczytaj date urodzenia, podaj wiek
6. Zmodyfikuj zadanie pierwsze - zamiast wieku wczytuj datę urodzenia. Wyświetl najstarszego i najmłodszego uzytkownika
*/
public class Exercise6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // uruchamiamy wczytywanie danych
        Userbirth users100[] = new Userbirth[100];
        int nOfPersons = 0;
        System.out.println(" ------------ Input the data for new Players  ---------------------");
        String input;
        String data[];
        String name4;
        String lastName4;
        String dateOfBirth4;
        String format = "yyyy/MM/dd";
        LocalDate varDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        String exitCode = "exit";
        do {
            System.out.println(" Player " + (nOfPersons + 1));
            input = scanner.nextLine();
            if (input.startsWith(exitCode)) {
                break;
            } else {
                data = input.split(" ");
                name4 = data[0];
                lastName4 = data[1];
                dateOfBirth4 = data[2];
                varDate = LocalDate.parse(dateOfBirth4, formatter);


                users100[nOfPersons] = new Userbirth(name4, lastName4, varDate);
                ++nOfPersons;

            }
        } while (input != exitCode);
        System.out.println("--------End of data input ------------");


        // print all players
        System.out.println("--------------- The Players ----------------------");
        System.out.println("Number of Players equals :" + nOfPersons);
        for (int i = 0; i < nOfPersons; i++) {
            System.out.println(users100[i].toString());

        }

//  6. Zmodyfikuj zadanie pierwsze - zamiast wieku wczytuj datę urodzenia. Wyświetl najstarszego i najmłodszego uzytkownika
        int iOldest = 0;
        int iYoungets =0;
        LocalDate oldestBirth = users100[0].getDateOfBirth();
        LocalDate iYoingest = users100[0].getDateOfBirth();
        for (int i = 0; i < nOfPersons ; i++) {
            if ( users100[i].getDateOfBirth().compareTo(oldestBirth) > 0) {
                iOldest = i;
                oldestBirth = users100[i].getDateOfBirth();
            };
            if (users100[i].getDateOfBirth().compareTo(iYoingest) < 0) {
                iYoungets = i;
                iYoingest = users100[i].getDateOfBirth();
            }
            i++;

        }
        System.out.println("Oldest is " + users100[iOldest].toString());
        System.out.println("Youngets is " + users100[iYoungets].toString());
    }


}

