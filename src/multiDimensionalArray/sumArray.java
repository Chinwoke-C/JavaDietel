package multiDimensionalArray;

public class sumArray {
    public static void main(String[] args) {
        int [] [] product = new int [10] [10];
        int total = 0;
        for (int row = 0; row < product.length ; row++) {
            for (int column = 0; column <product[row].length ; column++) {

                total += product[row][column];

            }

        }
    }
}
