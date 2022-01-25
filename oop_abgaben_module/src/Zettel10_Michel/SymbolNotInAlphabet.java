package Zettel10_Michel;

public class SymbolNotInAlphabet extends Exception {

    public void SymbolNotInAlphabet (String message) {
        message = "The Symbol is not part of Alphabet";
        System.out.println(message);
    }
}
