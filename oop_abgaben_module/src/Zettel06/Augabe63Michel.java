package Zettel06;
// x_n ist immer die aktuelle Näherung
//k-te Wurzel aus a
//d ist Abbruchkriterium, wenn nächste Näherung keine Änderung > d hat. 
public class Augabe63Michel {
    static double krt(double a, double k, double d) {
        if (a < 0 || k < 0 || d <= 0) {
            System.out.println("only positive numbers please");
        }
        double x_n = a;
        return krtH(a, k, d, x_n);
    }

    static double krtH(double a, double k, double d, double x_n) {
        double x_n1 = 1 / k * ((k - 1) * x_n + a / Math.pow(x_n, k - 1));
        if (Math.abs(x_n - x_n1) < d) {
            return x_n1;
        } else {
            return krtH(a, k, d, x_n1);
        }
    }

    public static void main(String[] args) {
        krt(2,2,0.0001);
    }
}
