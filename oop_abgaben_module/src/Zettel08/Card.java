package Zettel08;

import java.util.Arrays;


public class Card implements Comparable<Card> {
    public final String NAME;
    public final int RELEASE_YEAR;
    private final int TYPE_ID;
    private final String[] TYPE_ID_TO_STRING = {"MONSTER", "EFFECTMONSTER", "SPELL", "TRAP"};

    public Card(String NAME, int RELEASE_YEAR, String TYPE) {
        this.NAME = NAME;
        this.RELEASE_YEAR = RELEASE_YEAR;
        if (Arrays.asList(TYPE_ID_TO_STRING).contains(TYPE)) {
            this.TYPE_ID = Arrays.asList(TYPE_ID_TO_STRING).indexOf(TYPE);
            return;
        }
        System.out.println("No Correct Type givem");
        this.TYPE_ID = -1;

    }

    public String getType() {
        try {
            return TYPE_ID_TO_STRING[TYPE_ID];
        } catch (Exception e) {
            System.out.println("Invalid Cardtype--check initialisation");
            return "";
        }

    }

    public String toString() {
        return "Card{" +
                "NAME='" + NAME + '\'' +
                ", RELEASE_YEAR=" + RELEASE_YEAR +
                ", TYPE=" + this.getType() +
                '}';
    }

    public int compareTo(Card o) {
        if (this.RELEASE_YEAR != o.RELEASE_YEAR) {
            return this.RELEASE_YEAR - o.RELEASE_YEAR;
        } else if (this.TYPE_ID != o.TYPE_ID) {
            return this.TYPE_ID - o.TYPE_ID;
        } else {
            return this.NAME.compareToIgnoreCase(o.NAME);
        }
    }

}
