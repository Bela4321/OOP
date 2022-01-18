package Zettel9;

import java.util.Arrays;

public class GoodsShelfSystem {
    GoodsSegment[] segmente;

    GoodsShelfSystem(GoodsSegment[] segmente) {
        this.segmente = segmente;
    }

    public boolean findSegmentForCrate(GoodsCrate crate) {
        double[] fitScores= new double[segmente.length];

        for (int i=0; i<segmente.length;i++) {
            if (segmente[i].fitsCrate(crate)) {
                double diff = (segmente[i].WIDTH*segmente[i].HEIGHT*segmente[i].DEPTH- crate.DEPTH*crate.WIDTH*crate.HEIGHT)+Math.abs(crate.WEIGHT-(segmente[i].MAX_WEIGHT-segmente[i].getWeight())/segmente[i].getEmptyCompatrments());
                fitScores[i] = 1/(diff+0.0001);
            } else {
                fitScores[i] = -1;
            }
        }
        double maxScore= -1;
        int maxIndex = 0;
        for (int i = 0;i<fitScores.length;i++) {
            if (maxScore < fitScores[i]) {
                maxScore= fitScores[i];
                maxIndex = i;
            }
        }
        if (maxScore <0) {
            return false;
        } else {
            segmente[maxIndex].addCrate(crate);
            return true;
        }
    }
}
