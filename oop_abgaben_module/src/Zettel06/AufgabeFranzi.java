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

    static int[] primesUpTo (int n) {
        if (n < 0) {
            return null;
        }
        int[] spaceForAll = new int[n - 1];
        for (int i = 2; i < n; i++) {
            for (int elem : spaceForAll) {
                if (i % elem != 0) {
                    spaceForAll[elem + 1] = i;
                }
            }
        }
        int counter = 0;
        for (int zeroes : spaceForAll) {
            if (zeroes == 0) {
                counter++;
            }
        }
        int[] primes = Arrays.copyOfRange(spaceForAll, 0, spaceForAll.length - counter);
        return primes;
    }
            /*
            for (int b = 2; b < Math.sqrt(n) + 2; b++) {
                if (i % b == 0) {
                    primes[i] = 0;
                }
                if (primes[i] == 0) {
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
        finalPrimes = Arrays.copyOfRange(primes, 0, counter - 1 );
        return finalPrimes;
                     */


    static void testOnehundret () {
        int[] primes = {2,
                3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
                61, 67, 71, 73, 79, 83, 89, 97};
        int[] test = primesUpTo(100);
        for (int i=0;i<primes.length;i++) {
            if (primes[i] != test[i]) {
                System.out.println("test failed");
            } else {
                System.out.println("+");
            }
        }
    }



    public static void main(String[] args){
        test();
        testOnehundret();
}
