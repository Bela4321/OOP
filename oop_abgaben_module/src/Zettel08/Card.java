package Zettel08;

import java.util.Arrays;
import java.util.Comparator;


interface Comparable{
    static Card[] sort(Card[] cards) {
        return new Card[0];
    }
}

public class Card implements Comparable {
    public final String NAME;
    public final int RELEASE_YEAR;
    private final int TYPE;

    public Card(String NAME, int RELEASE_YEAR, String TYPE) {
        this.NAME =NAME;
        this.RELEASE_YEAR = RELEASE_YEAR;
        if (TYPE.equals("TRAP")){
            this.TYPE = 3;
        } else if (TYPE.equals("SPELL")) {
            this.TYPE=2;
        } else if (TYPE.equals("EFFECTMONSTER")) {
            this.TYPE=1;
        } else if (TYPE.equals("MONSTER")) {
            this.TYPE=0;
        } else {
            System.out.println("No Correct Type givem");
            this.TYPE=-1;
        }
    }

    public String getType() {
        if (this.TYPE==3){
            return "TRAP";
        } else if (this.TYPE==2) {
            return "SPELL";
        } else if (this.TYPE==1) {
            return "EFFECTMONSTER";
        } else if (this.TYPE==0) {
            return "MONSTER";
        }
        return "ERROR: Invalid Type";
    }

    public static Card[] sort(Card[] cards) {
        Arrays.sort(cards, new Comparator<Card>() {
            public int compare(Card o1, Card o2) {
                if (o1.RELEASE_YEAR!=o2.RELEASE_YEAR) {
                    return o1.RELEASE_YEAR-o2.RELEASE_YEAR;
                } else if (o1.TYPE!= o2.TYPE) {
                    return o1.TYPE-o2.TYPE;
                } else {
                    return o1.NAME.compareToIgnoreCase(o2.NAME);
                }
            }
        });
        return cards;
    }

    public String toString() {
        return "Card{" +
                "NAME='" + NAME + '\'' +
                ", RELEASE_YEAR=" + RELEASE_YEAR +
                ", TYPE=" + this.getType() +
                '}';
    }

    public static void main(String[] args) {
        Card card1 = new Card("Gandalf", 1959,"SPELL");
        Card card2 = new Card("Bilbo",1259,"TRAP");
        Card card3 = new Card("Bela",1259,"EFFECTMONSTER");
        Card card4 = new Card("Franzi",1042,"EFFECTMONSTER");
        Card card5 = new Card("Michel",1259,"SPELL");
        Card card6 = new Card("Gandalf",1259,"SPELL");
        Card card7 = new Card("Peter",2015,"MONSTER");
        Card[] cardsArray = {card1, card2,card3,card4,card5,card6,card7,card3,card4,card7};
        for (Card card:cardsArray) {
            System.out.println(card);
        }
        cardsArray= Card.sort(cardsArray);
        System.out.println();
        for (Card card:cardsArray) {
            System.out.println(card);
        }
    }

}
