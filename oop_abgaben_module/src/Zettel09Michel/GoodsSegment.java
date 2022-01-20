package Zettel09Michel;

import java.util.Arrays;

public class GoodsSegment {
    public double heightS;
    public double widthS;
    public double depthS;
    public double weightS;
    public GoodsCrate[]segmentArr;

    public GoodsSegment(double heightS, double widthS, double depthS, double weightS) {
        this.heightS = heightS;
        this.widthS = widthS;
        this.depthS = depthS;
        this.weightS = weightS;
        this.segmentArr = new GoodsCrate[9]; // braucht es das Array hier?
    }

// Nach Belas Mehtode: Array für den Fit der Maße von Crate und Segment + Sortierung aufsteigend
    public boolean FitCrate (GoodsCrate crate) {
        double[] arrS = {heightS/3, widthS/3, depthS/3};
        double[] arrC = {crate.heightC, crate.widthC, crate.depthC};
        Arrays.sort(arrS);
        Arrays.sort(arrC);
        for (int i = 0; i < arrS.length; i++) {
            if(arrC[i] > arrS[i]) {
                return false;
            }
        }
        if(crate.weightC > weightS) {
            return false;
        }
        return true;
    }

    public void addCrate(GoodsCrate crate) {
        if (FitCrate(crate) == false) {
            System.out.println("Crate does not fit into this segment.");
        }
        for (GoodsCrate i: segmentArr) {
            if(FitCrate(crate) == true) {
                i = crate;
                return;
            }
        }
    }
}
/*
    public boolean findSegmentForCrate(GoodsCrate crate){
        if () { // Methode von oben übernehmen und anpassen für "kleinst mögliche Raumnutzung".
            return true;
        } else {
            System.out.println("There is no fitting Segment for this crate.");
            return false;
        }
    }

}
*/
