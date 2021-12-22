package Zettel08;

import java.util.Arrays;


interface Comparable{
    static Card[] sort(Card[] cards) {
        return new Card[0];
    }
}

public class Card implements Comparable {
    public final String NAME;
    public final int RELEASE_YEAR;
    private final int TYPE_ID;
    private final String[] TYPE_ID_TO_STRING = {"MONSTER", "EFFECTMONSTER", "SPELL", "TRAP"};

    public Card(String NAME, int RELEASE_YEAR, String TYPE) {
        this.NAME =NAME;
        this.RELEASE_YEAR = RELEASE_YEAR;
        if (Arrays.asList(TYPE_ID_TO_STRING).contains(TYPE)) {
            this.TYPE_ID= Arrays.asList(TYPE_ID_TO_STRING).indexOf(TYPE);
            return;
        }
        System.out.println("No Correct Type givem");
        this.TYPE_ID =-1;

    }

    public String getType() {
        try {
            return TYPE_ID_TO_STRING[TYPE_ID];
        } catch (Exception e) {
            System.out.println("Invalid Cardtype--check initialisation");
            return "";
        }

    }

    public static Card[] sort(Card[] cards) {
        Arrays.sort(cards, (o1, o2) -> {
            if (o1.RELEASE_YEAR!=o2.RELEASE_YEAR) {
                return o1.RELEASE_YEAR-o2.RELEASE_YEAR;
            } else if (o1.TYPE_ID != o2.TYPE_ID) {
                return o1.TYPE_ID -o2.TYPE_ID;
            } else {
                return o1.NAME.compareToIgnoreCase(o2.NAME);
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
}
