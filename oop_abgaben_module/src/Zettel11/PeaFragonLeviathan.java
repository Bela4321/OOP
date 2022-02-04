package Zettel11;

public class PeaFragonLeviathan extends Leviathan{

    PeaFragonLeviathan(int sizeInCM) {
        size = Math.min(11600,Math.max(11000,sizeInCM));
        if (sizeInCM != size) {
            System.out.println("Input out of bounds, rounded "+sizeInCM+"cm to "+size+"cm.");
        }
    }

}
