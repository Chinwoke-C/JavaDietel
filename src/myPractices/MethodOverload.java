package myPractices;

import java.util.Scanner;

public class MethodOverload {
    public int addNumber(int num1, int num2) {
        return num1 + num2;

    }
    public void addNumber(int num1, double num2){
        System.out.printf("%f%n", num1+num2);
    }
    public double addNumber(double num1, double num2){
        return num1 + num2;
    }
    public void addNumber(double num1, int num2){
        System.out.printf("%f%n",num1+num2);
    }
    public static void main(String[] args) {
    MethodOverload myMethod = new MethodOverload();
    myMethod.addNumber(5.5,6);
    myMethod.addNumber(6,4.5);
        System.out.println(myMethod.addNumber(4,5));
    System.out.println(myMethod.addNumber(4.2,4.5));
}


    }

