package Zettel07Franzi_;

public class Playfair {
    //a
    private final Character[][] playfairSquare = new Character[5][5];
    private static final String REDUCEDALPHABET = "ABCDEFGHIKLMNOPQRSTUVWXYZ";

    //b
    static boolean characterInString(String s, Character Character) {
        for (int i = 0; i < s.length(); i++) {
            if (Character == s.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    //c
    public Playfair(String codeword) {
        codeword = codeword.toUpperCase();
        String goodCodeword = "";
        for (int j = 0; j < codeword.length(); j++) {
            if (!characterInString(goodCodeword + "J", codeword.charAt(j))) {
                goodCodeword += codeword.charAt(j);
            }
        }
        for (int l = 0; l < REDUCEDALPHABET.length(); l++) {
            if (!characterInString(goodCodeword, REDUCEDALPHABET.charAt(l))) {
                goodCodeword += REDUCEDALPHABET.charAt(l);
            }
        }

        for (int line = 0; line < 5; line++) {
            for (int column = 0; column < 5; column++) {
                playfairSquare[line][column] = goodCodeword.charAt(5 * line + column);
            }
        }
    }

    //d
    public void printSquare() {
        for (Character[] line : this.playfairSquare) {
            for (Character point : line) {
                System.out.println(point);
            }
            System.out.println(); //wieso muss das dahin?
        }
    }
    private Position findInSquare(Character c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (playfairSquare[i][j] == c) ;
                return new Position(i, j);
            }
        }
        return null;
    }

    private String cleanWord(String word){
        word = word.toUpperCase();
        String cleWord = "";
        for (int i=0; i < word.length(); i++) {
            if (characterInString(REDUCEDALPHABET, word.charAt(i))) {
                cleWord += word.charAt(i);
            }
        }
        String pairedWord = "";
        for (int i = 0; i < cleWord.length(); i= i + 2) {
            if (i + 1 == cleWord.length()) {
                pairedWord = pairedWord + cleWord.charAt(i) + "A";
                return pairedWord;
            }
            if (i + 2 == cleWord.length()) {
                pairedWord = pairedWord + cleWord.charAt(i) + cleWord.charAt(i + 1);
                return pairedWord;
            }
            if (cleWord.charAt(i) == cleWord.charAt(i + 1)) {
                pairedWord = pairedWord + cleWord.charAt(i) + "X ";
                i--;
            } else {
                pairedWord = pairedWord + cleWord.charAt(i) + cleWord.charAt(i + 1) + " ";
            }
        }
        return pairedWord;
    }

    public String encode(String word){
        word = cleanWord(word);
        String encodedWord =  "";
        for (int i = 0; i+1 < word.length(); i = i + 3){
            Position char1 = this.findInSquare(word.charAt(i));
            Position char2 = this.findInSquare(word.charAt(i+1));
            if (char1.xCoordinate == char2.xCoordinate) {
                encodedWord = encodedWord + playfairSquare[char1.xCoordinate][Math.max(char1.yCoordinate, char2.yCoordinate)] + playfairSquare[char1.xCoordinate][(Math.max(char1.yCoordinate, char2.yCoordinate) + 1) % 5] + " ";
            }if (char1.yCoordinate == char2.yCoordinate) {
                encodedWord = encodedWord + playfairSquare[Math.max(char1.xCoordinate, char2.xCoordinate)][char1.yCoordinate] + playfairSquare[(Math.max(char1.xCoordinate, char2.xCoordinate) + 1) % 5][char1.yCoordinate] + " ";
            } else{ //kannst du mir erkl??ren warum das so geht?
                if (char1.xCoordinate < char2.xCoordinate) {
                    encodedWord = encodedWord + playfairSquare[char1.xCoordinate][char2.yCoordinate] + playfairSquare[char2.yCoordinate][char1.yCoordinate] + " ";
                } else {
                    encodedWord = encodedWord +playfairSquare[char2.xCoordinate][char1.yCoordinate] + playfairSquare[char1.xCoordinate][char2.yCoordinate]+ " ";
                }
            }
        }
        return encodedWord.substring(0, encodedWord.length()-1);
    }

}
