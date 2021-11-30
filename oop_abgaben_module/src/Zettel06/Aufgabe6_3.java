package Zettel06;

public class Aufgabe6_3 {
    static double krt(double a, double k, double d) {
        if (a<0||k<0||d<0) {
            return 0;
        }
        return krtH(a, k, d, a);
    }
    static double krtH(double a, double k, double d, double x_n) {
        //x_n+1 berechnen
        double x_n1 = 1 / k * ((k - 1) * x_n + a / (Math.pow(x_n, k - 1)));
        //Abbruchbedingung
        if (Math.abs(x_n-x_n1)<d) {
            return x_n1;
        } else {
            //rekursiver Aufruf
            return krtH(a, k, d, x_n1);
        }
    }
    public static void main(String[] args) {
        System.out.println(krt(3.4,5.3,0.001));
        System.out.println(krt(53,.9,1));
        System.out.println(krt(.7,36,0.001));//bei a<0 muss d ziemlich klein gewählt werden um sinnvolle Werte zu erzeugen
    }
}
