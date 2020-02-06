package classes.basics.homework20200205;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // uruchamiamy wczytywanie danych
        System.out.println(" ------------ Triangle drawing with char * ---------------------");
        System.out.println(" Input the number of * to start with <1, n> ");
        int n;
        n = scanner.nextInt();

        TriangleDraw.triangleDraw (n);
        System.out.println(" ------------ Reverse Triangle drawing with char * ---------------------");

        TriangleDraw.reverseTriangleDraw (n);

        System.out.println(" ------------ Chessboard drawing  ---------------------");
        TriangleDraw.drawChessBoard2 (n);


        System.out.println(" ------------ Framed Chessboard drawing  ---------------------");
        TriangleDraw.drawChessBoardWithFrame (n);


    }
}
