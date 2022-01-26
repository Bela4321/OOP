package Zettel10_Michel;

public class StateAlreadyExists extends Exception{
    private State state;

    public StateAlreadyExists(State state) {
        super("The state " + state.idState + " already exists");
        this.state = state;
    }
}




