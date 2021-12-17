package Präsenzzettel;

public class Zettel8 {
    public static double cubicRoot(double number, double delta){
         return cubicRootHelp(number, delta, number);
         }

        private static double cubicRootHelp(double number, double delta, double x_n){
         double x_nPlusOne = 1.0 / 3.0 * (2 * x_n + number /Math.pow(x_n, 2));
         if(Math.abs(x_nPlusOne - x_n) < delta){
           return x_nPlusOne;
           }
        return cubicRootHelp(number, delta, x_nPlusOne);
    }

}
