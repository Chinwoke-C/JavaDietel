package Chapter11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
       
        do{
            try{
                System.out.print("Enter an integer");
                int number = input.nextInt();
                System.out.println("The number entered is " + number);
                continueInput = false;
            } catch (   InputMismatchException e) {
                System.out.println();
                input.nextLine();
            }
        }while (continueInput);


    }
}

