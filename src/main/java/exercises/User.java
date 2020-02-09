package exercises;
/*
Cwiczenia klasowe 20200209

1. W tablicy użytkowników znajdź takiego, którego połączenie imienia i nazwiska jest najdluzsze
2. W tablicy użytkowników oblicz średni wiek użytkowników
3. W tablicy użytkowników wyświetl tylko tych, których imię i nazwisko zaczyna się na te samą literę
4. Wczytaj imię, nazwisko wiek, utwórz obiekty klasy user. Następnie wyświetl je
5. Wczytaj date urodzenia, podaj wiek
6. Zmodyfikuj zadanie pierwsze - zamiast wieku wczytuj datę urodzenia. Wyświetl najstarszego i najmłodszego uzytkownika
 */
public class User {
    private String name;
    private String lastname;
    private int age;

    public User(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
