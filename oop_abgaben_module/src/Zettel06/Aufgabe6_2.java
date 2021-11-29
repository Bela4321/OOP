package Zettel06;

public class Aufgabe6_2 {
    static int[] primesUpTo(int n) {
        if (n<0) {
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
        for (int i=0;i< table.length;i++) {
            if (table[i] !=-1) {
                result[counter] = table[i];
                counter++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        for (int n : primesUpTo(100)) {
            System.out.println(n);
        }
    }
}
