package Zettel10;

class SymbolNotInAlphabet extends Exception{
    private char symbol;

    public SymbolNotInAlphabet(char symbol) {
        super("Alphabet does not contain "+symbol);
        this.symbol = symbol;
    }
}
