package Zettel06;

public class Aufgabe6_2 {
    static int[] primesUpTo(int n) {
        if (n<0) {
            System.out.println("no not positive numbers pls :(");
            return null;
        }
        //create table
        int [] table = new int[n-1];
        for (int i=2;i<=n;i++) {
            table[i-2] = i;
        }
        //ckeck every divisor <sqrt(n)+2
        for (int div=2;div<Math.sqrt(n)+2;div++) {
            //for every number in table
            for (int i=0;i<table.length;i++) {
                if (table[i] % div == 0 &&table[i] != div ) {
                    table[i] = -1;
                }
            }
        }
        //count number of primes
        int counter = 0;
        for (int entry:table) {
            if (entry != -1) {
                counter++;
            }
        }
        int[] result = new int[counter];
        counter = 0;
        for (int j : table) {
            if (j != -1) {
                result[counter] = j;
                counter++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //test
        int[] primes = {2,
                3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
                61, 67, 71, 73, 79, 83, 89, 97
        };
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
