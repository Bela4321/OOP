package Zettel08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    Card card1 = new Card("Gandalf", 1959,"SPELL");
    Card card2 = new Card("Bilbo",1259,"TRAP");
    Card card3 = new Card("Bela",1259,"EFFECTMONSTER");
    Card card4 = new Card("Franzi",1042,"EFFECTMONSTER");
    Card card5 = new Card("Michel",1259,"SPELL");
    Card card6 = new Card("Gandalf",1259,"SPELL");
    Card card7 = new Card("Peter",2015,"MONSTER");
    @Test
    void getType() {
        assertEquals(card1.getType(),"SPELL");
        assertEquals(card2.getType(),"TRAP");
        assertEquals(card3.getType(),"EFFECTMONSTER");
        assertEquals(card7.getType(),"MONSTER");
    }

    @Test
    void sort() {
        Card[] cardsArray = {card1, card2,card3,card4,card5,card6,card7,card3,card4,card7};
        Card[] sortedArray = Card.sort(cardsArray);
        Card[] expectedArray = {card4, card4, card3, card3, card6, card5, card2, card1, card7, card7};
        assertArrayEquals(expectedArray, sortedArray);
    }
}