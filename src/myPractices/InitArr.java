package myPractices;

public class InitArr {
    public static void main(String[] args) {
        int[] Num = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
        for (int counter = 0; counter < Num.length; counter++){
            total += Num[counter];
        }
        System.out.printf("The total of the array is: %d%n", total);

    }
}
