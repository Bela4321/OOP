package Zettel10_Michel;

public class DFA extends GenericAutomation {
    protected String current;

    public DFA(Alphabet alphabet) {
        super(alphabet);
    }

    public void reset () {
        this.current = super.start;
    }

    public boolean isAccepting() {
        if (current == null) {
            current = super.start;
        }
        return super.findState(current).goOn;
    }

    public void makeTransition(String q1, String q2, Character symbol) throws TransitionAlreadyExists, StateDoesNotExist, SymbolNotInAlphabet {

        for (int i = 0; i < super.transitions.length; i++) {
            if (q1.equals(transitions[i].idStart) && Transition.symbol1 == symbol) {
                throw new TransitionAlreadyExists (transitions[i]);
            }
        }
        super.addTransition(new Transition(q1, q2, symbol));
    }


    public String delta(Character symbol) {
        if(current == null) {
            current = super.start;
        }
        for (Transition transition : super.transitions) {
            if (transition.idStart.equals(current) && transition.symbol1.equals((symbol))) {
                current = transition.idEnd;
                return current;
            }
        }
        return null;
    }
}

