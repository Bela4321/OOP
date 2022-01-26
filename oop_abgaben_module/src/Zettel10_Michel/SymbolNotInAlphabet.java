package Zettel10_Michel;

public class SymbolNotInAlphabet extends Exception {
    private Character symbol;

    public SymbolNotInAlphabet (Character symbol) {
        super("The Symbol " + symbol + " is not part of Alphabet");
        this.symbol = symbol;
    }
}
