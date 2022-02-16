package Zettel10;


abstract class GenericAutomaton {
    protected State[] states;
    protected Transition[] transitions;
    protected Alphabet alphabet;
    protected String start;

    public GenericAutomaton(Alphabet alphabet) {
        this.alphabet = alphabet;
        this.states = new State[0];
        this.transitions = new Transition[0];
        this.start = null;
    }
    public abstract void reset();
    public abstract boolean isAccepting();

    public void addState(State state, boolean isStart) throws StateAlreadyExists {
        State[]  newStates = new State[states.length+1];
        for (int i = 0;i< states.length;i++) {
            newStates[i]= states[i];
            if (states[i].ID.equals(state.ID)) {
                throw new StateAlreadyExists(state);
            }
        }
        newStates[states.length]= state;
        this.states = newStates;
        if (isStart) {
            start = state.ID;
        }
    }

    public State findState(String id) {
        for (State state : states) {
            if (state.ID.equals(id)) {
                return state;
            }
        }
        return null;
    }

    protected void addTransition(Transition transition) throws StateDoesNotExist, SymbolNotInAlphabet {
        if (this.findState(transition.startID)==null) {
            throw new StateDoesNotExist(transition.startID);
        }
        if (this.findState(transition.endID)==null) {
            throw new StateDoesNotExist(transition.endID);
        }
        if (!this.alphabet.contains(transition.symbol)) {
            throw new SymbolNotInAlphabet(transition.symbol);
        }
        Transition[] newTransitions = new Transition[transitions.length+1];
        for (int i=0;i< transitions.length;i++) {
            newTransitions[i] = transitions[i];
        }
        newTransitions[transitions.length] = transition;
        this.transitions = newTransitions;
    }
}
