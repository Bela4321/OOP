package Zettel11;

public class Quidshark extends Carnivore{

    Quidshark(int sizeInCM) {
        size = Math.min(1200,Math.max(1100,sizeInCM));
        if (sizeInCM != size) {
            System.out.println("Input out of bounds, rounded "+sizeInCM+"cm to "+size+"cm.");
        }
    }

}
