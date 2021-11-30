package Zettel06;

import java.util.Arrays;

public class AufgabeFranzi {
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

    //6.2 a)

    int[] primesUpTo (int n) {
        if (n < 0){
            return null;
        }
        int [] primes = new int[n-1];
        for (int i = 2; i < n; i++) {//n ist inklusiv dabei
            for (int b = 2; b < Math.sqrt(n) + 2; b++) {
                if (i % b == 0) {//und i != b
                    primes[i] = 0;
                }
                if (primes[i] == 0) {//all primes[i] sind standartdmäßig 0
                    primes[i] = primes[i + 1];
                }
            }
        }
        int counter = 0;
        for (int entry:primes) {
            if (entry != 0) {
                counter++;
            }
        }
        int[] finalPrimes = new int[counter];
        finalPrimes = Arrays.copyOfRange(primes, 0, counter - 1 );//die Primzahlen in primes sind nicht hintereinander, da sind immer 0-en dazwischen; endIndex ist exklusiv
        return finalPrimes;
    }


    public static void main(String[] args){
        test();
    }
}
