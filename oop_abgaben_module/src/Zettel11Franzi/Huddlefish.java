package Zettel11Franzi;

public class Huddlefish extends Herbivore{
    Huddlefish(int sizeInCM){
        size = Math.min(90, Math.max(80, sizeInCM));
    }
}
