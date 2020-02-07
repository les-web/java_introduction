package classes.basics.homework20200205;

public class MacierzeOperacje {

    // Method to print a matrix
    public static void printMatrix(int [][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
                System.out.print(" - ");
            }
            System.out.println();

        }
    }
    public static void printMatrixDouble(double [][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
                System.out.print(" - ");
            }
            System.out.println();

        }
    }
    // Method to add two matrices A(rows,columns) + B (rows,columns)
    // returns matrix C (same size as A and B) = A + B
    public static int [][] addMatricesInt(int[][] firstMatrix, int[][] secondMatrix) {
        int [][] result = new int [firstMatrix.length][secondMatrix[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = (firstMatrix[row][col] + secondMatrix [row][col]);
            }
        }

        return result;
    }
    // Method to subtract two matrices A(rows,columns) - B (rows,columns)
    // returns matrix C (same size as A and B) = A - B
    public static int [][] subtractMatricesInt(int[][] firstMatrix, int[][] secondMatrix) {
        int [][] result = new int [firstMatrix.length][secondMatrix[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = (firstMatrix[row][col] - secondMatrix [row][col]);
            }
        }

        return result;
    }

    // Method to multiply two matrices A(rows1,columns1) * B (rows2,columns2) assumption columns1 = rows2

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

    // transposition of a matrix

    public static int [][] transposeMatrixInt(int [][] matrix){
        int [][] temp = new int [matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                temp[j][i] = matrix[i][j];
        return temp;
    }

    // division of matrices, result C = A / B

    public static double [][] divideMatrixInt(int [][] firstMatrix,  int [][] secondMatrix) {
        double [][] resultD = new double [firstMatrix.length][secondMatrix[0].length];

        for (int row = 0; row < resultD.length; row++) {
            for (int col = 0; col < resultD[row].length; col++) {
                resultD[row][col] = (1.0 * firstMatrix[row][col]) / secondMatrix[row][col];
            }
        }

        return resultD;
    }

}
