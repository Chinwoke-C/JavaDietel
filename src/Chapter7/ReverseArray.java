package Chapter7;


public class ReverseArray {
    public static int[] reversedArray(int[] userArr) {
        int[] reversedArray = new int[userArr.length];
        int backwardCounter = userArr.length - 1;
        int forwardCounter = 0;

        while (backwardCounter != -1) {
            reversedArray[forwardCounter] = userArr[backwardCounter];
            forwardCounter++;
            backwardCounter--;
        }
        return reversedArray;
    }


    public static void main (String[]args){
        int[] userArr = {1, 2, 3, 4, 5};
        int[] reverse = reversedArray(userArr);
        for (int count = 0; count < reverse.length; count++) {
            System.out.printf("%d    ", reverse[count]);
        }
        }
    }


