package Practizezz;

import java.util.Scanner;

public class SentinelPractice {
    public static void main(String[] args) {
        // todo  a small app like jumia that collects 10 valid scores and output sum
        int scoreCount = 0;
        Scanner input = new Scanner(System.in);
            //todo do all of these till scoreCount = 10
        int totalScore = 0;
        while (scoreCount != 10){
                //  todo collect scores
        System.out.println("Enter a score " + (scoreCount+1));
        int score = input.nextInt();
        // todo  check if score is valid
        if (score >= 0 && score <= 100) {
            //todo add to total valid score
            totalScore += score;
            //todo increment scoreCount
            scoreCount++;
        }
        }
        System.out.print("Total score is " + totalScore);
    }
}
