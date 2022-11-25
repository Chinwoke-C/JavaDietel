package multiDimensionalArray;

import java.util.Scanner;

public class StudentAndSubject {
    private int numOfStudent;
    private int numOfSubject;
    private int [] [] scores;
    private Scanner input = new Scanner(System.in);

    public void enteringDisplay(){
        System.out.println("How many student do you have?");
        numOfStudent = input.nextInt();
        System.out.println("How many subject do you offer?");
        numOfSubject = input.nextInt();
        scores = new int[numOfStudent][numOfSubject];
    }
    public void secondDisplay(int studentNumber, int subjectNumber){
        System.out.printf("Entering scores for student %d%n",studentNumber);
        System.out.printf("Enter scores for subject %d%n", subjectNumber);
        int score = input.nextInt();
        scores[studentNumber-1][subjectNumber-1] = score;
    }
    public void displayTableHeader(){
        for (int i = 1; i <=38 + 13 * numOfStudent ; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("%-15s","STUDENT");
        for (int i = 1; i <= numOfSubject ; i++) {
            System.out.printf("SUB%-10d",i);
        }
        System.out.printf("%-10s%-10s%s%n","TOT","AVE","POS");
        for (int i = 1; i <=38 + 13 * numOfStudent ; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    public void displayTableBody(){
        for (int i = 0; i <numOfStudent ; i++) {
        System.out.printf("Student %-7d", i+1);
            for (int j = 0; j <numOfSubject ; j++) {
                System.out.printf("%-13d",scores[i][j]);
            }
            System.out.printf("%-10d%-10.2f%d",totalScoresPerStudent(i+1), averagePerStudent(i+1),getPositionPerStudent(i+1));
            System.out.println();

        }

    }
    public  void displayBottomLine(){
        for (int i = 1; i <=38 + 13 * numOfStudent ; i++) {
            System.out.print("=");
        }
        System.out.println();
        for (int i = 1; i <=38 + 13 * numOfStudent ; i++) {
            System.out.print("=");
        }
    }
    public int totalScoresPerStudent(int studentNumber){
        int total = 0;
        for (int i = 0; i <numOfStudent ; i++) {
            total += scores[studentNumber-1][i];

        }

        return total;
    }
    public double averagePerStudent(int studentNumber){


        return (double)totalScoresPerStudent(studentNumber) / numOfSubject ;
    }
        public int getPositionPerStudent(int studentNumber){
        int[] totals = new int[numOfStudent];
            for (int i = 0; i <numOfStudent ; i++) {
                totals[i] = totalScoresPerStudent(i+1);

            }
            int [] sortTotals = sortScores(totals);
            int score = totalScoresPerStudent(studentNumber);
            int position = 0;
            for (int i = 0; i < numOfStudent ; i++) {
                if (sortTotals[i] == score){
                    position = i + 1;
                }

            }

            return position;
        }
    public int getNumOfStudent() {
        return numOfStudent;
    }

    public int getNumOfSubject() {
        return numOfSubject;
    }
    public int [] sortScores(int [] scores){
        for (int i = 0; i <scores.length ; i++) {
            for (int j = i+1; j < scores.length ; j++) {
                if (scores[i] < scores[j]){
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }

            }

        }

        return scores;
    }
}
