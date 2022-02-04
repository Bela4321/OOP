package Zettel11;

public class Huddlefish extends Herbivore{

    Huddlefish(int sizeInCM) {
        size=Math.min(90,Math.max(80,sizeInCM));
        if (sizeInCM != size) {
            System.out.println("Input out of bounds, rounded "+sizeInCM+"cm to "+size+"cm.");
        }
    }

}
