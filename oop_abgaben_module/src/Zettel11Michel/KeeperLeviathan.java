package Zettel11Michel;

public class KeeperLeviathan extends Leviathan{
    KeeperLeviathan(int sizeCreature) {
        if (sizeCreature >= 54000|| sizeCreature <= 5600) {
            this.sizeCreature = super.sizeCreature;
        }
        if (sizeCreature < 5400 || sizeCreature > 5600) {
            System.out.println("The size of a KeeperLevithan has to be between 5400 and 5600 centimeters");
        }
    }
}
