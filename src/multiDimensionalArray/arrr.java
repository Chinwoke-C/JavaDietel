package multiDimensionalArray;

import java.util.Arrays;

public class arrr {
    public static void main(String[] args) {
//        int[] [] [] products = new int [10] [] [];
//        for (int i = 0; i < products.length ; i++) {
//            products[i] = new int[5][3];
//            System.out.println(Arrays.deepToString(products[i]));
//
        int [] [] matrix = new int [10] [10];
        for (int row = 0; row <matrix.length ; row++) {
            for (int column = 0; column < matrix[row].length ; column++) {
                System.out.print(matrix[row][column] + " ");
            }
                System.out.println();

        }
        }
    }

