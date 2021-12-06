package Zettel07;


import java.util.Locale;

public class Playfair {
    private Character[][] playfairSquare;
    private static final String REDUCEDALPHABET = "ABCDEFGHIKLMNOPQRSTUVWXYZ";

    private boolean characterInString(String s, Character character) {
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)==character) {
                return true;
            }
        }
        return false;
    }

    public void Playfair(String codeword) {
        codeword = codeword.toUpperCase();
        String resCodeword = "";
        for (int i=0;i<codeword.length();i++) {
            if (!characterInString(resCodeword+"J", codeword.charAt(i)));
            resCodeword += codeword.charAt(i);
        }
        for (int i=0;i<REDUCEDALPHABET.length();i++) {
            if (!characterInString(resCodeword,REDUCEDALPHABET.charAt(i))) {
                resCodeword += REDUCEDALPHABET.charAt(i);
            }
        }
        Character[][] temp = new Character[5][5];
        for (int row= 0;row<5;row++) {
            for (int col = 0;col<5;col++) {
                temp[col][row] = resCodeword.charAt(5*row+col);
            }
        }
        playfairSquare = temp;
    }

    public void printSquare() {
        for (Character[] row: this.playfairSquare) {
            for (Character point: row) {
                System.out.print(point);
            }
            System.out.println();
        }
    }



}
