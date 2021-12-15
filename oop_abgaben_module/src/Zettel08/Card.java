package Zettel08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

interface Comparable{
    Card[] sort(Card[] cards);
}

public class Card implements Comparable {
    public final String NAME;
    public final Date RELEASE_DATE;
    private final int TYPE;

    public Card(String NAME,Date RELEASE_DATE,String TYPE) {
        this.NAME =NAME;
        this.RELEASE_DATE=RELEASE_DATE;
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

    public Card[] sort(Card[] cards) {
        Arrays.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                if (o1.RELEASE_DATE.getYear()!=o2.RELEASE_DATE.getYear()) {
                    return o1.RELEASE_DATE.getYear()-o2.RELEASE_DATE.getYear();
                } else if (o1.TYPE!= o2.TYPE) {
                    return o1.TYPE-o2.TYPE;
                } else {
                    return o1.NAME.compareToIgnoreCase(o2.NAME);
                }
            }
        });
        return cards;
    }


}
