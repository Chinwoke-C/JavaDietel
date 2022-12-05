package myPractices;
// todo (Student Grades) A group of five students earned the
//        following grades: Student 1, ‘A’; student 2, C’; student 3,
//        ‘B’; student 4, ‘A’ and student 5, ‘B’.
//        Write an application that reads a series
//        of pairs of numbers as follows:
//        a) student name
//        b) student letter grade
//        Your program should use a switch statement
//        to determine how many students got a grade of ‘A’,
//        how many got a grade of ‘B’, how many got a grade of ‘C’,
//        and how many got a grade of ‘D’.Use a
//        loop as needed to input the five student grades,
//        and then finally display the results.

import java.util.Arrays;
import java.util.Scanner;

public class StudentGradesChap5 {
    public static void main(String[] args) {
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        Scanner input = new Scanner(System.in);
        String [][] student = new String[5][1];

//        for (int i = 0; i < student.length ; i++) {
//            System.out.println("Enter student id : ");
//            String id = input.next();
//            int j;
//            for ( j = 0; j < student[i].length ; j++) {
//                System.out.println("Enter student grade: ");
//                String grade = input.next();
//                if (grade.equalsIgnoreCase("A")) {
//                    aCount++;
//                } else if (grade.equalsIgnoreCase("B")) {
//                    bCount++;
//                } else if (grade.equalsIgnoreCase("C")) {
//                    cCount++;
//                }else dCount++;
//            }

//        }

        System.out.println("Enter " + student.length + " rows and " +
                student[0].length + " columns: ");
        for (int rows = 0; rows < student.length; rows++) {
            int columns;
            for (columns = 0; columns < student[rows].length ; columns++) {
                student[rows][columns] = input.next();
                if (student[rows][columns].equalsIgnoreCase("A")) {
                    System.out.println(aCount++);
                }
                System.out.print(student[rows][columns] + " ");

            }
            System.out.println();
        }
        for (String[] mark: student) {
            System.out.println(Arrays.toString(mark));
        }

//        for (:
//             ) {
//
//        }
//        char[] letterGrade = new char[5];
//        for (int i = 0; i < student.length; i++) {
//
//
//                student[i] = id;
//        for (int j = 0; j < letterGrade.length ; j++) {
//
//
//
//            letterGrade[j] = letterScore;
//
//        }
//        for (int i = 0; i < student.length; i++){
//            System.out.println("Enter student id");
//            int id = input.nextInt();
//            student[j] = id;
//            for (int j = 0; j <letterGrade.length ; j++) {
//                System.out.println("Enter student letter Grade");
//                char letterScore = input.next().charAt(0);
//            }
//        }
//            }


        }
}






