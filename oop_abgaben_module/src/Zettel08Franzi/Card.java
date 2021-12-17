package Zettel08Franzi;


import java.util.Arrays;

public class Card implements Comparable {
    private String name;
    private String yearOfPublication;
    private static final String NORMAL_MONSTER = "Normale Monster";
    private static final String EFFECT_MONSTER = "Effektmonster";
    private static final String SPELL = "Zauberkarte";
    private static final String TRAP = "Fallenkarten";

    public String getName(){
        return name;
    }

    public String getYearOfPublication(){
        return yearOfPublication;
    }

    public static String getNormalMonster() {
        return NORMAL_MONSTER;
    }

    public static String getEffectMonster() {
        return EFFECT_MONSTER;
    }

    public static String getSPELL() {
        return SPELL;
    }

    public static String getTRAP() {
        return TRAP;
    }



    public Arrays sortCards(String [] cards) {
        int a = cards.length;
        String [] sortedCards = new String [a];
        for (int i = 2; i < cards.length - 2; i = i + 3){
            if (cards[i].equals(cards[i+3])){
                
            }
        }

        return null;
    }

    @Override
    public Arrays sortCards() {
        return null;
    }
}
