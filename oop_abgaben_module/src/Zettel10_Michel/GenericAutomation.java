/*package Zettel10_Michel;


public abstract class GenericAutomation <states, transitions, alphabet, start> {
    protected State[] states;
    protected Transition[] transitions;
    protected Alphabet alphabet;
    protected String start;

    GenericAutomation(Alphabet alphabet) {
        this.states = new State[0];
        this.transitions = new Transition[0];
        this.alphabet = alphabet;
        this.start = null;
    }
    public abstract void reset();
    public abstract boolean isAccepting();

    public void addState(State state, boolean isStart) throws StateAlreadyExists {
        State[] newStates = new State[states.length + 1];
        for (int i = 0; i < states.length; i++) {
            newStates[i] = states[i];
            if (states[i].idState.equals(state.idState)) {
                throw new StateAlreadyExists(state);
            }
        }
        newStates[states.length] = state;
        this.states = newStates;
            if (isStart) {
                start = state.idState;
            }
    }

    public State findState(String id) {
        for (int i = 0; i < states.length; i++) {
            if (states[i].idState.equals(id)) {
                return states[i];
            }
        }
        return null;
    }

    protected void addTransition(Transition transition) throws StateDoesNotExist, SymbolNotInAlphabet {
        if (findState(transition.idStart) == null) {
            throw new StateDoesNotExist(transition.idStart);
        }
        if (findState(transition.idEnd) == null) {
            throw new StateDoesNotExist(transition.idEnd);
        }
        if (!this.alphabet.symbolInArr(transition.symbol1)) {
            throw new SymbolNotInAlphabet(transition.symbol1);
        }
        Transition[] newTransitions = new Transition[transitions.length + 1];
        for (int i = 0; i < transitions.length; i++) {
            newTransitions[i] = transitions[i];
        }
        newTransitions[transitions.length] = transition;
        transitions = newTransitions;
    }
}
*/