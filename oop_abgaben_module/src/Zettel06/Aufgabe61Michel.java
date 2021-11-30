package Zettel06;

public class Aufgabe61Michel {

    static double seriesCircuit(double rOne, double rTwo) {
        double rTotal = rOne + rTwo;
        return rTotal;
    }

    static double parallelCircuit(double rOne, double rTwo) {
        double rTotal = (rOne * rTwo) / (rOne + rTwo);
        return rTotal;
    }

    public static void main(String[] args) {
            double a = parallelCircuit(seriesCircuit(parallelCircuit(60, 40), 50), parallelCircuit(seriesCircuit(50, 70), 80));
            System.out.println("Gesamtwiderstand = " + a);
            }
}