package Zettel09Michel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

    @Test
    void isReverse() {
        assertTrue(Strings.isReverse("MICHEL", "LEHCIM") == true);
        assertTrue(Strings.isReverse("FRANZI", "IZNARF") == true);
        assertTrue(Strings.isReverse("BELA", "ALEB") == true);
        assertTrue(Strings.isReverse("MICHEL", "LECHIM") == false);
        assertTrue(Strings.isReverse("FRANZI", "FZNARI") == false);
        assertTrue(Strings.isReverse("BELA", "BELA") == false);
    }

    private void assertEquals(String reverse) {
    } // diese Methode braucht IntelliJ, um Testen zu können. Warum?
    // Es kommt Fehler: assertEquals(boolean) in StringsTest cannot be applied to '(java.lang.String)'


    @Test
    void replace() { // Muss noch ein String als Ergebnis zum Vergleichen haben: Siehe andere Tests!
        assertEquals(Strings.replace("Hi it's Michel.", "Michel", "Franzi"));
        assertEquals(Strings.replace("We are going now.", "we","you"));
        assertEquals(Strings.replace("We are going now", "now", "then"));
        assertEquals(Strings.replace("We are going now", "We", "You"));
    }
}