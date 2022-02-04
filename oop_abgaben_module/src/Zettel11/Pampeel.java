package Zettel11;

public class Pampeel extends Carnivore{

    Pampeel(int sizeInCM) {
        size = Math.min(2200,Math.max(2000,sizeInCM));
        if (sizeInCM != size) {
            System.out.println("Input out of bounds, rounded "+sizeInCM+"cm to "+size+"cm.");
        }
    }

}
