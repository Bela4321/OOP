package Zettel08Franzi;


import java.util.Arrays;
import java.util.Comparator;

public class Card implements Comparable {
    public final String NAME;
    public final int RELEASE_YEAR;
    private final int TYPE;

    public Card(String NAME, int RELEASE_YEAR, String TYPE) {
        this.NAME = NAME;
        this.RELEASE_YEAR = RELEASE_YEAR;
        if (TYPE.equals("Trap")) {
            this.TYPE = 3;
        } else if (TYPE.equals("Spell")) {
            this.TYPE = 2;
        } else if (TYPE.equals("EFFECTMONSTER")) {
            this.TYPE = 1;
        } else if (TYPE.equals("NORMALMONSTER")) {
            this.TYPE = 0;
        } else {
            System.out.println("No Correct Type given");
            this.TYPE = -1;
        }
    }

    public String getType() {
        if (this.TYPE == 3) {
            return "TRAP";
        } else if (this.TYPE == 2) {
            return "SPELL";
        } else if (this.TYPE == 1) {
            return "EFFECTMONSTER";
        } else if (this.TYPE == 0) {
            return "NORMALMONSTER";
        }
        return "ERROR: Invalid Type";
    }

    public static Card[] sort(Card[] cards) {
        Arrays.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                if (o1.RELEASE_YEAR != o2.RELEASE_YEAR) {
                    return o1.RELEASE_YEAR - o2.RELEASE_YEAR;
                } else if (o1.TYPE != o2.TYPE) {
                    return o1.TYPE - o2.TYPE;
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


}