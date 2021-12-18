package Zettel08;

public class CaesarChiffre {
    public static String decode (String coded, char a, char b) {
        coded.toUpperCase();
        a=Character.toUpperCase(a);
        b=Character.toUpperCase(b);
        char[] codedArray = coded.toCharArray();
        int shiftDist = (b-a+26)%26;
        StringBuilder result= new StringBuilder();
        for (char letter : codedArray) {
            result.append((char) ('A'+((letter-'A'+shiftDist)%26)));
        }
        return new String (result);
    }
}
