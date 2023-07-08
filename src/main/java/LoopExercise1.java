public class LoopExercise1 {
    public static void main(String[] args) {

//        Find the sum of the largest numbers divisible by 33 and 44 under 1000.

//        Create variables that will hold the largest numbers divisible by 33 and 44 under 1000, and their sum.
//        Iterate from 1 to below 1000.
//           - For largestNumber1, check if the current iteration value is divisible by 33.
//              - If true, assign the iteration value to the largestNumber1 variable.
//           - For largestNumber2, check if the current iteration value is divisible by 44.
//              - If true, assign the iteration value to the largestNumber2 variable.
//         Get the sum of largestNumber1 and largestNumber2.
//           - Print the value.

        int sum = 0;
        int largestNumber1 = 0;
        int largestNumber2 = 0;

        for (int i = 0; i < 1000; i++) {

            if (i % 33 == 0)
                largestNumber1 = i;

            if (i % 44 == 0)
                largestNumber2 = i;

            sum = largestNumber1 + largestNumber2;
        }
        System.out.println("The sum is " + sum);
    }
}
