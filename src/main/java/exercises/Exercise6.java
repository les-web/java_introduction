package exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
Cwiczenia klasowe 20200209

6. Zmodyfikuj zadanie pierwsze - zamiast wieku wczytuj datę urodzenia. Wyświetl najstarszego i najmłodszego uzytkownika
*/
public class Exercise6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // uruchamiamy wczytywanie danych

        Userbirth users100[] = new Userbirth[100]; // deklaracja tablicy na 100 elementow klasy Userbirth
        int nOfPersons = 0; // zmienna wskazująca aktualną ilość elementów w tablicy, inicjujemy na 0 bo jest pusta
        System.out.println(" ----------------- Input the data for new Players  ---------------------");
        System.out.println(" -----------------          one per line            ---------------------");
        System.out.println(" --------------- Format: name lastname date of birth -------------------");
        System.out.println(" --------------- Format: aaaaaa bbbbbbb YYYY/MM/DD  <enter>-------------");
        System.out.println(" --------------- To finish input: type in word exit <enter>-------------");

        String input;                           // do wczytywania linijki z konsoli
        String data[];                          // do dzielenia linijki na poszczegolne elementy (name surname date of birth
        String name4;
        String lastName4;
        String dateOfBirth4;
        String format = "yyyy/MM/dd";
        LocalDate varDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        String exitCode = "exit";               // takim lancuchem ma się zakończyć wczytywanie danych

   // wczytujemy linie z danymi z konsoli
        do {
            System.out.println(" Player " + (nOfPersons + 1));
            input = scanner.nextLine();
            if (input.startsWith(exitCode)) {   // jeśli wczytano łańcuch oznaczający koniec
                break;                          // zakończ
            } else {
                data = input.split(" ");
                name4 = data[0];
                lastName4 = data[1];
                dateOfBirth4 = data[2];
                varDate = LocalDate.parse(dateOfBirth4, formatter);

                users100[nOfPersons] = new Userbirth(name4, lastName4, varDate); // nowy User idzie do tablicy
                ++nOfPersons;                   // ustaw wskaznik do tablicy dla nastepnego elementu

            }
        } while (input != exitCode);
        System.out.println(" -----------------       End of data Input         ---------------------");
        System.out.println(" -----------------    Number of Players =   " + nOfPersons+ "      --------------------");

        // print all players, just for check
        System.out.println(" -----------------         The Players             ---------------------");


        for (int i = 0; i < nOfPersons; i++) {
            System.out.println((i+1) + ") "+ users100[i].toString());
        }
        System.out.println("-------------   The Youngest and the Oldest Players --------------------");


        int iOldest = 0;                                      // wskaznik do najstarszego
        int iYoungest = 0;                                    // wskaznik tablicy do najmlodszego
        LocalDate oldestBirth = users100[0].getDateOfBirth(); // zmienna typu data na najstarszego,inicjujemy pierwszym elementem
        LocalDate youngestBirth = users100[0].getDateOfBirth(); // zmienna typu data na najmlodszego, inicjujemy pierwszym elementem
        LocalDate actualBirthDate;                             // zmienna typu data na kolejne elementy z tablicy
        for (int i = 0; i < nOfPersons; i++) {               // petla na tablice
            actualBirthDate = users100[i].getDateOfBirth(); // zapamietujemy wiek aktualnego
            if (actualBirthDate.isBefore(oldestBirth)) {     // jeśli aktualny jest starszy niz pamietany
                iOldest = i;                                // zapamietaj jego miejsce w tabeli
                oldestBirth = actualBirthDate;              // zapamietaj go
            }

            if (actualBirthDate.isAfter(youngestBirth)) {   // czy aktualny jest młodszy od najmłodzego
                iYoungest = i;                              // zapamiętaj jego miejsce w tabeli
                youngestBirth = actualBirthDate;            // zapamietaj go
            }
                                                            // koniec petli na tablice
        }
        System.out.println("Oldest is     " + users100[iOldest].toString());
        System.out.println("Youngest is   " + users100[iYoungest].toString());
        System.out.println("----------------------------   Bye   -----------------------------------");

    }
}

