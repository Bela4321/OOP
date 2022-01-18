package Zettel09Michel;

public class GoodsSegment extends GoodsCrate {
    public double heightS;
    public double widthS;
    public double depthS;
    public double weightS;
    public int[] segmentArr = new int[9];

    public GoodsSegment(double heightC, double widthC, double depthC, double weightC) { // hier hat IntelliJ einen komischen Konstruktor gebaut.
        super(heightC, widthC, depthC, weightC);
        this.heightS = heightS;
        this.widthS = widthS;
        this.depthS = depthS;
        this.weightS = weightS;
        this.segmentArr = segmentArr; // braucht es das Array hier?
    }

    void addCrate(GoodsCrate crate) { //Kiste in ein freies Fach einlagern (mit Drehung und max. Gewicht)
        int crateX = 1; // Wie muss die Var. genutzt werden, wenn es für immer neue crates funktionieren soll?
        // muss noch rein: if segmentArr[i] = 0 (weil default Wert), dann einlagern && alle weightC in segmentArr + weightC <= weightS
        for (int i = 0; i < segmentArr.length; i++) {
            if (heightC <= heightS / 3 && widthC <= widthS / 3 && depthC <= depthS / 3 && weightC <= weightS) {
                segmentArr[i] = crateX;
                return;
            } else if (widthC <= heightS / 3 && heightC <= widthS / 3 && depthC <= depthS / 3 && weightC <= weightS) {
                segmentArr[i] = crateX;
                return;
            } else if (widthC <= heightS / 3 && depthC <= widthS / 3 && heightC <= depthS / 3 && weightC <= weightS) {
                segmentArr[i] = crateX;
                return;
            } else if (depthC <= heightS / 3 && heightC <= widthS / 3 && widthC <= depthS / 3 && weightC <= weightS) {
                segmentArr[i] = crateX;
                return;
            } else {
                System.out.println("Crate does not fit into this segment.");
            }
        }
        /* alles mit nested for-loops und zweidimensionalem Array? testen?
            for (int j = 0; j < segmentArr.length; j++) {
                for (int k = 0; k < segmentArr.length; k++) {
                        */
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
