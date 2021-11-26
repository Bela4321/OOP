package Zettel05;

import java.util.Arrays;

public class Aufgabe5_2 {
    static double distance(double[] gps) {
        double distance = 0;
        for (int i=0;i<gps.length-3;i+=3) {
            distance += Math.sqrt(Math.pow((gps[i]-gps[i+3]),2)+Math.pow((gps[i+1]-gps[i+4]),2)+Math.pow((gps[i+2]-gps[i+5]),2));
        }
        return distance;
    }

    static double velocity(double[] gps) {
        double time = gps.length/3.-1;
        return distance(gps)/time;
    }

    static double maxVelocity(double[] gps) {
        double maxV = 0;
        for (int i=0;i<gps.length-3;i+=3) {
            double VAtI =Math.sqrt(Math.pow((gps[i]-gps[i+3]),2)+Math.pow((gps[i+1]-gps[i+4]),2)+Math.pow((gps[i+2]-gps[i+5]),2));
            if (maxV < VAtI) {
                maxV = VAtI;
            }
        }
        return maxV;
    }

    static double[] partialGPS(double[] gps, double[] start, double[] end) {
        if (start==null||end==null) {
            return gps;
        }
        if (!(start.length==3&&end.length==3)) {
            return gps;
        }
        int startIndex = 0;
        for (int i=0;i<=gps.length-3;i+=3) {
            if (gps[i]==start[0]&&gps[i+1]==start[1]&&gps[i+2]==start[2]) {
                startIndex = i;
                break;
            }
            if (i==gps.length-3) {
                return gps;
            }
        }
        int endIndex = gps.length;
        for (int i=gps.length-3;i>=0;i-=3) {
            if (gps[i]==end[0]&&gps[i+1]==end[1]&&gps[i+2]==end[2]) {
                endIndex = i+3;
                break;
            }
            if (i==0) {
                return gps;
            }
        }
        if (startIndex>endIndex) {
            return gps;
        }
        return Arrays.copyOfRange(gps,startIndex,endIndex);
    }

    public static void main(String[] args) {
        double[] testingData = {-20.0, 0.0,200.0, -18.5, -0.647,200.577, -16.85, -1.237,
                201.16, -15.035, -1.763, 201.739, -13.038, -2.219,
                202.299, -10.842, -2.599, 202.824, -8.426, -2.894,
                203.289, -5.769, -3.096, 203.667, -2.846, -3.195, 203.918,
                0.369, -3.182, 203.998, 3.861, -3.205, 203.85, 7.284,
                 -3.176, 203.469, 10.638, -3.209, 202.868, 13.926, -3.175,
                202.06, 17.147, -3.209,201.059, 20, -3.174, 199.877};
        System.out.println(distance(testingData));
        System.out.println(velocity(testingData));
        System.out.println(maxVelocity(testingData));
        double[] start ={-10.842, -2.599, 202.824};
        double[] end = {3.861, -3.205, 203.85};

        double[] partialGPSTest= partialGPS(testingData,start, end);
        for (double GPS :partialGPSTest) {
            System.out.println(GPS);
        }
        System.out.println(partialGPSTest.length);
        System.out.println(testingData.length);
    }
}
