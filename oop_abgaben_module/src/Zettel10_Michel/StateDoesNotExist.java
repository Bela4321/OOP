package Zettel10_Michel;

public class StateDoesNotExist extends Exception{
    private String idState;

    public StateDoesNotExist(String idState) {
        super("The state " + idState + "does not exist");
        this.idState = idState;
    }
}
