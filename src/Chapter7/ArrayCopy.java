package Chapter7;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
//        int[] sourceArray = {2,3,1,5,10};
//        int[] targetArray = new int [sourceArray.length];
//
//        for (int i = 0; i < sourceArray.length ; i++) {
//            targetArray[i] = sourceArray[i];
//        System.out.print(targetArray[i] + " ");
//        }
        int[] source = {3, 4, 5};
        int[] tag = new int[source.length];
        System.arraycopy(source, 0, tag, 0, source.length);
        System.out.print(Arrays.toString(tag));
    }
}
