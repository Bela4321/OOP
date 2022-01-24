package Zettel10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DFATest {

    @Test
    void addState() throws Exception{
        Character[] charAlphabet = {'0','1','2'};
        Alphabet alphabet= new Alphabet(charAlphabet);
        DFA dfa = new DFA(alphabet);

        State state0 = new State("start",false);
        State state1 = new State("end", true);

        dfa.addState(state0,false);
        assertEquals(state0, dfa.states[0]);

        dfa.addState(state1, true);
        assertEquals(state1, dfa.states[1]);
    }

    @Test
    void findState() throws Exception{
        Character[] charAlphabet = {'0','1','2'};
        Alphabet alphabet= new Alphabet(charAlphabet);
        DFA dfa = new DFA(alphabet);
        State state0 = new State("start",false);
        State state1 = new State("end", true);
        dfa.addState(state0,false);
        dfa.addState(state1, true);

        assertEquals(state0,dfa.findState("start"));
        assertNull(dfa.findState("middle"));
    }

    @Test
    void addTransition() throws Exception{
        Character[] charAlphabet = {'0','1','2'};
        Alphabet alphabet= new Alphabet(charAlphabet);
        DFA dfa = new DFA(alphabet);
        State state0 = new State("start",false);
        State state1 = new State("end", true);
        dfa.addState(state0,true);
        dfa.addState(state1, false);

        Transition transition0 = new Transition("start","end",'2');
        dfa.addTransition(transition0);

        Transition transition1 = new Transition("end", "starting",'1');
        assertThrows(StateDoesNotExist.class, () -> {dfa.addTransition(transition1);});

        Transition transition2 = new Transition("end", "start", 'a');
        assertThrows(SymbolNotInAlphabet.class, () -> {dfa.addTransition(transition2);});
    }

    @Test
    void reset() throws Exception{
        Character[] charAlphabet = {'0','1','2'};
        Alphabet alphabet= new Alphabet(charAlphabet);
        DFA dfa = new DFA(alphabet);
        State state0 = new State("start",false);
        State state1 = new State("end", true);
        dfa.addState(state0,true);
        dfa.addState(state1, false);
        Transition transition0 = new Transition("start","end",'2');
        dfa.addTransition(transition0);
        Transition transition1 = new Transition("end", "start",'2');
        dfa.addTransition(transition1);

        dfa.delta('2');
        dfa.reset();
        assertEquals("end", dfa.delta('2'));
        dfa.reset();
        dfa.reset();
        assertEquals("end", dfa.delta('2'));
    }

    @Test
    void isAccepting() throws Exception{
        Character[] charAlphabet = {'0','1','2'};
        Alphabet alphabet= new Alphabet(charAlphabet);
        DFA dfa = new DFA(alphabet);
        State state0 = new State("start",false);
        State state1 = new State("end", true);
        dfa.addState(state0,true);
        dfa.addState(state1, false);
        Transition transition0 = new Transition("start","end",'2');
        dfa.addTransition(transition0);
        Transition transition1 = new Transition("end", "start",'2');
        dfa.addTransition(transition1);

        assertFalse(dfa.isAccepting());
        dfa.delta('2');
        assertTrue(dfa.isAccepting());
    }

    @Test
    void makeTransition() throws Exception{
        Character[] charAlphabet = {'0','1','2'};
        Alphabet alphabet= new Alphabet(charAlphabet);
        DFA dfa = new DFA(alphabet);
        State state0 = new State("start",false);
        State state1 = new State("end", true);
        dfa.addState(state0,true);
        dfa.addState(state1, false);
        Transition transition0 = new Transition("start","end",'2');
        dfa.addTransition(transition0);
        Transition transition1 = new Transition("end", "start",'2');
        dfa.addTransition(transition1);

        assertThrows(SymbolNotInAlphabet.class, () -> {dfa.makeTransition("start","end", '❤');});
        assertThrows(TransitionAlreadyExists.class, () -> {dfa.makeTransition("start","end", '2');});

        dfa.makeTransition("start","end", '0');
        assertEquals(state1.ID,dfa.delta('0'));
    }

    @Test
    void delta() throws Exception{
        Character[] charAlphabet = {'0','1','2'};
        Alphabet alphabet= new Alphabet(charAlphabet);
        DFA dfa = new DFA(alphabet);
        State state0 = new State("start",false);
        State state1 = new State("end", true);
        dfa.addState(state0,true);
        dfa.addState(state1, false);
        Transition transition0 = new Transition("start","end",'2');
        dfa.addTransition(transition0);
        Transition transition1 = new Transition("end", "start",'2');
        dfa.addTransition(transition1);
        Transition transition2 = new Transition("start", "start",'0');
        dfa.addTransition(transition2);

        assertEquals(state1.ID,dfa.delta('2'));
        assertEquals(state0.ID,dfa.delta('2'));
        assertEquals(state0.ID,dfa.delta('0'));
    }
}