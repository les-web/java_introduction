package classes.basics.homework20200205;

public class MacierzeOperacje {

    public static int [][] multiplyMatricesInt(int[][] firstMatrix, int[][] secondMatrix) {
        int [][] result = new int [firstMatrix.length][secondMatrix[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCellInt(firstMatrix, secondMatrix, row, col);
            }
        }

        return result;
    }

    public static int multiplyMatricesCellInt(int [][] firstMatrix, int [][] secondMatrix, int row, int col) {
        int cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }

    public static void printMatrix(int [][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
                System.out.print(" - ");
            }
            System.out.println();

        }
    }
}
