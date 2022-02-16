package ZettelBonus;

public class Alphabet {
    private Character[] symbols;

    public Alphabet(Character[] symbols){
        this.symbols = symbols;
    }

    public boolean containsSymbol(Character c){
        for(Character symbol : symbols){
            if(symbol == c){
                return true;
            }
        }
        return false;
    }

    public Character[] getSymbols(){
        return symbols;
    }
}
