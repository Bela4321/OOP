package Zettel09Franzi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe92FranziTest {
    @Test
    void replace(){
        String source1 = "Halloinchbines";
        String search1 = "in";
        String replace1 = "geht";
        String source2 = "Halloichbin";
        String search2 = "Hallo";
        String replace2 = "Geht";
        String source3 = "Ich";
        String search3 = "Geht";
        String replace3 = "WarNett";
        assertEquals(Aufgabe92Franzi.replace(source1,search1,replace1), "Hallogehtchbgehtes");
        assertEquals(Aufgabe92Franzi.replace(source2,search2,replace2), "Gehtichbin");
        assertEquals(Aufgabe92Franzi.replace(source3,search3,replace3), "Ich");

    }

}