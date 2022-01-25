package Zettel10Franzi;

import java.lang.reflect.Array;

public class Alphabet {
    protected Character[] symbols;

    public Alphabet (Character [] symbols){
        this.symbols = symbols;
    }

    public boolean checkAlphabet(Character symbol){
        for(Character character:symbols){
            if(symbol.equals(character)){
                return true;
            }
        }
        return false;
    }
}
