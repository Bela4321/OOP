package ZettelBonus;

public abstract class GenericAutomaton {
    protected State[] states;
    protected Transition[] transitions;
    protected final Alphabet alphabet;
    protected String start;

    protected GenericAutomaton(Alphabet alphabet){
        this.alphabet = alphabet;
        this.states = new State[0];
        this.transitions = new Transition[0];
    }

    public void addState(State state, boolean isStart) throws StateAlreadyExistsException{
        State[] temp = new State[states.length+1];
        for(int i = 0; i < states.length; i++){
            State old = states[i];
            if(state.getId().equals(old.getId())){
                throw new StateAlreadyExistsException();
            }
            temp[i] = old;
        }
        if(isStart){
            this.start = state.getId();
        }
        temp[temp.length-1] = state;
        this.states = temp;
    }

    public State findState(String id){
        for(State state : this.states){
            if(state.getId().equals(id)){
                return state;
            }
        }
        return null;
    }

    protected void addTransition(Transition transition) throws SymbolNotInAlphabetException, StateDoesNotExistException{
        if(alphabet.containsSymbol(transition.getSymbol())) {
            State q1 = findState(transition.getStart());
            State q2 = findState(transition.getEnd());
            if(q1==null || q2 == null){
                throw new StateDoesNotExistException();
            }
            Transition[] temp = new Transition[this.transitions.length + 1];
            for (int i = 0; i < this.transitions.length; i++) {
                temp[i] = this.transitions[i];
            }
            temp[this.transitions.length] = transition;
        }
        else {
            throw new SymbolNotInAlphabetException();
        }
    }

    public abstract void reset();
    public abstract boolean isAccepting();
}
