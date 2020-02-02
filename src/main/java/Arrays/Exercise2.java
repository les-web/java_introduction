package Arrays;

public class Exercise2 {

    public static void main(String[] args) {

        String [] names = new String[] {
                "Ala",
                "Ola",
                "Andrzej",
                "Brunhilda",
                "Jacek",
                "Genia",
                "Sławomir",
                "Mścisław",
                "Stanisław",
                "Bronisław",
                "Wiercisław",
                "Wendzisław",
                "Kunegunda"
        } ;
        /* zad 1 wypisz imiona żeńskie
        zad 2 wypisz imiona żeńskie nie dłuższe niż 3 znaki
        zd 3 wypisz imiona słowiańskie  - kończą się na sław lub mir
        zad 4 znajdz najdłuższe imię
         */

        // zad 1
        System.out.println("Imiona żeńskie");
        for (String name : names) {
            if (name.endsWith("a")) {
                System.out.println(name);
            }
        }

        // zad 2
        System.out.println("Imiona żeńskie nie dłuższe niż 3 znaki");
        for (String name : names) {
            if (name.length() <=3) {
                System.out.println(name);
            }
        }

        // zad 3
        System.out.println(" Imiona słowiańskie");
        for (String name : names) {
            if (name.endsWith("sław") || name.endsWith("mir")) {
                System.out.println(name);
            }
        }

        // zad 4
        int longest = 0;
        for ( int i =0; i< names.length; i++) {
            if (names[i].length() > longest) {
                longest=names[i].length();
            }

        }
        System.out.println("Najdłuższe imię to "+ names[longest]);
        System.out.println("Długość imienia w znakach: "+ longest);

        int longestNamelength = 0;
        for ( String name : names) {
            if (longestNamelength < name.length()) {
                longestNamelength = name.length();
            }
        }
        System.out.println("Najdłuższe imiona mają po " + longestNamelength + " znaków, Są to :");
        for (String name : names) {
            if ( longestNamelength == name.length()) {
                System.out.println(name);
            }
        }
    }
}
