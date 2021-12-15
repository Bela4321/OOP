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

        for (int i = 0; i < Alphabet.length(); i++){//use Alphabet.IndexAt(a)
            if ( a == Alphabet.charAt(i)){
                positionA = i;
            }
        }

        for (int j = 0; j< Alphabet.length(); j++){//use Alphabet.IndexAt(b)
            if (b == Alphabet.charAt(j)){
                positionB = j;
            }
        }

        int difference = 0;

        if (positionA <= positionB){//unnötig, wird schon durch Math.abs() getan, Richtungsinformation geht verloren
            difference = Math.abs(positionA-positionB);
        } else {
            difference = Math.abs(positionB-positionA);
            //wie bekomme ich das hin, dass der von hintem im Alpabeth wieder nach vorne springt? --> %26, bzw +26 und dann %26 (für negative differenz)
        }

        String word = "";

        for (int k = 0; k < coded.length(); k++){
            for (int l = 0; l < Alphabet.length(); l++){
                if (coded.charAt(k) == Alphabet.charAt(l)){
                    if (positionA <= positionB) {
                        word += Alphabet.charAt((l + difference) % 26);
                    } else {
                        word += Alphabet.charAt((l- difference)% 26);//noch +26 , sonst auch negative zahlen
                    }
                }
            }
        }
        return word;
    }
}
