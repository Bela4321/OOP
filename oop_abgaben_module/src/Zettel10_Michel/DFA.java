package Zettel10_Michel;

public class DFA extends GenericAutomation {
    public String current;

    DFA(String current, State[] states, Transition[] transitions, Alphabet[] alphabet, String start) {
        super(states, transitions, alphabet, start);
        this.current = current;
    }

    @Override
    public void reset() {
        current = start;
    }

    @Override
    public boolean isAccepting() {
        for (int i = 0; i < alphabet.length; i++) {
            if (current.equals(alphabet[i])) {
                return true;
            }
        }
        return false;
    }

    public void makeTransition(String q1, String q2, Character symbol) throws TransitionAlreadyExists {
        addTransition(Transition(q1, q2, symbol)); // idk!!
        for (int i = 0; i < transitions.length; i++) {
            if (q1.equals(Transition.idStart)) {
                throw new TransitionAlreadyExists ();
            }
        }
    }

    public String delta(Charactar symbol) {
        for (String current : transitions) {
// hier hänge ich mich morgen noch ran !"!!
        }
        return current;
    }
}
