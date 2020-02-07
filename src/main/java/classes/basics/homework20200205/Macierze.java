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
import static classes.basics.homework20200205.MacierzeOperacje.transposeMatrixInt;

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
        System.out.println(" Podaj elementy pierwszej macierzy ");

        for (int i = 0; i < n1; ++i) {
            for (int j = 0; j < m1; ++j) {
 //                aInt[i][j] = rand.nextInt(100);
                 aInt[i][j] = scanner.nextInt();
            }

        }

        System.out.println(" Podaj elementy drugiej macierzy ");

        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < m2; ++j) {

                bInt[i][j] = scanner.nextInt();
                // bInt[i][j] = rand.nextInt(100);
            }

        }
        System.out.println(" Twoja pierwsza macierz ");

        printMatrix (aInt);
        System.out.println(" Twoja druga macierz ");

        printMatrix (bInt);

// dodawanie
        System.out.println(" Wynik dodania macierzy pierwszej i drugiej ");

        int [][] wynik = MacierzeOperacje.addMatricesInt(aInt,bInt);

        printMatrix (wynik);

// odejmowanie
        System.out.println(" Wynik odjecia macierzy drugiej od pierwszej ");

        wynik = MacierzeOperacje.subtractMatricesInt(aInt,bInt);

        printMatrix (wynik);


// mnozenie
        System.out.println(" Wynik mnożenia ");

        wynik = MacierzeOperacje.multiplyMatricesInt(aInt, bInt);
        printMatrix (wynik);



// transpozycja
        System.out.println(" Transpozycja ostatniej macierzy ");

        int [][] wynik1 = MacierzeOperacje.transposeMatrixInt(wynik);
        printMatrix (wynik1);

        // dzielenie
        System.out.println(" Wynik dzielenia ");

        double [][] wynik2 = MacierzeOperacje.divideMatrixInt(aInt, bInt);
        MacierzeOperacje.printMatrixDouble (wynik2);
    }



}
