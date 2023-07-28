package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of integer:");
        int Quantity = scanner.nextInt();

        if (Quantity <= 3 || Quantity >= 9) {
            System.out.println("Out of range. Try again.");
        }

        String enter = "Enter integer #: ";
        int[] NumbersArray = new int[Quantity];
        int sum = 0;


        for (int i = 0; i < Quantity; i++) {
            System.out.println(enter + (i + 1));
            int num = scanner.nextInt();
            NumbersArray[i] = num;
        }

        for (int i = 0; i < Quantity; i++) {
            sum = sum + NumbersArray[i];
        }
        System.out.println(sum);

        scanner.close();
    }
}

