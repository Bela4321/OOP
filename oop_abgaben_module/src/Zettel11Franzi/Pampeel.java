package Zettel11Franzi;

public class Pampeel extends Carnivore{
    Pampeel(int sizeInCM) {
        size = Math.min(2200, Math.max(2000, sizeInCM));
    }
}
