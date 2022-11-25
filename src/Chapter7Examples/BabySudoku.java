package Chapter7Examples;

import java.util.Arrays;

public class BabySudoku {
    public static int[][] sudo(int [] [] array){

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9 ; j++) {
                int game = i + j + 1;
                array[i][j]  = game > 9 ? game % 10 +1 : game;
            }
            }
        return array;
    }

    public static void main(String[] args) {
        int[][] grid = new int[9][9];
        sudo(grid);
        for (int [] row: grid) {
            System.out.println(Arrays.toString(row));
    }
//        System.out.println(sudo(grid));
}
}
