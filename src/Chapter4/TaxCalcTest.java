package Chapter4;

import java.util.Scanner;


class TaxCalcTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaxCalc myTax = new TaxCalc("john", 15000.00, 2018);

        System.out.print("Enter citizen name: ");
        String name = input.nextLine();
        myTax.setName(name);

        System.out.print("Enter citizen income: ");
        double income = input.nextDouble();
        myTax.setIncome(income);

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        myTax.setYear(year);

        showTax(myTax);
    }

    private static void showTax(TaxCalc myTax) {
        System.out.printf("Name of citizen: %s",myTax.getName());
        System.out.println();
        System.out.printf("citizen's Earnings is: %f for the year: %d",myTax.getIncome(),myTax.getYear());
        System.out.println();
        myTax.getTax();
        System.out.println();

    }

}