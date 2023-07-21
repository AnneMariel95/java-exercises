package java_exercises;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

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

//        System.out.println("The sum is " + total);
        System.out.println("The average is " + (average = total / numberOfScores));

        if (average >= 99) {
            System.out.println("Awesome! Your grade is A+");
        } else if (average >= 90 && average <= 98) {
            System.out.println("Your grade is A");
        } else if (average >= 84 && average <= 89) {
            System.out.println("Your grade is B");
        } else if (average >= 81 && average <= 83) {
            System.out.println("Your grade is C");
        } else if (average >= 78 && average <= 80) {
            System.out.println("Your grade is D");
        } else if (average >= 75 && average <= 77) {
            System.out.println("Your grade is E");
        } else if (average <= 74) {
            System.out.println("You fail! Your grade is F");
        }

        scanner.close();

    }
}
