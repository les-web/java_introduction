package classes.basics.homework20200205;

public class TestChessboard {
/*
Szachownica w tablicy
Stworzyć arraya 2D typu String[][]. Każda komórka tej szachownicy ma zawierać
znak X albo O (X - czarne pole, O - białe pole). Tak samo jak w prawdziwej szachownicy.
Następnie wyświetlić tę szachownice na stdout.
 */
    public static void main(String[] args) {

        String[][] chessBoard = {
                {"O", "X", "O", "X", "O", "X", "O", "X"},
                {"X", "O", "X", "O", "X", "O", "X", "O"},
                {"O", "X", "O", "X", "O", "X", "O", "X"},
                {"X", "O", "X", "O", "X", "O", "X", "O"},
                {"O", "X", "O", "X", "O", "X", "O", "X"},
                {"X", "O", "X", "O", "X", "O", "X", "O"},
                {"O", "X", "O", "X", "O", "X", "O", "X"},
                {"X", "O", "X", "O", "X", "O", "X", "O"}
        };
        for (int i = 0; i < chessBoard.length ; i++) {
            for (int j = 0; j < chessBoard[0].length ; j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}
