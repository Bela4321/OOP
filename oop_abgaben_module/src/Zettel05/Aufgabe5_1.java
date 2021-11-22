package Zettel05;

import java.util.Arrays;

public class Aufgabe5_1 {
    static void testAll() {
        boolean test_result;

        //getMinimum test
        float[] testSubject1={1.4f,3.6f,4.3f,4.91f};
        float expectedResult= 1.4f;
        if (Math.abs(expectedResult-getMinimum(testSubject1))<0.000001) {
            System.out.println("getMinimum test 1 passed");
        } else {
            System.out.println("getMinimum test 1 failed");
            System.out.println("Expected: "+expectedResult+"  Actual: "+getMinimum(testSubject1));
        }
        float[] testSubject2 = {10.f,4.6f,2.1f,1.112f};
        expectedResult= 1.112f;
        if (Math.abs(expectedResult-getMinimum(testSubject2))<0.000001) {
            System.out.println("getMinimum test 2 passed");
        } else {
            System.out.println("getMinimum test 2 failed");
            System.out.println("Expected: "+expectedResult+"  Actual: "+getMinimum(testSubject2));
        }

        //getMaximum test
        float[] testSubject3={1.4f,3.6f,4.3f,4.91f};
        expectedResult= 4.91f;
        if (Math.abs(expectedResult-getMaximun(testSubject3))<0.000001) {
            System.out.println("getMaximum test 1 passed");
        } else {
            System.out.println("getMaximum test 1 failed");
            System.out.println("Expected: "+expectedResult+"  Actual: "+getMaximun(testSubject3));
        }
        float[] testSubject4 = {10.f,4.6f,2.1f,1.112f};
        expectedResult= 10.f;
        if (Math.abs(expectedResult-getMaximun(testSubject4))<0.000001) {
            System.out.println("getMaximum test 2 passed");
        } else {
            System.out.println("getMaximum test 2 failed");
            System.out.println("Expected: "+expectedResult+"  Actual: "+getMaximun(testSubject4));
        }

        //calculate Average test
        float[] testSubject5={1.4f,3.6f,4.3f,4.91f};
        expectedResult= 3.5525f;
        if (Math.abs(expectedResult-calculateAverage(testSubject5))<0.000001) {
            System.out.println("calculateAverage test 1 passed");
        } else {
            System.out.println("calculateAverage test 1 failed");
            System.out.println("Expected: "+expectedResult+"  Actual: "+calculateAverage(testSubject5));
        }
        float[] testSubject6 = {10.f,4.6f,2.1f,1.112f};
        expectedResult= 4.453f;
        if (Math.abs(expectedResult-calculateAverage(testSubject6))<0.000001) {
            System.out.println("calculateAverage test 2 passed");
        } else {
            System.out.println("calculateAverage test 2 failed");
            System.out.println("Expected: "+expectedResult+"  Actual: "+calculateAverage(testSubject6));
        }

        //isSorted test
        float[] testSubject7={1.4f,3.6f,4.3f,4.91f};
        boolean ascendingTest = true;
        boolean expectedResultbool= true;
        if (!(isSorted(testSubject7,ascendingTest) ^ expectedResultbool)) {
            System.out.println("isSorted test 1 passed");
        } else {
            System.out.println("isSorted test 1 failed");
            System.out.println("Expected: "+expectedResultbool+"  Actual: "+isSorted(testSubject7,ascendingTest));
        }
        float[] testSubject8 = {10.f,4.6f,2.1f,1.112f};
        ascendingTest = false;
        expectedResultbool= true;
        if (isSorted(testSubject8, ascendingTest)==expectedResultbool) {
            System.out.println("isSorted test 2 passed");
        } else {
            System.out.println("isSorted test 2 failed");
            System.out.println("Expected: "+expectedResultbool+"  Actual: "+isSorted(testSubject8,ascendingTest));
        }
        float[] testSubject9 = {2.5f,10.f,3.14534f,2.1f,1.112f};
        ascendingTest = false;
        expectedResultbool= false;
        if (isSorted(testSubject9, ascendingTest)==expectedResultbool) {
            System.out.println("isSorted test 3 passed");
        } else {
            System.out.println("isSorted test 3 failed");
            System.out.println("Expected: "+expectedResultbool+"  Actual: "+isSorted(testSubject9,ascendingTest));
        }
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
        testAll();

    }
}
