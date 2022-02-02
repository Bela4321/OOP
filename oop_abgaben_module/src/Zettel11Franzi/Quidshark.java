package Zettel11Franzi;

public class Quidshark extends Carnivore{
    Quidshark(int sizeInCM){
        size = Math.min(1200, Math.max(1100,sizeInCM));
    }
}
