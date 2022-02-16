package ZettelBonus;

public class State {
    private String id;
    private boolean acceptingState;

    public State(String id, boolean acceptingState){
        this.id = id;
        this.acceptingState = acceptingState;
    }

    public String getId(){
        return  this.id;
    }

    public boolean isAccepting(){
        return this.acceptingState;
    }

}
