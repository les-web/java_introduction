package classes.basics.homework20200205;

import java.sql.Array;
import java.util.Arrays;

public class MyTests {
    public static void main(String[] args) {
        // jak dzialaja metody z Arrays
        int[] a = {10, 1, 3, 9, 5, 4, 7, 8, 9, 2};
        System.out.println(" Array 1d a [], length =  " + a.length);
        System.out.println(Arrays.toString(a));
        int[][] b = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}

        };
        System.out.println(" Array 2d b [][], length =  " + b.length);
        System.out.println(" Array 2d b [][], printed with toString(), length =  " + b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i]));

        }
        System.out.println(" Array 2d b [][], printed with deepToString() length =  " + b.length);
        System.out.println(Arrays.deepToString(b));


        // test is a 3d array
        int[][][] test = {
                {
                        {1, 12, 13},
                        {2, 21, 22}
                },
                {
                        {3, 31, 32, 33},
                        {4},
                        {5, 51}
                }
        };
        // for..each loop to iterate through elements of 3d array
        System.out.println(" Array 3d test [][][], printed with toString(), length = " + test.length);

        for (int[][] array2D : test) {
            for (int[] array1D : array2D) {
//                for(int item: array1D) {
//                    System.out.print(item + " ");
//                }
                System.out.println(Arrays.toString(array1D));

            }
        }
        System.out.println(" Array 3d test [][][], printed with deepToString(), length = " + test.length);
        System.out.println(Arrays.deepToString(test));

        //      System.out.println(test[1][1][0]);
        Arrays.parallelSort(a);
        System.out.println(" Array 1d a [], sorted  ");
        System.out.println(Arrays.toString(a));



    }
}
