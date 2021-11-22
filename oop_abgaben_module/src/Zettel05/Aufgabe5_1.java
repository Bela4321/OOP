package Zettel05;

import java.util.Arrays;

public class Aufgabe5_1 {
    static void testAll() {
        boolean test_result;
        //getMinimum test

    }

    static float getMinimum(float[] numbers) {
        if (numbers.length==1) {
            return numbers[0];
        }
        float[] restOfNumbers = Arrays.copyOfRange(numbers,1,numbers.length);
        if (numbers[0]<getMinimum(restOfNumbers)) {
            return numbers[0];
        } else {
            return getMinimum(restOfNumbers);
        }
    }

    static float getMaximun(float[] numbers) {
        float maximum = numbers[0];
        for (float number:numbers) {
            if (number> maximum) {
                maximum= number;
            }
        }
        return maximum;
    }

    static float calculateAverage(float[] numbers) {
        float sum = 0;
        int i = 0;
        while (i<numbers.length) {
            sum += numbers[i];
            i++;
        }
        return (sum/numbers.length);
    }

    static boolean isSorted(float[] numbers, boolean ascending) {
        if (ascending) {
            for (int i = 0;i<numbers.length-1;i++) {
                if (numbers[i]>numbers[i+1]) {
                    return false;
                }
            }
            return true;
        } else {
            for (int i = 0;i<numbers.length-1;i++) {
                if (numbers[i]<numbers[i+1]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        float[] test = {1.4f,3.6f,4.3f,4.9f};
        System.out.println(getMinimum(test));
        System.out.println(getMaximun(test));
        System.out.println(calculateAverage(test));
        System.out.println(isSorted(test,true));
    }
}
