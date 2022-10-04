package Practizezz;
//(Palindrome Numbers) A positive integer is a palindrome if its value is the same after reversing the order of the digits in the number. For example, 12321 is a palindrome, but 12563 is not.
//             Write a method that determines whether a number is a palindrome. Use this method in an application that determines whether a number entered by the user is a palindrome or not and prints the
//                  result to the console.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int temp;
        for (int i = 1; i <=5 ; i++) {
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            temp = number;
            int length = String.valueOf(number).length();

            if (length == 5){
                for (int n = number; n > 0 ; n/= 10) {
                    int r = n % 10;
                    sum = (sum * 10) + r;
                }
                if (temp == sum){
                System.out.println("The number is a palindrome.");
            } else{
                    System.out.println("The number is not a palindrome.");
                }
                break;
            } else System.out.println("Enter a valid number!");

        }
    }

}
