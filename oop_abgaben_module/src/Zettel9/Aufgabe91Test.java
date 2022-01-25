package Zettel9;

import Zettel09Franzi.Aufgabe91;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Aufgabe91Test {
    @Test
    void isReverse() {
        String a1 = "Hallo";
        String b1 = "Hi";
        String a2 = "BisMorgen";
        String b2 = "negromsib";
        String a3 = "BisMorgen";
        String b3 = "negroMsiB";
        assertEquals(Zettel09Franzi.Aufgabe91.isReverse(a1, b1), false);
        assertEquals(Zettel09Franzi.Aufgabe91.isReverse(a2, b2), false);
        assertEquals(Aufgabe91.isReverse(a3, b3), true);


    }
}
