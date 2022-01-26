package Zettel10_Michel;

public class TransitionAlreadyExists extends Exception {
    private Transition transition;

    public TransitionAlreadyExists (Transition transition) {
        super("This transition from " +Transition.idStart + " to " + Transition.idEnd + " does already exists.");
        this.transition = transition;
    }
}
