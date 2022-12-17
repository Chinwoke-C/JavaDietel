package myPractices;

import java.util.Scanner;

public class Prac {
    public void showInputUpperCase(){
        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();

        String upperCaseText = inputText.toUpperCase();

        System.out.println(upperCaseText);
    }
}
