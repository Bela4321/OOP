package Zettel10;

public class TransitionAlreadyExists extends Exception{
    private Transition transition;

    public TransitionAlreadyExists(Transition transition) {
        super("Transition already exists: " + transition.toString());
        this.transition = transition;
    }
}
