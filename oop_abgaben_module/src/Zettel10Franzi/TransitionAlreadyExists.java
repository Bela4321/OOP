package Zettel10Franzi;

public class TransitionAlreadyExists extends Exception{
    private Transition transition;

    public TransitionAlreadyExists(Transition transition){
        super("The transition already exists: " + transition.toString());
        this.transition = transition;
    }
}
