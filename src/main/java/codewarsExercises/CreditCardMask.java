package codewarsExercises;

public class CreditCardMask {

    public static String maskify(String str) {

        int lastFourIndexes = Math.max(str.length() - 4, 0);
        char[] maskingOutput = str.toCharArray();

        for (int i = 0; i < lastFourIndexes; i++) {
            maskingOutput[i] = '#';
        }

        String maskedResult = new String(maskingOutput);

        return maskedResult;
    }
}


