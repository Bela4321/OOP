package Zettel11Michel;

public class Huddlefish extends Herbivore {
    Huddlefish(int sizeCreature) {
        if (sizeCreature >= 80 || sizeCreature <= 90) {
            this.sizeCreature = super.sizeCreature;
        }
        if (sizeCreature < 80 || sizeCreature > 90) {
            System.out.println("The size of a Huddlefish has to be between 80 and 90 centimeters");
        }
    }
}
