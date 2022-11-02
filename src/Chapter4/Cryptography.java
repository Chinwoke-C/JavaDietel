package Chapter4;

import java.util.Scanner;
//Your application should read a four-digit integer entered by the user and encrypt it as follows:
///        Replace each digit with the result of adding 7
///      to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
///        with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
///        a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
///        encryption scheme) to form the original number.

public class Cryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        while (number < 1000 || number > 9999) {
            System.out.println("Enter any four digits: ");
            number = input.nextInt();
        }
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[Math.abs(i - 3)] = (int) (((number / Math.pow(10, i)) % 10) + 7) % 10;
        }
            int temp = digits[1];
            digits[1] = digits[3];
            digits[3] = temp;

            temp = digits[2];
            digits[2] = digits[0];
            digits[0] = temp;
        System.out.println("The encrypted value are "+digits[0]+digits[1]+digits[2]+digits[3]);


        }

    }


