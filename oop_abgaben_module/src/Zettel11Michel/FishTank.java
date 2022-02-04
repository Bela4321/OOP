package Zettel11Michel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FishTank {
    ArrayList<Seacreature> creatures;

    FishTank (ArrayList<Seacreature> creatures) {
        this.creatures = new ArrayList<Seacreature>(); // Wieso sind Belas ArrayList nicht für Seacreature?
    }

    public void addCreature (Seacreature addedCreature) throws NoLeviathanAllowedException {
        if (addedCreature instanceof Leviathan) {
            throw new NoLeviathanAllowedException();
        } else {
            creatures.set(creatures.size() + 1 , addedCreature); // funktioniert die auch?
        }
    }

    <T extends Seacreature> List<T> filter (T creature) { // hier die obere Schranke setzen, oder?
        List<T> search = new ArrayList<T>();
        for (Seacreature searched: creatures) {
            if (creature instanceof T) {
                System.out.println(searched);
                search.add(creature);
            }
        }
        /*List<T> search = Arrays.asList(); // funktioniert das auch?
        search.forEach(x -> System.out.println(x));
        */
        return search;
    }


}

