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
                "Wiercislaw",
                "Kunegunda"
        } ;
        /* zad 1 wypisz imiona żeńskie
        zad 2 wypisz imiona żeńskie nie dłuższe niż 3 znaki
        zd 3 wypisz imiona słowiańskie  - kończą się na sław lub mir
        zad 4 znajdz najdłuższe imię
         */

        // zad 1
        for (String name : names) {
            if (name.endsWith("a")) {
                System.out.println(name);
            }
        }

        // zad 2
        for (String name : names) {
            if (name.length() <=3) {
                System.out.println(name);
            }
        }

        // zad 3
        for (String name : names) {
            if (name.endsWith("sław") || name.endsWith("mir")) {
                System.out.println(name);
            }
        }

        // zad 4
        int longest = 0;
        String longestName = names[0];
        for ( int i =0; i< names[i].length(); i++) {
            if (names[i].length() > longest) {
                longest=names[i].length();
                longestName = names [i] ;
            }
            System.out.println(names[i] + " : " + names[i].length());
        }
        System.out.println(longestName);
        System.out.println(longest);
    }
}
