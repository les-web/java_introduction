package classes.basics;

public class Test {
    public static void main(String[] args) {
        // inicjacja obiektu
        String nazwisko = "Kowalski";
        User adam = new User("Adam", nazwisko, 17);

//        adam.name = "Adam";
//        adam.lastname = "Kowalski";
//        adam.age = 36;

        System.out.println(adam.name);
        System.out.println(adam.lastname);
        System.out.println(adam.age);

        User jozek = new User("Józek", "Nowak", 42);
//        jozek.name = "Józef";
//        jozek.lastname = "Nowak";
//        jozek.age = 42;
//
        jozek.introduce();
        User cloneJozek = new User(jozek);
        cloneJozek.introduce();
        cloneJozek.name = "Robert";
        cloneJozek.age = 20;
        cloneJozek.introduce();

        // User.minAge =40;
        System.out.println("---------- Test wieku ---------");
        System.out.println("Czy Adam jest dorosły? " + adam.isAdult());
        System.out.println("Czy Jozek jest dorosły? " + jozek.isAdult());
        System.out.println("Czy Robert jest dorosły? " + cloneJozek.isAdult());

    }
}
