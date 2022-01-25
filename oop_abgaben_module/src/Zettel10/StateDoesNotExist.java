package Zettel10;

public class StateDoesNotExist extends Exception{
    private String stateID;

    public StateDoesNotExist(String stateID) {
        super("State does not exist "+stateID);
        this.stateID = stateID;
    }
}
