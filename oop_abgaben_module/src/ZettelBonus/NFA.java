package ZettelBonus;

import java.util.ArrayList;

public class NFA extends GenericAutomaton{
    ArrayList<String> currentStates = new ArrayList();
    ArrayList<String> start;

    NFA(Alphabet alphabet) {
        super(alphabet);
    }


    @Override
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
            this.start.add(state.getId());
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


    @Override
    protected void addTransition(Transition transition) throws SymbolNotInAlphabetException, StateDoesNotExistException {
        super.addTransition(transition);
    }

    public ArrayList<String> delta(Character symbol) {
        ArrayList<String> nextStates = new ArrayList<>();
        for (Transition transition : transitions) {
            if (currentStates.contains(transition.getStart())&&transition.getSymbol().equals(symbol));
            nextStates.add(transition.getEnd());
        }
        currentStates = nextStates;
        return nextStates;
    }

    @Override
    public void reset(){
        this.currentStates = this.start;
    }


    @Override
    public boolean isAccepting() {
        for (String current : currentStates){
            if (super.findState(current).isAccepting()) {
                return true;
            }
        }
        return false;
    }
}
