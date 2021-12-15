package Zettel08Franzi;

public class Caesar {
    //private String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String decode(String coded, char a, char b){
        String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        coded = coded.toUpperCase();
        a = Character.toUpperCase(a);
        b = Character.toUpperCase(b);
        int positionA = 0;
        int positionB = 0;

        for (int i = 0; i < Alphabet.length(); i++){
            if ( a == Alphabet.charAt(i)){
                positionA = i;
            }
        }

        for (int j = 0; j< Alphabet.length(); j++){
            if (b == Alphabet.charAt(j)){
                positionB = j;
            }
        }

        int difference = 0;

        if (positionA <= positionB){
            difference = Math.abs(positionA-positionB);
        } else {
            difference = positionA - positionB;
        }

        String word = "";

        for (int k = 0; k < coded.length(); k++){
            for (int l = 0; l < Alphabet.length(); l++){
                if (coded.charAt(k) == Alphabet.charAt(l)){
                    word += Alphabet.charAt((l + difference) % 26);
                }
            }
        }
        return word;
    }
}
