package Zettel11;

public class Bellyray extends Herbivore{

    Bellyray(int sizeInCM) {
        this.size=Math.min(900,Math.max(700,sizeInCM));
        if (sizeInCM != size) {
            System.out.println("Input out of bounds, rounded "+sizeInCM+"cm to "+size+"cm.");
        }
    }

}
