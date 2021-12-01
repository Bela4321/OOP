package Zettel06;

import java.util.Arrays;

public class Aufgabe62Michel {

    static int[] primesUpTo(int n) {
        int[] arrPrimeZ = new int[n - 2];
        if (n < 0) {
            System.out.println("only positiv numbers allowed for this methode");
            return null;
//array erstellen, der mit den Elementen 2 bis n gefüllt ist.
            for (int i = 2; i <= n; i++) {
                arrPrimeZ[i - 2] = i;
            }
            for (int i1 = arrPrimeZ[0] * 2; i1 % arrPrimeZ[0] == 0 && i1 <= (Math.sqrt(n) + 2); i1++)
                arrPrimeZ[i1] = 0;
        }
        int countPrime = 0;
        for (int j : arrPrimeZ) {
            if (j != 0) {
                countPrime++;
            }
            int[] arrPrime = new int[countPrime];
            countPrime = 0;
            for (int j1 : arrPrimeZ) {
                if (j1 != 0) {
                    arrPrime[countPrime] = j1;
                    countPrime++;
                }
            }
            return arrPrime;
        }


        return null;
        }

    }
    public static void main (String[]args){
}