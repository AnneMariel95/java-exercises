public class FunctionExercise1 {

//        Create a function named compareNumbers that will accept an array of integers.
//        Use the arr parameter being passed.
//          - Compare the first and second elements of the array.
//              - Check if the value of the first number is less than the second number:
//                   - If yes, return a string saying "first number is less than second number"
//              - Check if the value of the first number is greater than the second number:
//                   -If yes, return a string saying "second number is greater than second number"
//              - Else, return a string saying "numbers are the same"

    public String compareNumbers(int[] arr) {

        int firstNumber = arr[0];
        int secondNumber = arr[1];

        if (firstNumber < secondNumber) {
            return firstNumber + " is less than " + secondNumber;
        } else if (firstNumber > secondNumber) {
            return firstNumber + " is greater than " + secondNumber;
        }
        return firstNumber + " and " + secondNumber + " are the same";
    }

    public static void main(String[] args) {
        // Ignore the content of main function
        int[] testValue1 = {1, 2};
        int[] testValue2 = {6, 6};
        int[] testValue3 = {5, 0};

//        because compareNumbers is not an static method
        FunctionExercise1 asdf = new FunctionExercise1();
        
//        asdf.compareNumbers();

        System.out.println(asdf.compareNumbers(testValue1)); // 1 is less than 2
        System.out.println(asdf.compareNumbers(testValue2)); // 6 and 6 are the same
        System.out.println(asdf.compareNumbers(testValue3)); // 5 is greater than 0
    }
}


