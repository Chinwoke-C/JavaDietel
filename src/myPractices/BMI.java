package myPractices;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in metres: ");
        double height = input.nextDouble();

        double bmi = (weight * 703 )/ (height * height);

        System.out.printf("Your body mass index is: %.1f%n", bmi);

        if (bmi < 18){
            System.out.println("You are underweight, Eat more!");
        }
        if (bmi > 18 && bmi < 25){
            System.out.println("You are doing well!");
        }
        if (bmi > 25 && bmi < 30){
            System.out.println("You are overweight");
        }
        if (bmi > 30){
            System.out.println("You are obese oh!");
        }


    }
}
