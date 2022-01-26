package Zettel10_Michel;

public class Alphabet {
    protected Character[] symbolArr;

    public Alphabet(Character[] symbols){
        this.symbolArr = symbolArr;
    }

    public boolean symbolInArr(Character symbol) {
        for (int i = 0; i < symbolArr.length; i++) {
            if (symbol.equals(symbolArr[i])) {
                return true;
            }
        }
        return false;
    }
}
