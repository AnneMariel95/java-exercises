public class Divisible {

    public static void main(String[] args) {
//        Create a variable that will hold the largest number.
//        Iterate from 1 to below 1000000.
//          - Check if the current iteration value is divisible by 57.
//              - If true, assign the iteration value to the largestNumber variable.
//        Print the value of largestNumber.

        int largestNumber=0;

        for(int i=1; i<1000000; i++){
            if(i % 57 == 0){
                largestNumber = i;
            }
        }
        System.out.println(largestNumber + " is the largest number below 1000000 that is divisible by 57.");
    }
}
