package Chapter4;


import java.util.Scanner;

public class CreditLimitCalc {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter account no: ");
    int accountNo = input.nextInt();

        System.out.print("Enter account balance");
        int balance = input.nextInt();

        System.out.print("Enter Total charge of all items: ");
        int totalCharges = input.nextInt();

        System.out.print("Enter the total credit applied to customer account: ");
        int credit = input.nextInt();

        final int allowedCredit = 10000;


       int NewBalance =  (balance + totalCharges) - credit;

       if (NewBalance < allowedCredit){
           System.out.print("credit limit exceeded");
       }
       else{
           if (NewBalance > allowedCredit){
               System.out.print("Okay to pay");
           }


       }

    }

}
