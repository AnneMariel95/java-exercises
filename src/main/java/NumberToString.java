public class NumberToString {
    public static void main(String[] args) {

        int i=200;

        String s=Integer.toString(i);
        System.out.println(s);
        System.out.println(i+50); //250 because + is binary plus operator
        System.out.println(s+50); //20050 because + is string concatenation operator

    }
}
