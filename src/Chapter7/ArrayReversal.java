package Chapter7;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int [] baller = {12,3,7,8,10,11};
        System.out.println(Arrays.toString(reverse(baller)));

    }
    public  static int[] reverse(int [] list){
        for (int i = 0; i <list.length ; i++) {
            int j = list.length-i-1;
            swap(list, i,j);

        }
        return list;
    }

    private static void swap(int[] list, int i, int j) {
        int temp = list [i];
         list[i] = list[j];
         list[j] = temp;
    }
}
