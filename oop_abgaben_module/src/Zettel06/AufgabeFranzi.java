package Zettel06;

import java.util.Arrays;

public class AufgabeFranzi {
    //6.1 a)
    static double seriesCircuit (double rOne, double rTwo) {
        double circuit = rOne + rTwo;
        return circuit;
    }

    //6.1 b)
    static double  parallelCircuit (double rOne, double rTwo) {
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
        System.out.println(circuitResult + "Ohm ist der Widerstand des Schaltkreises.");
    }

    //6.2 a)

    int[] primesUpTo (int n) {
        if (n < 0){
            return null;
        }
        int [] primes = new int[n-1];
        for (int i = 0; i < n; i++) {
            primes[i] = i;
            if (primes[i] == 0) {
                primes = Arrays.copyOfRange(primes, i, n);
            } if (primes [i] == 1) {
                primes = Arrays.copyOfRange(primes, i, n);
            } if
        }
    }

}

    public static void main(String[] args){
        test();
}
