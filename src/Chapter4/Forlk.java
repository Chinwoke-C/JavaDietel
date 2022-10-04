package Chapter4;

import java.util.stream.IntStream;

public class Forlk {
    public static void main(String[] args) {
//        int total = 0;
//        for (int number = 2; number <= 20; number += 2) {
//            total += number;
//        System.out.printf("The total is %d%n",total);
        // }
//
       int factorial = 1;
        int number = 5;
        for (int counter = number; counter >= 1; counter--) {
            factorial *= counter;
            System.out.printf("%d = %d%n",counter,factorial);
        }


    }
}

