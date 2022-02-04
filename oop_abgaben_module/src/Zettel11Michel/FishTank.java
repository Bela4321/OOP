package Zettel11Michel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FishTank {
    ArrayList<Seacreature> creatures;

    FishTank (ArrayList<Seacreature> creatures) {
        this.creatures = new ArrayList<Seacreature>(); // ist das so richtig?
    }

    public void addCreature (Seacreature addedCreature) throws NoLeviathanAllowedException {
        if (addedCreature instanceof Leviathan) {
            throw new NoLeviathanAllowedException(addedCreature.sizeCreature);
        } else {
            creatures.set(creatures.size() + 1 , addedCreature);
        }
    }

    public <T extends Seacreature> List<T> filter (T creature) {
        // funktioniert das nicht?
        /*for (Seacreature searched: creatures) {
            Class a = searched.getClass();
            if (a.isInstance(<T>)) {
                System.out.println(searched);
            }
        }*/
        List<T> search = Arrays.asList(); // funktioniert das auch?
        search.forEach(x -> System.out.println(x));
        return null;
    }

    public static void main(String[] args) {
        public <Carnivore extends Seacreature> List<Carnivore> filter (Carnivore creature) {
    }
}

