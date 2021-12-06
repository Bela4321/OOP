package Zettel07;


import java.util.Locale;

public class Playfair {
    private Character[][] playfairSquare; //should be final, but doesnt work if it is :(
    private static final String REDUCEDALPHABET = "ABCDEFGHIKLMNOPQRSTUVWXYZ";



    private static boolean characterInString(String s, Character character) {
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)==character) {
                return true;
            }
        }
        return false;
    }

    public Playfair(String codeword) {
        codeword = codeword.toUpperCase();
        String resCodeword = "";
        for (int i=0;i<codeword.length();i++) {
            if (!characterInString(resCodeword+"J", codeword.charAt(i))) {
                resCodeword += codeword.charAt(i);
            }
        }
        for (int i=0;i<REDUCEDALPHABET.length();i++) {
            if (!characterInString(resCodeword,REDUCEDALPHABET.charAt(i))) {
                resCodeword += REDUCEDALPHABET.charAt(i);
            }
        }
        Character[][] temp = new Character[5][5];
        for (int row= 0;row<5;row++) {
            for (int col = 0;col<5;col++) {
                temp[row][col] = resCodeword.charAt(5*row+col);
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

    private Position findInSquare(Character c) {
        for (int row=0;row<5;row++) {
            for (int col=0;col<5;col++) {
                if (playfairSquare[row][col]==c) {
                    return new Position(row, col);
                }

            }
        }
        return null;
    }

    public static String cleanWord(String word) {
        word = word.toUpperCase();
        String newWord = "";
        for (int i=0;i<word.length();i++) {
            if (characterInString(REDUCEDALPHABET,word.charAt(i))) {
                newWord += word.charAt(i);
            }
        }
        String pairedWord="";
        for (int i=0;i<newWord.length();i+=2) {
            if (i+1==newWord.length()) {
                pairedWord=pairedWord + newWord.charAt(i) +"A";
                return pairedWord;
            } else if (i+2==newWord.length()) {
                   pairedWord  =pairedWord + newWord.charAt(i)+newWord.charAt(i+1);
                   return pairedWord;
            }else if (newWord.charAt(i)==newWord.charAt(i+1)) {
                pairedWord += newWord.charAt(i) +"X ";
                i--;
            } else {
                pairedWord = pairedWord+ newWord.charAt(i) + newWord.charAt(i+1)+" ";
            }
        }
        return pairedWord;
    }

    public String encode(String word) {
        word = cleanWord(word);
        String encodedWord = "";
        for (int i=0; i+1<word.length();i+=3) {
            Position char1 = this.findInSquare(word.charAt(i));
            Position char2 = this.findInSquare(word.charAt(i+1));
            if (char1.xCoodinate==char2.xCoodinate) {
                encodedWord =encodedWord + playfairSquare[char1.xCoodinate][Math.max(char1.yCoordinate,char2.yCoordinate)] + playfairSquare[char1.xCoodinate][(Math.max(char1.yCoordinate,char2.yCoordinate)+1)%5]+ " " ;
            } else if (char1.yCoordinate==char2.yCoordinate) {
                encodedWord = encodedWord +playfairSquare[Math.max(char1.xCoodinate,char2.xCoodinate)][char1.yCoordinate] +playfairSquare[(Math.max(char1.xCoodinate,char2.xCoodinate)+1 )%5][char1.yCoordinate]+ " ";
            } else {
                if (char1.yCoordinate<char2.yCoordinate) {
                    encodedWord = encodedWord +playfairSquare[char1.xCoodinate][char1.yCoordinate] + playfairSquare[char2.xCoodinate][char1.yCoordinate]+ " ";
                } else {
                    encodedWord = encodedWord +playfairSquare[char2.xCoodinate][char1.yCoordinate] + playfairSquare[char1.xCoodinate][char1.yCoordinate]+ " ";
                }
            }
        }

        return encodedWord;//.substring(0,encodedWord.length()-1);
    }

    public static void main(String[] args) {
        Playfair testgrid = new Playfair("Hallo");
        testgrid.printSquare();
        System.out.println(testgrid.encode("Hallo"));
    }
}
