package Zettel08;

import static org.junit.jupiter.api.Assertions.*;

class CaesarChiffreTest {


    @org.junit.jupiter.api.Test
    void decode() {
        assertEquals(CaesarChiffre.decode("HGXBO",'W','Z'),"KJAER");
        assertEquals(CaesarChiffre.decode("DKKLAJ",'n','R'),"HOOPEN");
        assertEquals(CaesarChiffre.decode("TUFSMJOH",'A','Z'),"STERLING");
        assertEquals(CaesarChiffre.decode("VJGFKDDWM",'E','c'),"THEDIBBUK");
        assertEquals(CaesarChiffre.decode("ZQJCAKJIWOPAN",'W','A'),"DUNGEONMASTER");
        assertEquals(CaesarChiffre.decode("XHZRGFLGJSOFRNS",'G','B'),"SCUMBAGBENJAMIN");
    }
}