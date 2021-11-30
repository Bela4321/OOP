package Zettel06;

public class Aufgabe63Franzi {

    //a)
    static double krT (double a, double k, double d){
        if ( a < 0 || k < 0 || d < 0) {
            return 0;
        }
        double x_n = a;
        return krtH(a,k,d,x_n);
    }

    //b)
    static double krtH (double a, double k, double d, double x_n) {
        double x_n1 = (1/k)*((k-1)* x_n + a/Math.pow(x_n,k-1));
        if (x_n - x_n1 < d){
            return x_n1;
        } else {
            return krtH(a ,k , d, x_n1);
        }
    }

    //c)
    static void test () {
        System.out.println(krT(50, 0.7, 0.006) + " is the approximation for sqrt 0.7 of 50.");
        System.out.println(krT(0.5, 10, 6) + " is the approximation for sqrt 10 of 0.5.");
        System.out.println(krT(20, 30, 0.7) + " is the approximation for sqrt 30 of 20.");
    }
}
