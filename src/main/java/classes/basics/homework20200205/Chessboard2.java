package classes.basics.homework20200205;
/*
skopiowane od Jarek Partyka
 */
        import java.util.Scanner;

class ChessBoard2 {
    public static void main(String[] args) {
        ChessBoard2 chessBoard = new ChessBoard2();
        System.out.println(chessBoard);
        //System.out.println(chessBoard.toString());
    }

    @Override
    public String toString() {
        return print(x(), y());
    }

    static int x() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj X: ");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            return 0;
        }
    }

    static int y() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Y: ");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            return 0;
        }
    }

    static String print(int x, int y) {
        if (x <= 0 || y <= 0) {
            return "Błędna wartość!";
        } else {
            String[][] board = new String[x][y];
            String last = "#";
            StringBuilder stringBuilder = new StringBuilder();
            String string;
            for (int i = 0; i < x; i++) {
                if (y % 2 == 0) {
                    if ("*".equals(last)) {
                        last = "#";
                    } else {
                        last = "*";
                    }
                }
                stringBuilder.append("\r\n");
                for (int j = 0; j < y; j++) {
                    if ("*".equals(last)) {
                        last = "#";
                        board[i][j] = last;
                    } else {
                        last = "*";
                        board[i][j] = last;
                    }
                    stringBuilder.append(board[i][j]).append(" ");
                }
            }
            string = stringBuilder.toString();
            return string;
        }
    }
}

