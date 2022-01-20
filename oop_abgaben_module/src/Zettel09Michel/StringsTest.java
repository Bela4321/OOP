package Zettel09Michel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {
/*
    @Test
    void isReverse() {
        assertTrue(Strings.isReverse("MICHEL", "LEHCIM") == true);
        assertTrue(Strings.isReverse("FRANZI", "IZNARF") == true);
        assertTrue(Strings.isReverse("BELA", "ALEB") == true);
        assertTrue(Strings.isReverse("MICHEL", "LECHIM") == false);
        assertTrue(Strings.isReverse("FRANZI", "FZNARI") == false);
        assertTrue(Strings.isReverse("BELA", "BELA") == false);
    }
*/
    private void assertEquals(String reverse) {
    } // diese Methode braucht IntelliJ, um Testen zu können. Warum?
    // Es kommt Fehler: assertEquals(boolean) in StringsTest cannot be applied to '(java.lang.String)'


    @Test
    void replace() {
        assertEquals(Strings.replace("Hi it's Michel.", "Michel", "Franzi"));
        assertEquals(Strings.replace("We are going now.", "we","you")); // klappt es auch bei Unterschied Buchstaben?
        assertEquals(Strings.replace("We are going now", "now", "then")); // klappt es am Ende?
        assertEquals(Strings.replace("We are going now", "We", "You")); // klappt es am Anfang?
    }
}