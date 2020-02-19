package classes.basics.homework20200205;

/*
Szachownica obiektowo (+)
Zaimplementować zadanie szachownica w postaci klasy ChessBoard,
 która przechowuje swoje pola szachownicy i umożliwia ustalenie dowolnego rozmiaru.
 Ma też metodę print(), która wyświetli tablicę na ekran.
 Jeśli ktoś chce wersję jeszcze trudniejszą -
zamiast metody print() nadpisać metodę toString(),
która zwróci stringa zawierającego gotową do wyświetlenia reprezentację szachownicy.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ChessBoard {
    private char chessBoard[][];
    private static char whiteField = 'A';
    private static char blackField = 'B';

    public ChessBoard(char[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public char[][] getChessBoard() {
        return chessBoard;
    }

    public static char getWhiteField() {
        return whiteField;
    }

    public static char getBlackField() {
        return blackField;
    }

    public void setChessBoard(char[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public static void setWhiteField(char whiteField) {
        ChessBoard.whiteField = whiteField;
    }

    public static void setBlackField(char blackField) {
        ChessBoard.blackField = blackField;
    }

    public char getOneField(int n, int m) {
        return this.chessBoard[n][m];
    }

    //    @Override
//    public String toString() {
//        return "ChessBoard{" +
//                "chessBoard=" + Arrays.toString(chessBoard[0]) +
//                '}';
//    }
    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
//                output = output + chessBoard[i][j];
                output = output + getOneField(i, j);
            }
            output = output + System.lineSeparator();

        }
        return output;

    }

    private static char[][] makeChessBoard(int n) {
        boolean isWhite = true;
        char[][] varTable;
        varTable = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isWhite) {
                    varTable[i][j] = whiteField;
                } else {
                    varTable[i][j] = blackField;
                }
                isWhite = !isWhite;
            }
            isWhite = !isWhite;
        }
        return varTable;
    }

    private static void print(int n) {
        char varTable[][] = new char[n][n];
        varTable = makeChessBoard(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(varTable[i][j]);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // uruchamiamy wczytywanie danych
        System.out.println("---------------------   Szachownica obiektowo   ---------------------------- ");
        System.out.println("Podaj ilość pól = ilości wierszy <n> gdzie n jest parzystą liczbą naturalną : ");
        int n = scanner.nextInt();
        setBlackField('X');
        setWhiteField('O');
        char myChessBoard[][] = makeChessBoard(n);
        System.out.println("Drukuje z wykorzystaniem metody print(n)");
        print(n);
        System.out.println("Drukuje na pieszo");
        for (int i = 0; i < myChessBoard.length; i++) {
            for (int j = 0; j < myChessBoard.length; j++) {
                System.out.print(myChessBoard[i][j]);

            }
            //          System.out.println();
            System.out.print(System.lineSeparator());
        }
        System.out.println("Drukuje z jednego stringu");
        String oneLine = myChessBoard.toString();
        System.out.println(oneLine);
        oneLine = "";
        System.out.println("Drukuje znak po znaku z tablicy");
        for (int i = 0; i < myChessBoard.length; i++) {
            for (int j = 0; j < myChessBoard.length; j++) {
                oneLine = oneLine + myChessBoard[i][j];
            }
            oneLine = oneLine + System.lineSeparator();

        }
        System.out.println(oneLine);


    }


}
