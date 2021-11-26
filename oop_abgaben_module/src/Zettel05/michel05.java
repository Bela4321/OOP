package Zettel05;

public class michel05 {

// noch einmal richtig rekursiv schreiben.
//wichitg: es muss eine Eingabe mit unterschiedlich vielen Elementen möglich ist. Wird bei Funktionsaufruf eingegeben!!
    //b): Minimum der Zahlen übergeben
    public static float getMinimum(float[] numbers) {
        numbers = new float[]{3.4f, 4.5f, 5.6f, 6.7f};
        if (numbers.length == 1) {
            return numbers[0];
        } else if (numbers[0] < numbers[1] && numbers[0] < numbers[2] && numbers[0] < numbers[3]) {
            return numbers[0];
        } else if (numbers[1] < numbers[0] && numbers[1] < numbers[2] && numbers[1] < numbers[3]) {
            return numbers[1];
        } else if (numbers[2] < numbers[0] && numbers[2] < numbers[1] && numbers[2] < numbers[3]) {
            return numbers[2];
        } else if (numbers[3] < numbers[0] && numbers[3] < numbers[1] && numbers[3] < numbers[2]) {
            return numbers[3];
        } else {
            return 0.0f;
        }
    }

    //c): Maximum der Zahlen übergeben
    public static float getMaximum(float[] numbers) {
        numbers = new float[]{3.4f, 4.5f, 5.6f, 6.7f};
        int i = 0;
        float maxValue = numbers[0];
        while (i < numbers.length) {
            if (maxValue < numbers[i]) {
                maxValue = numbers[i];
            }
            i++;
        }
        return maxValue;
    }

    //d): Durchschnitt der Zahlen übergeben
    float calculateAverage(float[] numbers) {
        numbers = new float[]{3.4f, 4.5f, 5.6f, 6.7f};
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += sum + numbers[i];
            System.out.println("This is the average of all array elements: ");
        }
        return sum / numbers.length;
    }

    //e) Überprüfen ob die Zahlen aufsteigend oder absteigend georndet sind

    static boolean isSorted(float[] numbers, boolean ascending) {
        float previous = numbers[0];
        for (float element : numbers) {
            if (previous > element) {
                return false;
            }
            previous = element;
        }
        return true;
    }

    //a)


    public static void main(String[] args) {
        float[] arr = {0.3f, 0.4f, 0.5f};
        isSorted(arr, true);
    }
}


