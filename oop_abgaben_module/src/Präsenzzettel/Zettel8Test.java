package Präsenzzettel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zettel8Test {
    Zettel8 root;

    @Test
    public void cubicRootTest(){
        assertEquals(100,root.cubicRoot(10.0,0.0000001));
    }

}