package Zettel10_Michel;


public abstract class GenericAutomation <states, transitions, alphabet, start> {
    public State[] states;
    public Transition[] transitions;
    public Alphabet[] alphabet;
    public String start;

    GenericAutomation(State[] states, Transition[] transitions, Alphabet[] alphabet, String start) {
        this.states = states;
        this.transitions = transitions;
        this.alphabet = alphabet;
        this.start = start;
        //  Legen Sie einen Konstruktor an, welchem ein
        //Alphabet übergeben wird, der alle notwendigen Felder mit Default-Werten initialisiert.
    }

    public abstract void reset();

    public abstract boolean isAccepting();

    public void addState(State state, boolean isStart) throws StateAlreadyExists {
        if (state.equals(state.idState)) {
            throw new StateAlreadyExists("State already exists.");
        }
        if (isStart == true) {
            start = state.idState;
        }
    }

    public State findState(String id) {
        for (int i = 0; i < states.length; i++) {
            if (id.equals(State.idState)) { // wieso kann er hier nicht zugreifen?
                return states[i];
            }
        }
        return null;
    }

    protected void addTransition(Transition transition) throws StateDoesNotExist, SymbolNotInAlphabet {
        for (int i = 0; i < transitions.length; i++) { // geht die Schleife überhaupt über alle Felder rüber?
            //oder muss man schleifen für jeden Feld schreiben? Ja, oder?
            if (transitions[i] == null) {
                transition = transitions[i];
            }
            if (!transitions[i].equals(Transition.idEnd) || (transitions[i].equals(Transition.idStart))) {
                throw new StateDoesNotExist ("The state idEnd or idStart do not exist");// hier braucht es die Nachricht, unten nicht.
            }
            if (!transitions[i].equals(Transition.symbol1)) {
                throw new SymbolNotInAlphabet (); // wieso geht es hier nicht?
            }
        }

    }
}
