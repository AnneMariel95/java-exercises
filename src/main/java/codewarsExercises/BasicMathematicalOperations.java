package codewarsExercises;

public class BasicMathematicalOperations {

    public static Integer basicMath(String operation, int value1, int value2) {
        if (operation == "+") {
            return value1 + value2;
        } else if (operation == "-") {
            return value1 - value2;
        } else if (operation == "*") {
            return value1 * value2;
        } else return value1 / value2;
    }
}
