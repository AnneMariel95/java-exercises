public class LoopExercise2 {
    public static void main(String[] args) {

//        Find the product of the largest numbers divisible by 50 and 73 from 1 to 1000.

//        Create variables for the largest numbers divisible by 50 and 73 from 1 to 1000, and their product.
//        Iterate from 1 to 10000.
//           - Check if the number is divisible by 50.
//              - If true, assign the iteration value to the largestNumber1 variable.
//           - Check if the number divisible by 73.
//              - If true, assign the iteration value to the largestNumber2 variable.
//        Get the product of largestNumber1 and largestNumber2.
//           - Print the value.

        int product = 0;
        int largestNumber1 = 0;
        int largestNumber2 = 0;

        for (int i = 0; i <= 1000; i++) {
            if (i % 50 == 0)
                largestNumber1 = i;

            if (i % 73 == 0)
                largestNumber2 = i;

            product = largestNumber1 * largestNumber2;
        }
        System.out.println("The product is " + product);
    }
}
