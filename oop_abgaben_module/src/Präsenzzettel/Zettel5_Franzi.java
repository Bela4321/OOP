package Präsenzzettel;

import java.util.Arrays;

public class Zettel5_Franzi {
    static double[] computerIncline(double [] points) {
        double [] incline = new double[points.length/2];
        double gradient = 0;
        int i = 0;
        if (i < points.length - 2) {
       // for (int i = 0; i < points.length - 2; i = i + 2) {
            gradient = (points[i+3]-points[i+1])/(points[i]-points[i+2]);
            double [] newPoints = Arrays.copyOfRange(points, i + 2, points.length - 1);
            incline = gradient + computerIncline(newPoints);
        } else {

        }

    }
}
