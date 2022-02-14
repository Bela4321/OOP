/*package Zettel11;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FishTankTest {

    @Test
    void addCreature() throws LeviathanIsTooBig {
        Seacreature one = new KeeperLeviathan(5500); // should fail
        Seacreature two = new Pampeel(2100);
        Seacreature three = new Quidshark(1150);
        Seacreature four = new PeaFragonLeviathan(11300); // should fail
        Seacreature five = new Bellyray(800);
        Seacreature six = new Huddlefish(85);
        Seacreature seven = new KeeperLeviathan(100); // should fail
        Seacreature eight = new Huddlefish(200); // should fail
        Seacreature nine = new Bellyray(20); // should fail
        Seacreature ten = new Pampeel(2200);

        ArrayList<Seacreature> arraySea = new ArrayList<>();
        FishTank one1 = new FishTank();

        one1.addCreature(two);
        one1.addCreature(three);
        one1.addCreature(five);
        one1.addCreature(six);
        one1.addCreature(ten);

        assertTrue(arraySea.get(0) instanceof Pampeel);
        assertTrue(arraySea.get(1) instanceof Quidshark);
        assertTrue(arraySea.get(2) instanceof Bellyray);
        assertTrue(arraySea.get(3) instanceof Huddlefish);
        assertTrue(arraySea.get(4) instanceof Pampeel);

    }

    @Test
    void filter() throws LeviathanIsTooBig {
        Seacreature siggi = new Pampeel(2100);
        Seacreature berti = new Bellyray(800);

        FishTank one1 = new FishTank();

        one1.addCreature(siggi);
        one1.addCreature(berti);

        one1.filter(Bellyray.class);
        one1.filter(Pampeel.class);

        assertTrue(one1.filter(Bellyray.class).contains(berti));
        assertTrue(one1.filter(Pampeel.class).contains(siggi));

    }
}
*/
