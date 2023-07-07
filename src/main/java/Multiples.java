public class Multiples {
    public static void main(String[] args) {

//        Find the sum of all the multiples of 3 or 5 below 1000.

//        Create a variable that will hold the sum with an initial value of 0.
//        Iterate from 1 to less than 1000.
//          - For each iteration, check if the number is a multiple of 3 or 5. Display.
//            - If true, add number to the variable sum.
//        Print the value of sum.

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("The total is " + sum);
    }
}
