package java_exercises;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number.");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number.");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter third number.");
        double thirdNumber = scanner.nextDouble();

        scanner.close();

        double maxValue=Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
        System.out.println("Greatest number: " + maxValue);

//        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
//            System.out.println("The greatest: " + firstNumber);
//        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
//            System.out.println("The greatest: " + secondNumber);
//        } else {
//            System.out.println("The greatest: " + thirdNumber);
//        }
    }
}
