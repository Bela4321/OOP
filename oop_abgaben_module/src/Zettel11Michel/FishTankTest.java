package Zettel11Michel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTankTest {

    @Test
    void addCreature() {
        Seacreature one = new KeeperLeviathan(5500); // should fail
        Seacreature two = new Pampeel(2100);
        Seacreature three = new Quidshark(1150);
        Seacreature four = new PeaDragonLeviathan(11300); // should fail
        Seacreature five = new Bellray(800);
        Seacreature six = new Huddlefish(85);
        Seacreature seven = new KeeperLeviathan(100); // should fail
        Seacreature eight = new Huddlefish(200); // should fail
        Seacreature nine = new Bellray(20); // should fail
        Seacreature ten = new Pampeel(2200);

    }

    @Test
    void filter() {

    }
}