package Präsenzzettel;

public class Namekian implements Fighter {
    private int basePowerLevel = 8;
    private int transformation = 0;
    final String name;

    public Namekian(String name){
        this.name = name;
    }

    @Override
    public void train(int hours) {
        this.basePowerLevel += 2*hours;
    }

    @Override
    public int getPowerLevel() {
        return (int) (basePowerLevel *  (transformation * 1.8 + 1));
    }

    void namekianAbsorb(int i) {
        transformation = i;
    }

    void powerdown(){
        transformation = 0;
    }
}
