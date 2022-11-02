package PracticingLoops;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
       int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        System.out.printf("The greatest common divisor of %d and %d is %d", num1, num2, gcd(num1, num2));
    }
    public static int gcd(int num1, int num2){
        int gcd = 0;
        for (int i = 1; i < num1 && i < num2 ; i++) {
            if (num1 % i == 0 && num2 % i  == 0){
                gcd = i;
        }


        }

        return gcd;
    }
}
