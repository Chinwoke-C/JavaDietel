package Chapter4;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        int number = input.nextInt();
//        System.out.printf("The initial number is %d%n", number);
        if (String.valueOf(number).length() == 4){
            int encrypted = encryptNumber(number);
            System.out.printf("The encrypted number is %04d%n", encrypted);
        }else {
            System.out.println("Enter a valid value!");
        }
    }

    private static int encryptNumber(int number) {
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;
        for (int counter = 0; counter < 4; number/=10) {
            int lastDigit = ((number % 10) + 7) % 10;
            switch (counter){
                case 0: digit4 = lastDigit;
                case 1: digit3 = lastDigit;
                case 2: digit2 = lastDigit;
                case 3: digit1 = lastDigit;
            }
            counter++;

        }
        int temp = digit1;
        digit1 = digit3;
        digit3 = temp;

        temp = digit2;
        digit2 = digit4;
        digit4 = temp;

        digit1 *= 1000;
        digit2 *= 100;
        digit3 *= 10;
        return digit1 + digit2 + digit3 + digit4;

    }
}
