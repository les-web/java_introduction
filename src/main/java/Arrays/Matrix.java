package Arrays;

public class Matrix {

    public static void main(String[] args) {

        char[][] tree = new char[][]{
                {' ', '*', ' '},
                {' ', '*', ' '},
                {'*', '*', '*','*'},
                {'*', '*', '*','*'},
        };
        for (int i = 0; i < tree.length; i++) {
            for (int j = 0; j < tree[i].length; j++) {
                System.out.print(tree[i][j]);
            }
            System.out.println();

        }

    }
}

