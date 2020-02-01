public class Strings {

    public static void main(String[] args) {

        String text = "Ala ma kota";
        String text2 = "Ala ma kota";

        // Utwórz string "Ala ma kota" wykorzystując StringBuildera i metody append
        StringBuilder builder = new StringBuilder();
        builder.append("Ala");
        builder.append(" ma ");
        builder.append(2);
        builder.append(" koty");
        String resultText = builder.toString();
        System.out.println("Napis utworzony: " + resultText);

        // znajdż znak 5 w napisie

        char char5 = text.charAt(4);
        System.out.println(" 5 znak to: " + char5);

        // Sprawdz czy napis zaczyna się od słowa "Ala" i konczy slowem "kota"

        System.out.println("Zaczyna się od Ala " + text.startsWith("Ala"));
        System.out.println("Kończy się na kota " + text.endsWith("kota"));

        String napis ="Litwo! Ojczyzno moja!";
        System.out.println("Długośc napisu - " + napis +" - wynosi: " + napis.length());

        napis = "abcdefgh";
        System.out.println("d znajduje się na pozycji " + (napis.indexOf('d') + 1));

        napis = "Ala ma kota, kot ma mleko";
        String subString = napis.substring(6,11);
        System.out.println(subString);

        boolean zawiera; // czy jest ALA
        String duzyNapis = napis.toUpperCase();
        System.out.println("czy zawiera ALA " + duzyNapis.contains("ALA"));

        // czy "Ala ma kota" i "ALA MA KOTA" sa takie same equals equalsIgnoreCase
        




//        System.out.println("Text1: " + text + ", text2: " + text2);
//        System.out.println( text == text2);
//        System.out.println("Czy obie zmienne to to samo ? " + text.equals(text2));
    }
}
