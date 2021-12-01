package Zettel06;

public class Aufgabe6_1 {
   static double seriesCircuit(double rOne, double rTwo) {
       return rOne+rTwo;
   }
   static double parallelCircuit(double rOne, double rTwo) {
       return(rOne*rTwo/(rOne+rTwo));
   }
   public static void main(String[] args) {
        double r1=60;
        double r2=40;
        //hallo Michel
        double r3=50;
        double r4=50;
        //moin moin
        double r5=70;
        double r6=80;
        System.out.println(parallelCircuit(seriesCircuit(parallelCircuit(r1,r2),r3),parallelCircuit(seriesCircuit(r4,r5),r6)));
   }
}
