package exercises;

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
public class Exercise1 {

    public static void main(String[] args) {

        User person = new User("Bronisław", "Komorowski", 33);
        //       System.out.println(person.toString());

        User persons[] = new User[]{
                new User("Lech", "Wałęsa", 66),
                new User("Donald", "Trumpeterski", 77),
                new User("Ronald", "Reagan", 77),
                new User("John", "Kennedy", 44),
                new User("Bill", "Clinton", 44),


        };
        // print all players
        System.out.println("--------------- The Players ----------------------");
        for (User pers : persons
        ) {
            System.out.println(pers);

        }

//        1. W tablicy użytkowników znajdź takiego, którego połączenie imienia i nazwiska jest najdluzsze
        int lengthOfNameAndLastname = 0;
        int pointerToLongest = 0;
        int j = 0; // dlugosc aktualna
        String name1;
        String lastname1;
        for (int i = 0; i < persons.length; i++) {
            name1 = persons[i].getName();
            lastname1 = persons[i].getLastname();
            j = name1.length() + lastname1.length();
            if (j > lengthOfNameAndLastname) {
                lengthOfNameAndLastname = j;
                pointerToLongest = i;
            }


        }
        person = persons[pointerToLongest];
        System.out.println("--------------------------------------------------------");
        System.out.println("Longest name and surname is : " + lengthOfNameAndLastname + " characyers.");
        System.out.println("And the winner is :");
        System.out.println(person);

        //       2. W tablicy użytkowników oblicz średni wiek użytkowników
        int sumAge = 0;
        int numberOfPlayers = persons.length;
        for (int i = 0; i < numberOfPlayers; i++) {
            sumAge = sumAge + persons[i].getAge();
        }
        System.out.println("----------------- Average age of the Players --------------------");
        System.out.println(" Equals to " + sumAge / numberOfPlayers);
        System.out.println();

//        3. W tablicy użytkowników wyświetl tylko tych, których imię i nazwisko zaczyna się na te samą literę


        System.out.println(" -----------------Players with same first character in name and lastname ----------");
        String nameN;
        String nameL;
        for (User pers : persons
        ) {
            nameN = pers.getName();
            nameL = pers.getLastname();
            if (nameN.charAt(0) == nameL.charAt(0)) {
                System.out.println(pers.toString());
            }

        }
        System.out.println(" ----------------------------------------------------------------------------------");

// 4. Wczytaj imię, nazwisko wiek, utwórz obiekty klasy user. Następnie wyświetl je
        Scanner scanner = new Scanner(System.in);  // uruchamiamy wczytywanie danych
        User persons100[] = new User[100];
        int nOfPersons =0;
        System.out.println(" ------------ Input the data for new Players  ---------------------");
        String input;
        String data[];
        String name4;
        String lastName4;
        int age4;


        String exitCode = "exit";
        do {
            System.out.println(" Player " + (nOfPersons+1));
            input = scanner.nextLine();
            if (input.startsWith(exitCode)) {
                break;
            } else {
                data = input.split(" ");
                name4 = data[0];
                lastName4 = data[1];
                age4 = Integer.valueOf(data[2]);
                person = new User(name4, lastName4,age4);
                persons100[nOfPersons] = person;
                ++nOfPersons;

            }
        } while (input != exitCode);
        System.out.println("--------End of data input ------------");


        // print all players
        System.out.println("--------------- The Players ----------------------");
        System.out.println("Number of Players equals :"+nOfPersons);
        for ( int i = 0; i< nOfPersons; i++) {
            System.out.println(persons100[i].toString());

        }

    }


}

