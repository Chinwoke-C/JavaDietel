import java.util.Arrays;
import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.printf("%d is %s a palindrome number %n",number, (isPalindromeNumber(number) ? " ": "NOT"));
    }

    public static boolean isPalindromeNumber(int number) {
        String[] numString = Integer.toString(number).split(""); // array A
        int numLength = numString.length;
        String[] newNumString = new String[numLength]; // array B

        for (int i = 0; i < numLength ; i++) {
            newNumString[numLength - 1 - i] = numString[i];

        }
        return Arrays.equals(numString, newNumString);


    }
}
