package Zettel9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe92Test {

    @Test
    void replace() {
        assertEquals("HaabiHaabo", Aufgabe92.replace("HalliHallo","ll","ab"));
        assertEquals("llllillllo", Aufgabe92.replace("HalliHallo","Ha","ll"));
        assertEquals("HalliHallServus", Aufgabe92.replace("HalliHallo","o","Servus"));
        assertEquals("mHallo", Aufgabe92.replace("HalliHallo","Halli","m"));

    }
}