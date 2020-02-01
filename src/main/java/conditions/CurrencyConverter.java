package conditions;

import java.util.Scanner;

public class CurrencyConverter {
    static final float EUR = 4.31F;
    static final float USD = 3.90F;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // uruchamiamy wczytywanie danych

        System.out.println("Podaj ilość złotych: ");
        int plns = scanner.nextInt();
        System.out.println("Podaj walutę [EUR, USD]: ");
        scanner.nextLine();
        String currencySymbol = scanner.nextLine();

        float multiplier = 1.0F;
        switch (currencySymbol) {

            case "EUR":
                multiplier = EUR;
                break;
            case "USD":
                multiplier = USD;
                break;
            default:
                System.out.println("Podano nieznaną walutę " + currencySymbol);

        }
        System.out.println(plns + " PLN to jest "+ (plns/multiplier) + " " +currencySymbol);




    }

}
