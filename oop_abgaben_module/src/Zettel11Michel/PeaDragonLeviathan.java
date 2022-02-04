package Zettel11Michel;

public class PeaDragonLeviathan extends Leviathan {
    PeaDragonLeviathan(int sizeCreature) {
        if (sizeCreature >= 11000 || sizeCreature <= 11600) {
            this.sizeCreature = super.sizeCreature;
        }
        if (sizeCreature < 11000 || sizeCreature > 11600) {
            System.out.println("The size of a PeaDragonLeviathan has to be between 11000 and 11600 centimeters");
        }
    }
}

