package codewarsExercises;
public class DoubleChar {
    public static String doubleChar(String s) {

        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            newString += s.substring(i, i + 1) + s.substring(i, i + 1);
        }
        System.out.println(newString);
        return newString;
    }
}
