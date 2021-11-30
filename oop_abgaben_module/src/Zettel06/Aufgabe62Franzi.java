package Zettel06;

public class Aufgabe62Franzi {

    //6.2 a)

    static int[] primesUpTo (int n){
        if (n < 2){
            System.out.println("There are no prime numbers smaller than two.");
            return null;
        }
        int[] allNumbers = new int [n-1];
        for (int i = 2; i <= n; i++) {
            allNumbers[i-2] = i;
        }

        for (int div = 2; div < Math.sqrt(n) + 2; div++) {
            for (int a = 0; a < allNumbers.length; a++) {
                if (allNumbers[a] % div == 0 && allNumbers[a] != div) {
                    allNumbers[a] = -1;
                }
            }
        }
        int counter = 0;
        for (int primes : allNumbers) {
            if (primes != -1) {
                counter++;
            }
        }

        int [] primeNumbers = new int[counter];
        counter = 0;
        for(int elem : allNumbers){
            if (elem != -1){
                primeNumbers [counter] = elem;
                counter++;
            }
        }
        return primeNumbers;
    }


               /*
        Überlegungen zu 6_2
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
                     */
    //6_2 b)
   static void testOnehundret () {
       int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
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
}
