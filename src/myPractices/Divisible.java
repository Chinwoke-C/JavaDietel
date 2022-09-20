package myPractices;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        if (num % 3 == 0){
            System.out.printf("%d%n", num);
        }
        if (num % 3 != 0){
            System.out.println("Your value is not divisible by 3");
        }
    }
}
