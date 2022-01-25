package Zettel10Franzi;

public abstract class GenericAutomaton {
    protected State[] states;
    protected Transition[] transitions;
    protected Alphabet alphabet;
    protected String start;

    public GenericAutomaton(Alphabet alphabet){
        this.alphabet = alphabet;
        this.states = new State[0];
        this.transitions = new Transition[0];
        this.start = null;
    }

    public abstract void reset();
    public abstract void isAccepting();

    public void addState(State state, boolean isStart) throws StateAlreadyExists{
        State[]  newStates = new State[states.length+1]; //muss erstmal ein neues Array anlegen wo alle zustände drin sind, um dann noch eventuell eins anzufügen
        for (int i = 0;i< states.length;i++) { //übertrage die Einträge
            newStates[i]= states[i];
            if (states[i].ID.equals(state.ID)) { //gucke ob ich den state den ich hinzufüge will schon habe
                throw new StateAlreadyExists(state);
            }
        }
        newStates[states.length]= state; //füge sonst meinen state ein an letzter Stelle
        this.states = newStates; // will jetzt den neuen Array als State haben zusammen mit neuen wert
            if(isStart){
                start = state.ID; //muss noch die Start ID geben
            }
    }

    public State findState(String id){
        for(State state:states){
            if(state.ID.equals(id)){
                return state;
            }
        }
        return null;
    }

    protected void addTransition(Transition transition) throws StateDoesNotExist, SymbolNotInAlphabet{
        if (this.findState(transition.startID)==null) {
            throw new StateDoesNotExist(transition.startID);
        }
        if (this.findState(transition.endID)==null) {
            throw new StateDoesNotExist(transition.endID);
        }
        if (!this.alphabet.checkAlphabet(transition.symbol)) {
            throw new SymbolNotInAlphabet(transition.symbol);
        }
        Transition[]  newTransition = new Transition[transitions.length +1]; //muss erstmal ein neues Array anlegen wo alle zustände drin sind, um dann noch eventuell eins anzufügen
        for (int i = 0;i< transitions.length;i++) { //übertrage die Einträge
            newTransition[i]= transitions[i];

        }
        this.transitions = newTransition;

    }



}
