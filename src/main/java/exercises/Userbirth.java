package exercises;

import java.time.LocalDate;

/*
Cwiczenia klasowe 20200209

1. W tablicy użytkowników znajdź takiego, którego połączenie imienia i nazwiska jest najdluzsze
2. W tablicy użytkowników oblicz średni wiek użytkowników
3. W tablicy użytkowników wyświetl tylko tych, których imię i nazwisko zaczyna się na te samą literę
4. Wczytaj imię, nazwisko wiek, utwórz obiekty klasy user. Następnie wyświetl je
5. Wczytaj date urodzenia, podaj wiek
6. Zmodyfikuj zadanie pierwsze - zamiast wieku wczytuj datę urodzenia. Wyświetl najstarszego i najmłodszego uzytkownika
 */
public class Userbirth {
    private String name;
    private String lastname;
    private LocalDate dateOfBirth;      // YYYY/MM/DD

    public Userbirth(String name, String lastname, LocalDate dateOfBirth) {
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    // poprawione na pieszo aby wyświetlać Player zamiast User
    public String toString() {
        return "Player {" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
