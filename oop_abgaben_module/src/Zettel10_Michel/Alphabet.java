package Zettel10_Michel;

public class Alphabet {
    private Character[] symbolArr;

    Alphabet(){
        this.symbolArr = symbolArr;
    }

    public Character symbolInArr(Character a) {
        for (int i = 0; i < symbolArr.length; i++) {
            if (a == symbolArr[i]) {
                return a;
            }
        }
        return null;
    }
}
