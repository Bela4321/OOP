package Zettel05;

public class michel05 {
}
package Zettel05;

        import java.util.Arrays;

public class Aufgabe5_1 {
    public Aufgabe5_1() {
    }
    //a)
    void testAll () {
        public static void main(String[] args){
            System.out.println(getMinimum(2.0f,4.0f,6.0f));
            System.out.println(getMaximum(2.0f,4.0f,6.0f));
            System.out.println(calculateAverage(2.0f,4.0f,6.0f));
            System.out.println(isSorted(2.0f,4.0f,6.0f));
        }
    }

    //b): Minimum der Zahlen übergeben
    public static float getMinimum (float[] numbers) {
        numbers = new float[]{3.4f,4.5f,5.6f,6.7f};
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
    public static float getMaximum (float[] numbers) {
        numbers = new float[]{3.4f,4.5f,5.6f,6.7f};
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
    float calculateAverage (float[] numbers) {
        numbers = new float[]{3.4f,4.5f,5.6f,6.7f};
        float sum;
        for (int i = 0; i < numbers.length; i++){
            sum += sum + numbers[i];
            return "This is the sum of all array elements: " + sum;
        }
        return "This is the average of all array elements: " + sum/numbers.length;
    }

}

    //e) Überprüfen ob die Zahlen aufsteigend oder absteigend georndet sind
    boolean descending (){
        for(float element: float[] numbers) {
            int i = 0;
            numbers[i] > numbers[i+1];
            i++
        }
        return true;
    }
    boolean ascending (){
        for(float element: float[] numbers) {
            int i = 0;
            numbers[i] < numbers[i+1];
            i++;
        }
        return true;
    }
    boolean isSorted(float[] numbers, boolean ascending) {
        return boolean ascending;
    }


    // 5.2)
    /* Array mit drei Einträgen pro Sekunde als Koordinaten in Metern.
     */

    double[] gps; //= {x1,y1,z1,x2,y2,z2,...};

    double distance(double[] gps) {
        Math.sqrt(Math.pow(gps[gps.length - 2] - gps[0]) + Math.pow(gps[(gps.length) - 1] - gps[1]) + Math.pow(gps[gps.length] - gps[2]));
    }

    double velocity (double[] gps) {
        Math.sqrt(Math.pow(gps[gps.length - 2] - gps[0]) + Math.pow(gps[(gps.length) - 1] - gps[1]) + Math.pow(gps[gps.length] - gps[2]))/ gps.length;
    }

    /*
    max wird auf velocity gesetzt. (in m/s)
    Dann wird in der for-Schleife die Geschwindigkeit zwischen jeder gelaufenen Sekunde angeschaut. Einheit ist dann schon m/s.
    Wenn diese größer max, dann ist das die neue maxVelocity.
     */
    double maxVelocity (double[] gps) {
        for (int i = 0; i < gps.length; i = i + 3) {
            double max = Math.sqrt(Math.pow(gps[gps.length - 2] - gps[0]) + Math.pow(gps[(gps.length) - 1] - gps[1]) + Math.pow(gps[gps.length] - gps[2])) / gps.length;
            double newMax = Math.sqrt(Math.pow(gps[i + 3] - gps[i]) + Math.pow(gps[(i + 4] - gps[i + 1]) + Math.pow(gps[i + 5] - gps[i + 2]));
            if (newMax > max) {
                max = newMax;
            }
            return max;
        }
//return ___
    }

    double[] partialGPS(double[] gps, double[] start, double[] end) {

    }
