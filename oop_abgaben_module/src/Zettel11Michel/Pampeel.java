package Zettel11Michel;

public class Pampeel extends Carnivore{
    Pampeel(int sizeCreature) {
        if (sizeCreature >= 2000 || sizeCreature <= 2200) {
            this.sizeCreature = super.sizeCreature;
        }
        if (sizeCreature < 2000 || sizeCreature > 2200) {
            System.out.println("The size of a Pampeel has to be between 2000 and 2200 centimeters");
        }
    }
}
