package Zettel10;

class Transition {
    protected String startID;
    protected String endID;
    protected Character symbol;

    public Transition(String startID, String endID, Character symbol) {
        this.startID = startID;
        this.endID = endID;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return startID+"--"+symbol+"->"+endID;
    }
}
