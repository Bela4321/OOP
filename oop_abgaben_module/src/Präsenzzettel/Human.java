package Präsenzzettel;

public class Human implements Fighter{
    private int basePowerLevel = 5;
    final String name;

    public Human(String name){
        this.name = name;
    }

    @Override
    public void train(int hours) {
        this.basePowerLevel += hours;
    }

    @Override
    public int getPowerLevel() {
        return basePowerLevel;
    }
}
