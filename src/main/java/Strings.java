public class Strings {

    public static void main(String[] args) {

        String text = "Ala ma kota";
        String text2 = "Ala ma kota";

        System.out.println("Text1: " + text + ", text2: " + text2);
        System.out.println( text == text2);
        System.out.println("Czy obie zmienne to to samo ? " + text.equals(text2));
    }
}
