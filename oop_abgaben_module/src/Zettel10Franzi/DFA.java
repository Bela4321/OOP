package Zettel10Franzi;


public class DFA extends GenericAutomaton{
    private String current;

    public DFA(Alphabet alphabet){
        super(alphabet);
    }

    public void reset(){
        this.current = super.start;
    }

    public boolean isAccepting(){
        if (current == null){
            current = super.start;
        }
        return super.findState(current).accepted;
    }


    public void makeTransition( String q1, String q2, Character symbol) throws SymbolNotInAlphabet, StateDoesNotExist, TransitionAlreadyExists{
        for (Transition transition : transitions) {
            if (transition.startID.equals(q1) && transition.symbol == symbol) {
                throw new TransitionAlreadyExists(transition);
            }
        }
            super.addTransition(new Transition(q1, q2,symbol));

    }
    //Warum geht das so?:
    public  String delta (Character symbol){
        for (Transition transition : super.transitions) {
            if (transition.startID.equals(current)&&transition.symbol.equals(symbol)){
                current = transition.endID;
                return current;
            }
        }
        return null;
    }
    }


}
