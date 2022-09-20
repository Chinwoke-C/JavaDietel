package myPractices;

import java.util.Scanner;

public class circ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double radius = input.nextDouble();
        System.out.printf("The diameter is: %f ", 2*radius);
        System.out.println();
        System.out.printf(" The circumference is: %f", 2*Math.PI*radius);
        System.out.println();
//        System.out.printf(" The area is: %f", Math.PI*radius*radius);
//        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
//        System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
//        System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
//        System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
//        System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
//        System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
//        System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
//        System.out.printf("The character %c has the value %d%n", ' ', ((int) ' '));
    }
}
