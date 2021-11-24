package Zettel05;

import java.util.Arrays;

public class AufgabeFranzi {

    //1_a)
    static void testAll() {
        float [] numbers = { -4, 0, 2, 6, 10, 23};
        boolean ascending = true;
        if (getMinimum(numbers) == -4) {
            System.out.println(getMinimum(numbers) + " is the right minimum.");
        } if (getMinimum(numbers) != -4) {
            System.out.println("The right answer would have been -4. Your answer was: " + getMinimum(numbers));
        } if (getMaximum(numbers) == 23) {
            System.out.println(getMaximum(numbers) + " is the right maximum.");
        } if (getMaximum(numbers) != 23) {
            System.out.println("The right answer would have been 23. Your answer was: " + getMaximum(numbers));
        } if (calculateAverage(numbers) == (float) 37/2) {
            System.out.println(calculateAverage(numbers) + " is the right average.");
        } if (calculateAverage(numbers) != (float) 37/2) {
            System.out.println("The right answer would have been " + 37/6 + " Your answer was: " + calculateAverage(numbers));
        } if (isSorted(numbers, ascending) == true) {
            System.out.println("It's sorted ascending. Your guess was correct.");
        } if (isSorted(numbers, ascending) == false) {
            System.out.println("The right answer would have been ascending. Your answer was descending.");
        }
    }
    //1_b)
    static float getMinimum(float [] numbers) {
        float minimum = numbers[0];
        for (float elem : numbers) {
            if (elem < minimum) {
                minimum = elem;
            }
        }
        return minimum;
    }

    //1_c)
    static float getMaximum (float[] numbers) {
        float length = numbers.length;
        if (length == 1) {
            return numbers[0];
        }
        float[] otherNumbers = Arrays.copyOfRange(numbers, 1, numbers.length);
        if (numbers[0] > getMaximum(otherNumbers)) {
            return numbers[0];
        } else {
            return getMaximum(otherNumbers);
        }
    }

    //1_d)
    static float calculateAverage(float [] numbers) {
        int i = 0;
        float sum = 0.0f;
        while (i < numbers.length ) {
            sum = sum + numbers[i];
            i++;
        }
        return sum/ numbers.length;
    }
    //1_e)
    static boolean isSorted(float [] numbers, boolean ascending) {
        boolean result = true;
        if (ascending) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    result = false;
                }
            }
        } else {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    result = false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        testAll();
    }
}
