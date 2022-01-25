package Zettel10Franzi;

public class Transition {
    protected String startID;
    protected String endID;
    protected Character symbol;

    public Transition(String startID, String endID, Character Symbol){
        this.startID = startID;
        this.endID = endID;
        this.symbol = symbol;
    }
}
