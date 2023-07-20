package java_exercises;

import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of integers:");
        int quantity = scanner.nextInt();

        int minNumber = 2;
        int maxNumber = 10;

        while (quantity < minNumber || quantity > maxNumber) {
            System.out.println("Out of range. Enter correct number.");
            quantity = scanner.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter integer #" + (i + 1));
            int number = scanner.nextInt();

            if ((number % 2) == 0) {
                countEven += 1;
            } else {
                countOdd += 1;
            }
        }

        scanner.close();

        System.out.println("There are " + countEven + " even integers.");
        System.out.println("There are " + countOdd + " odd integers.");
    }
}




