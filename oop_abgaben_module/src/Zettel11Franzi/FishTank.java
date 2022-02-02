package Zettel11Franzi;

import java.util.ArrayList;
import java.util.List;

public class FishTank {
    ArrayList<Seacreature> creatures;

    FishTank(){
        creatures = new ArrayList<>();
    }

    void addCreature(Seacreature seacreature) throws LeviathanIsTooBig {
            if (seacreature instanceof Leviathan) {
                throw new LeviathanIsTooBig();
            } else {
                creatures.add(seacreature);
            }
    }

    <T> List <T> filter(T creature) {
        List<T> filteredList = new ArrayList<>();
        for (Seacreature creatureInFishTank : this.creatures) {
            if (creature instanceof T) {
                filteredList.add(creature);
            }
        }
        return filteredList;
    }

}
