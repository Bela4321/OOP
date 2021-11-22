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
        double time = gps.length/3;
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
        int startIndex = 0;
        int endIndex = gps.length;
        for (int i=0;i<gps.length-3;i+=3) {
            if (gps[i]==start[0]&&gps[i+1]==start[1]&&gps[i+2]==start[2]) {
                startIndex = i;
                break;
            }
            if (i==gps.length-3) {
                return gps;
            }
        }
        for (int i=gps.length-3;i>=0;i-=3) {
            if (gps[i]==end[0]&&gps[i+1]==end[1]&&gps[i+2]==end[2]) {
                endIndex = i;
                break;
            }
            if (i==0) {
                return gps;
            }
        }
        double[] slice = Arrays.copyOfRange(gps,startIndex,endIndex);
        return slice;
    }
}
