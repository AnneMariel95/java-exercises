package java_exercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //this scanner will be reused when entering the numbers and operator
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();

        System.out.println("Supported operations: + - / *");

        System.out.println("Enter operation to use: ");
        String operator = scanner.next();
        double result = 0;
        boolean isOperationValid = true;

        if (operator.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operator.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            result = firstNumber / secondNumber;
        } else {
            isOperationValid = false;
            System.out.println("This is not supported.");
        }

        if (isOperationValid == true) {
            System.out.println("The result is: " + result);
        }
    }
}
