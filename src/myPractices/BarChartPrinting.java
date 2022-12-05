package myPractices;

import java.util.Scanner;

// todo (Bar-Chart Printing Program) One interesting application of computers is to display
//        graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//        number that’s read, your program should display the same number of adjacent asterisks. For example,
//        if your program reads the number 7, it should display *******. Display the bars of asterisks after
//        you read all five numbers.
public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[5];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter a number");
            int nums = input.nextInt();

            number[i] = nums;
        }
         for(int i = 0;i < number.length;i++){
             for (int j = 0; j < number[i]; j++) {
                 System.out.print("*");

             }
             System.out.println();
         }

//        int count = 0;
//        while (count < 5) {
//        count++;
//        }
//            System.out.printf("Enter number %d: ", count + 1);
//            int number = input.nextInt();
//        for (int i = 0; i < 5; i++) {
//            System.out.print("* ");
//        }
//            System.out.println();
//        }
//
////    }
//        for(int count = 0;count < 5;count++){
//            System.out.println("Enter a number" + count + 1);{
//                int number = input.nextInt();
//            }
//            for (int i = 0;i < count;i++){
//                System.out.println("* ");
//            }
//            System.out.println();
//        }
//    }
    }
}

