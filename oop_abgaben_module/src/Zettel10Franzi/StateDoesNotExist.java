package Zettel10Franzi;

public class StateDoesNotExist extends Exception{
    private String state;

    public StateDoesNotExist(String stateID){
        super("The state does not exists "+ stateID);
        this.state = stateID;
    }
}
