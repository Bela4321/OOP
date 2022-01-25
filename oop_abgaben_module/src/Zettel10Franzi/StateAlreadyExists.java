package Zettel10Franzi;

public class StateAlreadyExists extends Exception{
    private State state ;

    public StateAlreadyExists(State state) {
        super("State already exists "+state.ID);
        this.state = state;
    }
}
