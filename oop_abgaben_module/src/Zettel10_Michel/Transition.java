package Zettel10_Michel;

public class Transition {
    public static String idStart;
    public static String idEnd;
    public static Character symbol1;

    public Transition (String idStart, String idEnd, Character symbol1) {
        this.idStart = idStart;
        this.idEnd = idEnd;
        this.symbol1 = symbol1;
    }

    @Override
    public String toString() {
        return idStart + " " + symbol1 + " " + idEnd;
    }
}
