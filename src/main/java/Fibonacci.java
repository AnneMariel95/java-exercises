public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int targetSequence = 10;


        for (int i = 0; i < targetSequence; i++) {
            int newSecond = first + second;
            first = second;
            second = newSecond;
        }

        System.out.println("Target sequence number " + targetSequence + " has a value of " + second);
    }
}
