package Zettel05;

import java.util.Arrays;

public class Aufgabe5_1 {
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
    public static void main(String[] args) {
        float[] test = {1.4f,3.6f,4.3f,.9f,3.9f};
        getMinimum(test);
    }
}
