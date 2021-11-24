package Zettel05;

public class AufgabeFranzi {
    static float getMaximum(float [] numbers) {
        float maximum = numbers[0];
        for (float elem : numbers) {
            if (elem < maximum) {
                maximum = elem;
            }
        }
        return maximum;
    }


    static float getMinimum(float [] numbers) {
        float minimum = numbers[0];
        for (float elem : numbers) {
            if (elem < minimum) {
                minimum = elem;
            }
        }
        return minimum;
    }




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
        float [] testingNumbers = {4.0f, 10.0f, 3.0f, 1.0f, 30.0f};
        System.out.println(getMaximum( testingNumbers));
    }
}
