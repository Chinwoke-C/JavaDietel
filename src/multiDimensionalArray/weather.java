package multiDimensionalArray;

import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        final int numberOfDays = 10;
        final int numberOfHours = 24;
        double[][][] data = new double[numberOfDays][numberOfHours][2];

        Scanner input = new Scanner(System.in);
        for (int row = 0; row < numberOfDays * numberOfHours; row++) {
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();
            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidity;

        }
        //The average daily temperature and humidity
        for (int i = 0; i < numberOfDays; i++) {
            double dailyTemperatureTotal = 0;
            double dailyHumidityTotal = 0;
            for (int j = 0; j <numberOfHours; j++) {
                dailyTemperatureTotal = data[i][j][0];
                dailyHumidityTotal = data[i][j][1];

            }

        //Display results
        System.out.printf("Day %f%n  's average temperature is",dailyTemperatureTotal / numberOfHours);
            System.out.printf("Day %f%n 's average humidity is", dailyHumidityTotal / numberOfHours);
        }

    }
}

