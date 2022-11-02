package Chapter4;

import java.util.Scanner;

public class CryptographDecrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numString = "";
        while(numString.length() != 4){
            System.out.println("Enter any four digits");
            numString = input.nextLine();
        }
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            int n = numString.charAt(i) - '0';
            if(n < 7){
                n += 10;
            }
            n -= 7;
            num[i] = n;
        }
        int temp = num[0];
        num[0] = num[1];
        num[1] = temp;

        temp = num[2];
        num[2] = num[3];
        num[3] = temp;
        String result = "" + num[3] + num[2] + num[1] + num[0];
        System.out.println(result);
    }
}
