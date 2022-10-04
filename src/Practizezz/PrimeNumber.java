package Practizezz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int noOfFactors = 0;
        for (int i = 1; i <= number ; i++) {

            int remainder = number % i;
            if (remainder == 0) {
                noOfFactors++;
            }
            }
            if (noOfFactors > 2){
                System.out.println("not a prime number");
        }else {
                System.out.println("it is a prime number");
            }

        }
    }

