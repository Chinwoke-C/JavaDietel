package myPractices;

import java.util.Scanner;

public class ArithmeticProductAver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer");
        int number1 = input.nextInt();


        System.out.print("Enter second integer");
        int number2 = input.nextInt();

        System.out.println("Enter third integer");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.printf("The sum is: %d%n", sum);

        int product = number1 * number2 * number3;
        System.out.printf("The product is: %d%n", product);

        int average = sum / 3;
        System.out.printf("The average is: %d%n", average);

        int smallest;
        smallest = number1;
         if (number2 < smallest ){
             smallest = number2;
         }
        if (number3 < smallest){
            smallest = number3;
        }
        int largest;
        largest = number1;

        if (number2 > largest){
            largest = number2;
        }
        if (number3 > largest){
            largest = number3;
        }
        System.out.printf("The smallest number is: %d%n", smallest);
        System.out.printf("The largest number is: %d%n", largest);

    }
}
