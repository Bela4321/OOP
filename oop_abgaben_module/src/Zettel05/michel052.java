package Zettel05;

public class michel052 {

    // 5.2)
    /* Array mit drei Einträgen pro Sekunde als Koordinaten in Metern.
     */

    double[] gps; //= {x1,y1,z1,x2,y2,z2,...};

    double distance(double[] gps) {
        double dis = Math.sqrt(Math.pow(gps[gps.length - 2] - gps[0],2) + Math.pow(gps[(gps.length) - 1] - gps[1],2) + Math.pow(gps[gps.length] - gps[2],2));
    return dis;
    }

    double velocity (double[] gps) {
        double velo = Math.sqrt(Math.pow(gps[gps.length - 2] - gps[0],2) + Math.pow(gps[(gps.length) - 1] - gps[1],2) + Math.pow(gps[gps.length] - gps[2],2))/ gps.length;
    return velo;
    }

    /*
    max wird auf velocity gesetzt. (in m/s)
    Dann wird in der for-Schleife die Geschwindigkeit zwischen jeder gelaufenen Sekunde angeschaut. Einheit ist dann schon m/s.
    Wenn diese größer max, dann ist das die neue maxVelocity.
     */
    double maxVelocity (double[] gps) {
        for (int i = 0; i < gps.length; i = i + 3) {
            double max = Math.sqrt(Math.pow(gps[gps.length - 2] - gps[0],2) + Math.pow(gps[(gps.length) - 1] - gps[1],2) + Math.pow(gps[gps.length] - gps[2],2)) / gps.length;
            double newMax = Math.sqrt(Math.pow(gps[i + 3] - gps[i],2) + Math.pow(gps[i + 4] - gps[i + 1],2) + Math.pow(gps[i + 5] - gps[i + 2],2));
            if (newMax > max) {
                max = newMax;
            }
            return max;
        }
    }

    double[] partialGPS(double[] gps, double[] start, double[] end) {

    }
}
