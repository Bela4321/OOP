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
            for (int location = 0; location <= alphabetArr.length; location++) {//just use alphabet.IndexOf(char)
                if (alphabetArr[location] == a) { //ArrayOmdoxOutOfBoundsException; WHY?--> needs to be location < alphabetArr.length
                    a_value = alphabetArr[location];
                }
                if (alphabetArr[location] == b) {
                    b_value = alphabetArr[location];
                }
            }
            int shift_value = Math.abs(b_value - a_value); // values from loop should be used, do not know if it is working.--->yes, but with math.abs() you loose information about whitch direction to shift in

            coded.toUpperCase(Locale.ROOT); // doesnt need "Locale.ROOT"
            char[] codedArr = coded.toCharArray();
            String decodedString = "";
            for (int locationWord = 0; locationWord <= codedArr.length; locationWord++) {
                for (int locationAlphabet = 0; locationAlphabet <= alphabetArr.length; locationAlphabet++) {//again needs to be locationAlphabet < alphabetArr.length
                    //
                    if (alphabetArr[locationAlphabet + shift_value] <= alphabetArr.length) {//ohne alphabetArr[] sondt vergleichst du buchstaben mit Zahlen
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
            System.out.println(decode("HGXBO",'W','Z'));
            System.out.println(decode("DKKLAJ",'n','R'));
            System.out.println(decode("TUFSMJOH",'A','Z'));
            System.out.println(decode("VJGFKDDWM",'E','c'));
            System.out.println(decode("ZQJCAKJIWOPAN",'W','A'));
            System.out.println(decode("XHZRGFLGJSOFRNS",'G','B'));
        }
    }

