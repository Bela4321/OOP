package Präsenzzettel;

public class Sayan implements Fighter {
    private int basePowerLevel = 10;
    private int transformation = 0;
    final String name;

    public Sayan(String name){
        this.name = name;
    }

    @Override
    public void train(int hours) {
        this.basePowerLevel += 3*hours;
    }

    @Override
    public int getPowerLevel() {
        return basePowerLevel * (transformation * 2 + 1);
    }

    void supaSayajin (int i){
        if ( 1< i && i<4){
            transformation = i;
        }
    }

    void supaSayajinGoto() {
        transformation = 666;
    }

    void powerdown(){
        transformation = 0;
    }


}
