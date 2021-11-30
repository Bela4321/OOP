package Zettel05;

import java.util.Arrays;

public class praesenz05_michel {
    static double[] computeIncline(double[] points) {
        double[] arrIncline = new double[points.length];
        int a = points.length - 2;
        for (int i = 0; i <= a; i = i + 2) {
            double incline = (points[i + 3] - points[i + 1]) / (points[i + 2] - points[i]);
            arrIncline[i] = incline;
        }
        System.out.println(Arrays.toString(arrIncline));
        return arrIncline;
    }


    public static void main(String[] args) {
    double [] points = {0.0,1.0,2.0,3.0};
        computeIncline(points);
    }
}
