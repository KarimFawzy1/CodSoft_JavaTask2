package com.mycompany.studentgradecalculator;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSubjects, totalMarks = 0;
        double averagePercentage;
        String grade;

        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100: ");
                marks = scanner.nextInt();
            }

            totalMarks += marks;
        }

        averagePercentage = (double) totalMarks / numSubjects;
        averagePercentage = Math.round(averagePercentage * 100.0) / 100.0;

        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nStudent Grade Report:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
