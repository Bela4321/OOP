package Zettel11Michel;

public class Quidshark extends Carnivore {
    Quidshark(int sizeCreature) {
        if (sizeCreature >= 1100 || sizeCreature <= 1200) {
            this.sizeCreature = super.sizeCreature;
        }
        if (sizeCreature < 1100 || sizeCreature > 1200) {
            System.out.println("The size of a Quidshark has to be between 1100 and 1200 centimeters");
        }
    }
}
