package classes.basics.homework20200205;
/*
Operacje
Stwórz tablice dla wszystkich podstawowych liczbowych typów prymitywnych.
Stwórz klasę, która ma metody sum, multiply, divide, które odpowiednio zsumują, pomnożą i podzielą wszystkie liczby
 i zwrócą wynik odpowiedniego typu.
 */
import java.util.Random;
import java.util.Scanner;

import static classes.basics.homework20200205.MacierzeOperacje.printMatrix;

public class Macierze {
    public static void main(String[] argv) {
        int n1 = 0;
        int m1 = 0;
        int n2 = 0;
        int m2 = 0;
        System.out.println("--------------------- Działania na macierzach ------------------------");
        System.out.println(" Podaj rozmiary wszystkich macierzy <n * m>");
        System.out.println(" Podaj ilość wierszy pierwszej macierzy ");
        Scanner scanner = new Scanner(System.in);  // uruchamiamy wczytywanie danych

        n1 = scanner.nextInt();
        System.out.println(" Podaj ilość kolumn pierwszej macierzy ");
        m1 = scanner.nextInt();
        System.out.println(" Podaj ilość wierszy drugiej macierzy ");
        n2 = scanner.nextInt();
        System.out.println(" Podaj ilość kolumn drugiej macierzy ");
        m2 = scanner.nextInt();

        int[][] aInt = new int[n1][m1];
        int[][] bInt = new int[n2][m2];

        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 100

        for (int i = 0; i < n1; ++i) {
            for (int j = 0; j < m1; ++j) {
                aInt[i][j] = rand.nextInt(100);
            }

        }
        printMatrix (aInt);

        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < m2; ++j) {
                bInt[i][j] = rand.nextInt(100);
            }

        }
        printMatrix (bInt);

        int [][] wynik = MacierzeOperacje.multiplyMatricesInt(aInt, bInt);
        printMatrix (wynik);


    }


}
