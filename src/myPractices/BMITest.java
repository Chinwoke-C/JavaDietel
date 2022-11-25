package myPractices;

import java.util.Scanner;

public class BMITest {
    public static void main(String[] args) {

        BMI bmi = new BMI("sarah", 20, 56.6, 6);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        bmi.setName(input.next());

        System.out.print("Enter your weight in pounds: ");
        bmi.setWeight(input.nextDouble());

        System.out.print("Enter your height: ");
        bmi.setHeight(input.nextDouble());

        System.out.printf("The  body mass index for %s%n is %f%n and the status is %s ", bmi.getName(), bmi.getBMI(), bmi.validateStatus());
        System.out.println();
    }
}