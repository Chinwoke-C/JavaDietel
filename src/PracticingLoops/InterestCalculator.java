package PracticingLoops;

public class InterestCalculator {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.printf("10000 at %d percent interest is %.2f", i, CalculateInterestRate(10000, i));
            System.out.println();

        }

    }
    public static double CalculateInterestRate(double amount, double interestRate){
       double rate = interestRate/100;
        return (amount * (interestRate/100));
    }
}
