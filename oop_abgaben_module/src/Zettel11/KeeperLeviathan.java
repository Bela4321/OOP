package Zettel11;

public class KeeperLeviathan extends Leviathan{

    KeeperLeviathan(int sizeInCM) {
        size = Math.min(5600,Math.max(5400,sizeInCM));
        if (sizeInCM != size) {
            System.out.println("Input out of bounds, rounded "+sizeInCM+"cm to "+size+"cm.");
        }
    }

}
