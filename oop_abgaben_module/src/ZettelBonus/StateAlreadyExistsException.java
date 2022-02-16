package ZettelBonus;

public class StateAlreadyExistsException extends Exception{
    public StateAlreadyExistsException(){
        super("You attempted to add a state that already exists!");
    }
}
