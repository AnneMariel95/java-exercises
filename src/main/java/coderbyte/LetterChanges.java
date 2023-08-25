package coderbyte;

import java.util.Scanner;

public class LetterChanges {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(LetterChanges(s.nextLine()));
    }

    public static String LetterChanges(String str) {

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String vowel = "aeiou";
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int charIndex = letters.indexOf(currentChar);

            if (charIndex == -1) { //If 'currentChar' is not found in 'letters'
                output = output + currentChar; //Add 'currentChar' to output as is
                continue;
            }

            if (charIndex == letters.length() - 1) { // "resetting" the index to be the start of the alphabet
                charIndex = -1;
            }

            char nextChar = letters.charAt(charIndex + 1);
            if (vowel.indexOf(nextChar) >= 0) {
                output += String.valueOf(Character.toUpperCase(nextChar));
            } else {
                output += nextChar;
            }
        }
        return output;
    }
}
