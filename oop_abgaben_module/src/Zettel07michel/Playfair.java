package Zettel07michel;

import java.util.Locale;

public class Playfair {

    private final char[][] playfairSquare = new char[5][5];
    static private final String Alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";

    boolean characterInString(String s, char c) {
        if (s.indexOf(c) >= 0) {
            return true;
        } else {
            System.out.println("Character not found in String.");//no print needed
            return false;
        }
    }

    public Playfair(String codeword) {
        codeword.toUpperCase(Locale.ROOT);//.toUpperCase() instead (doesnt matter)
        int count = 0;
        String codeword1 = "";
        //Bereinigen von Dooplungen
        char[] codewordArrCheck = codeword.toCharArray();
        for (int i = 0; i <= codeword.length(); i++) {
            for (int j = i + 1; j <= codeword.length(); j++) {
                if (!(codewordArrCheck[i] == codewordArrCheck[j]) || !(codewordArrCheck[j] == 'J') {
                    codeword1 = codeword1 + codewordArrCheck[i];
                    //wird jetzt bei jedem loop neu initialisiert (scope ist zu klein), muss außerhalb initialisiert werden; initialised empty, needs to be codeword.
                    //Wie kann ich hier jetzt das codeword1 für weiteres Vorgehen nutzen? siehe zeile 27;j needs to be j-count weil die indexe durch das herausnehmen von bichstaben verschoben werden
                    count++;
                    break;
                }
            }
        }
        //save the stringbuilder as string


        char[] alphabetArr = Alphabet.toCharArray();//what is this? if condition always true, use char in string method from above
        for (int i = 0; i <= 26; i++) {
            if (alphabetArr[i] != 'A' || alphabetArr[i] != 'F' || alphabetArr[i] != 'E' || alphabetArr[i] != 'L' || alphabetArr[i] != 'S' || alphabetArr[i] != 'T' || alphabetArr[i] != 'R' || alphabetArr[i] != 'U' || alphabetArr[i] != 'D') {
                codeword = codeword + alphabetArr[i];
            }
        }
        char[] codewordArr = codeword.toCharArray();//more elegant: use nested for-loops (for row(for column))
        for (int i = 0; i <= 5; i++) {
            playfairSquare[0][i] = codewordArr[i];
        }
        for (int i = 6; i <= 10; i++) {
            playfairSquare[1][i] = codewordArr[i];
        }
        for (int i = 11; i <= 15; i++) {
            playfairSquare[2][i] = codewordArr[i];
        }
        for (int i = 16; i <= 20; i++) {
            playfairSquare[3][i] = codewordArr[i];
        }
        for (int i = 21; i <= 25; i++) {
            playfairSquare[4][i] = codewordArr[i];
        }
    }

    public void printSquare() {
        System.out.println(playfairSquare[0][0] + " " + playfairSquare[0][1] + " " + playfairSquare[0][2] + " " + playfairSquare[0][3] + " " + playfairSquare[0][4]);
        System.out.println(playfairSquare[1][0] + " " + playfairSquare[1][1] + " " + playfairSquare[1][2] + " " + playfairSquare[1][3] + " " + playfairSquare[1][4]);
        System.out.println(playfairSquare[2][0] + " " + playfairSquare[2][1] + " " + playfairSquare[2][2] + " " + playfairSquare[2][3] + " " + playfairSquare[2][4]);
        System.out.println(playfairSquare[3][0] + " " + playfairSquare[3][1] + " " + playfairSquare[3][2] + " " + playfairSquare[3][3] + " " + playfairSquare[3][4]);
        System.out.println(playfairSquare[4][0] + " " + playfairSquare[4][1] + " " + playfairSquare[4][2] + " " + playfairSquare[4][3] + " " + playfairSquare[4][4]);
    }
}



            /*
            1.Leerzeichen und Sonderzeichen bereinigen
            2.in Buchstabenpaare aufteilen, bei Dopplung in Paar 'X' einschieben und weiterschieben
            3.Wenn letztes Paar nur ein Buchstabe 'A' hinten anfügen
?? Befinden sich beide Buchstaben des Paares in derselben Zeile der Matrix, wird der
rechts-stehende Buchstabe in der Matrix verwendet. Wenn ein Buchstabe an der letzten
Stelle stehen sollte, wird der Buchstabe an der ersten Stelle derselben Zeile verwendet.
Beispiel: Codewort Apfelstrudel
AP → PF, EL → LA
            5.
             */


