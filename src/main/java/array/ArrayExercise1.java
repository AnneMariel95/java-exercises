package array;

import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        int quantity = getQuantity();

        if (quantity <= 3 || quantity >= 9) {
            System.out.println("Out of range. Try again.");
            return;
        }

        int[] NumbersArray = getIntegers(quantity);

        System.out.println(calculateSum(NumbersArray));
    }

    private static int calculateSum(int[] integers) {
        int sum = 0;

        for (int i = 0; i < integers.length; i++) {
            sum = sum + integers[i];
        }

        return sum;
    }

    private static int getQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of integer:");
        return scanner.nextInt();
    }

    private static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        String enter = "Enter integer #: ";

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(enter + (i + 1));
            int num = scanner.nextInt();
            array[i] = num;
        }

        return array;
    }
}

