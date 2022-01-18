package Zettel9;
import java.util.Arrays;

public class GoodsSegment {
    public final double HEIGHT;
    public final double WIDTH;
    public final double DEPTH;
    public final double MAX_WEIGHT;
    public GoodsCrate[] compartments;

    GoodsSegment( double HEIGHT, double WIDTH, double DEPTH, double MAX_WEIGHT) {
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        this.DEPTH = DEPTH;
        this.MAX_WEIGHT = MAX_WEIGHT;
        this.compartments = new GoodsCrate[9];
    }

    public boolean fitsCrate(GoodsCrate crate) {
        if (this.getWeight()+crate.WEIGHT>this.MAX_WEIGHT) {
            return false;
        }
        double[] crateMeasurements = {crate.WIDTH,crate.HEIGHT,crate.DEPTH};
        double[] compMeasurements = {this.HEIGHT/3,this.WIDTH/3, this.DEPTH/3};
        Arrays.sort(crateMeasurements);
        Arrays.sort(compMeasurements);
        for (int i = 0;i<compMeasurements.length;i++) {
            if (crateMeasurements[i]>compMeasurements[i]) {
                return false;
            }
        }
        return true;
    }

    public void addCrate(GoodsCrate crate) {
        if (!this.fitsCrate(crate)) {
            System.out.println("Crate doesnt fit, too big :(");
        }
        for (GoodsCrate compartment : compartments) {
            if (compartment==null) {
                compartment = crate;
                break;
            }
        }
    }

    public double getWeight() {
        double currentWeight = 0;
        for (GoodsCrate storedCrate: compartments) {
            if (storedCrate!=null) {
                currentWeight += storedCrate.WEIGHT;
            }
        }
        return currentWeight;
    }
    public double getEmptyCompatrments() {
        int count = 0;
        for (GoodsCrate crate : compartments) {
            if (crate == null) {
                count++;
            }
        }
        return count;
    }


}
