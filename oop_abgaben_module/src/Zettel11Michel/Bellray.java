package Zettel11Michel;

public class Bellray extends Herbivore {
    Bellray(int sizeCreature) {
        if (sizeCreature >= 700 || sizeCreature <= 900) {
            this.sizeCreature = super.sizeCreature;
        }
        if (sizeCreature < 700 || sizeCreature > 900) {
            System.out.println("The size of a Bellray has to be between 700 and 900 centimeters");
        }
    }
}
