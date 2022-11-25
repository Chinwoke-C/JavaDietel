package Chapter4;

import java.util.Scanner;

public class PrintingDecimalEquivalent {
   public static void main(String[] args) {
       int digit1;
        int digit2;
       int digit3;
       int digit4;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter binary digits to convert: ");
        int userInput = input.nextInt();

        digit1 = userInput % 10000 % 1000 / 100;
        digit2 = userInput % 1000 / 100;
        digit3 = userInput % 1000 % 100 / 10;
        digit4 = userInput % 1000 % 100 % 10;

       System.out.println(digit1);
       System.out.println(digit2);
       System.out.println(digit3);
       System.out.println(digit4);

int decimal = digit1 * 8 + digit2 * 4 +
        digit3 * 2 + digit4;

       System.out.printf("Decimal is %d",decimal);


    }


    }

