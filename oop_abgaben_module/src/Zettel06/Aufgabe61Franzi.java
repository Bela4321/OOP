package Zettel06;

public class Aufgabe61Franzi {
    //6.1 a)
    static double seriesCircuit (double rOne, double rTwo) {
        double circuit = rOne + rTwo;
        return circuit;
    }

    //6.1 b)
    static double parallelCircuit (double rOne, double rTwo) {
        double circuit = (rOne * rTwo) / (rOne + rTwo);
        return circuit;
    }

    //6.1 c)
    static void test () {
        double [] circuit = {60, 40, 50, 50, 70, 80};
        double circuitOne = parallelCircuit(circuit[0],circuit[1]);
        double circuitTwo = seriesCircuit(circuitOne, circuit[2]);
        double circuitThree = seriesCircuit(circuit[3], circuit[4]);
        double circuitFour = parallelCircuit(circuitThree, circuit[5]);
        double circuitResult = parallelCircuit(circuitTwo, circuitFour);
        System.out.println(circuitResult + " Ohm ist der Widerstand des Schaltkreises.");
    }
}
