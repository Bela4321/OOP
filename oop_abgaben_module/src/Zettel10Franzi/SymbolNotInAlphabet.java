package Zettel10Franzi;

public class SymbolNotInAlphabet extends Exception{
    private char symbol;

    public SymbolNotInAlphabet(Character symbol){
        super("The symbol " + symbol + " is not in the alphabet.");
        this.symbol = symbol; //das mache ich damit ich symbol an die Methode weitergeben kann.
    }
}
