package ZettelBonus;

public class Transition {
    private String start;
    private String end;
    private Character symbol;

    public Transition(String start, String end, Character symbol){
        this.start = start;
        this.end = end;
        this.symbol = symbol;
    }

    public String getStart(){
        return this.start;
    }

    public String getEnd(){
        return this.end;
    }

    public Character getSymbol(){
        return this.symbol;
    }
}
