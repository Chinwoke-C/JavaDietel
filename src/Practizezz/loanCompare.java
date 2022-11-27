package Practizezz;

import java.util.Scanner;

public class loanCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        int loanAmount = input.nextInt();
        System.out.print("number of years: ");
        int numberOfYears = input.nextInt();
        System.out.printf("%s%20s%20s%n", "Interest Rate","Monthly Payment", "Total Payment");
        double interest = 5;

        for (int i = 1; i <= numberOfYears; i++) {
            double monthlyPayment = loanAmount * interest / (1
             - 1 / Math.pow(1 + interest, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
            interest+=0.125;

            //System.out.printf("%4f%20.2f%,20f%n", interest,monthlyPayment, totalPayment);
            System.out.printf("%-10.2f%-15.2f%-15.2f%n", interest, monthlyPayment, totalPayment);
        }


        }

        }



