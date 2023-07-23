package java_exercises;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();

        calculator.getScoresAndCalculate();
    }

    public void getScoresAndCalculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of scores:");
        int numberOfScores = scanner.nextInt();

        while (numberOfScores < 4 || numberOfScores > 8) {
            System.out.println("Out of range. Try again.");
            numberOfScores = scanner.nextInt();
        }

        int score;
        int total = 0;
        double average = 0;

        for (int i = 0; i < numberOfScores; i++) {
            System.out.println("Enter score test #" + (i + 1));
            score = scanner.nextInt();

            if (score < 60 || score > 100) {
                System.out.println("Invalid entry.");
                return;
            } else {
                total += score;
            }
        }

        average = total / numberOfScores;
        System.out.println("The average is " + average);

        String gradeMessage = this.generateGradeMessage(average);

        System.out.println(gradeMessage);

        scanner.close();
    }

    private String generateGradeMessage(double average) {
        String templateMessage = "Your grade is";
        String gradeMessage = null;

        if (average >= 99) {
            gradeMessage = "Awesome! " + templateMessage + " A+";
        } else if (average >= 90 && average <= 98) {
            gradeMessage = templateMessage + " A";
        } else if (average >= 84 && average <= 89) {
            gradeMessage = templateMessage + " B";
        } else if (average >= 81 && average <= 83) {
            gradeMessage = templateMessage + " C";
        } else if (average >= 78 && average <= 80) {
            gradeMessage = templateMessage + " D";
        } else if (average >= 75 && average <= 77) {
            gradeMessage = templateMessage + " E";
        } else
            gradeMessage = "You fail! " + templateMessage + " F";

        return gradeMessage;
    }
}
