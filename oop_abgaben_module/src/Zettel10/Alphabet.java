package Zettel10;

class Alphabet {
    protected Character[] symbols;

    public Alphabet(Character[] symbols) {
        this.symbols = symbols;
    }


    public boolean contains(Character symbol) {
        for (Character character: symbols) {
            if (character.equals(symbol)) {
                return true;
            }
        }
        return false;
    }
}
