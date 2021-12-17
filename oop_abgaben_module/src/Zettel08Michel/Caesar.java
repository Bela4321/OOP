package Zettel08Michel;

import java.util.Locale;

public class Caesar {

        public static String decode (String coded, char a, char b) {
            java.lang.Character.toUpperCase(a);
            java.lang.Character.toUpperCase(b);
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            char[] alphabetArr = alphabet.toCharArray();
            int a_value = 0;
            int b_value = 0;
            for (int location = 0; location <= alphabetArr.length; location++) {
                if (alphabetArr[location] == a) { //ArrayOmdoxOutOfBoundsException; WHY?
                    a_value = alphabetArr[location];
                }
                if (alphabetArr[location] == b) {
                    b_value = alphabetArr[location];
                }
            }
            int shift_value = Math.abs(b_value - a_value); // values from loop should be used, do not know if it is working.

            coded.toUpperCase(Locale.ROOT);
            char[] codedArr = coded.toCharArray();
            String decodedString = "";
            for (int locationWord = 0; locationWord <= codedArr.length; locationWord++) {
                for (int locationAlphabet = 0; locationAlphabet <= alphabetArr.length; locationAlphabet++) {
                    // following if-statements should fix ArrayOmdoxOutOfBoundsException, but do not work
                    if (alphabetArr[locationAlphabet + shift_value] <= alphabetArr.length) {
                        codedArr[locationWord] = alphabetArr[locationAlphabet + shift_value];
                    }
                    if (alphabetArr[locationAlphabet + shift_value] > alphabetArr.length) {
                        codedArr[locationWord] = alphabetArr[0 + alphabetArr[25] - alphabetArr[locationAlphabet + shift_value]];
                    }
                    decodedString += codedArr[locationWord];
                }
            }

            return decodedString;
        }

        public static void main(String[] args) {
            decode("HGXBO", 'W', 'Z');
            decode("DKKLAJ", 'N', 'R');
            decode("TUFSMJOH", 'A', 'Z');
            decode("VJGFKDDWM", 'E', 'C');
            decode("ZQJCAKJIWOPAN", 'W', 'A');
            decode("XHZRGFLGJSOFRNS", 'G', 'B');
        }
    }
}
