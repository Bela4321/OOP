package Zettel05;

import java.util.Arrays;

public class AufgabeFranzi {

    //1_a)
    static void testAll1() {
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

    //2_a)

static double distance (double [] gps) {
        int i = 0;
        double dist = 0;
        while (i < gps.length - 5){
            dist = dist + Math.sqrt(Math.pow((gps[i]-gps[i+3]), 2) + Math.pow((gps[i+1]-gps[i+4]), 2) + Math.pow((gps[i+2]-gps[i+5]), 2));
            i++;
        }
        return dist;
    }



// 2_b)

    static double velocity(double [] gps){
        double dist = distance(gps);
        double time = gps.length / 3;
        return dist / time;
    }


// 2_c)

    static double maxVelocity(double [] gps) {
        int i = 0;
        double maxSpeed = 0;
        while (i < gps.length - 5) {
            double [] singleGPS = {gps[i], gps[i+1], gps[i+2], gps[i+3], gps[i+4], gps[i+5]};
            if (maxSpeed < velocity(singleGPS)) {
                maxSpeed = velocity(singleGPS);
            }
            i = i + 3;
        }
        return maxSpeed;
    }

    //2_d) , funktioniert irgendwie nicht
    static double [] patrialGPS (double [] gps, double [] start, double [] end) {
        //Bela: Indices sind kein Array
        int startGPS=0;
        int endGPS=0;
        //Bela: new gps hier nich nicht initialisieren, wir wissen noch nicht wie lange das ist.
        //Bela null ist nicht 0, Außerdem ist wenn das ganze array, nicht die einträge null
        if (start == null || end == null ){
            return gps;
        }
        //Bela: es geht nicht um die Koordianten, sondern um die Indicees. Der vergleich kann auch erst gemacvht werden, wenn wir die indicees bestimmt haben.
        //if frage hätte ich andersherum gemacht, weil noch ein bisschen code kommt
        if(!(start.length == 3 && end.length == 3)) {
            return gps;
        }//Bela: da fehlt nen outer Loop, damit alle Koordinaten geckeckt wertden.
        for (int k =0;k<gps.length-3;k += 3) {
            //Bela: du musst generell überprüfen, ob alle drei Koordinaten (x,y,z) übereinstimmen
            int coverageCount = 0;
            for (int i = 0; i < 3; i++) {
                //da fehlt ne if abfrage, ob die Koordinaten übereinstimmen.
                if (start[i]==gps[k+i]) {
                    coverageCount +=1;
                }
            }
            if (coverageCount==3) {
                startGPS=k;
                //damit wir sobald wir das erste match haben, unser Indice nicht wieder überschrieben wird
                break;
            }
        }
        //das ganze nochmal für end
        for (int k =0;k<gps.length-3;k += 3) {
            //Bela: du musst generell überprüfen, ob alle drei Koordinaten (x,y,z) übereinstimmen
            int coverageCount = 0;
            for (int i = 0; i < 3; i++) {
                //da fehlt ne if abfrage, ob die Koordinaten übereinstimmen.
                if (end[i]==gps[k+i]) {
                    coverageCount +=1;
                }
            }
            if (coverageCount==3) {
                endGPS=k;
                //kein break, weil wir hier ja das letzte haben wollen
            }
        }
        //erstellen des neuen Arrays
        double[] newGPS = Arrays.copyOfRange(gps,startGPS,endGPS+3);
        return newGPS;
    }
    //2_e)
    static void testAll (){
        double [] testingGPS = {-20.0, 0.0,200.0, -18.5, -0.647,200.577, -16.85, -1.237,
                201.16, -15.035, -1.763, 201.739, -13.038, -2.219,
                202.299, -10.842, -2.599, 202.824, -8.426, -2.894,
                203.289, -5.769, -3.096, 203.667, -2.846, -3.195, 203.918,
                0.369, -3.182, 203.998, 3.861, -3.205, 203.85, 7.284,
                -3.176, 203.469, 10.638, -3.209, 202.868, 13.926, -3.175,
                202.06, 17.147, -3.209,201.059, 20, -3.174, 199.877};
        double distance = distance(testingGPS);
        double velocity = velocity(testingGPS);
        double maxVelocity = maxVelocity(testingGPS);
        double[] start = {-18.5, -0.647,200.577};
        double[] end = {10.638, -3.209, 202.868};
        double[] newRoute = patrialGPS(testingGPS,start,end);
        System.out.println( distance + "m is the Distance.");
        System.out.println( velocity + "m/s is the average velocity.");
        System.out.println( maxVelocity + "m/s is the maximum velocity.");
        for (double xyz:newRoute) {
            System.out.println(xyz);
        }

    }



    public static void main(String[] args){

        testAll();
        double [] a = {-20.0, 0.0, 200.0, -18.5,-0.647, 200.577, -16.85, -1.237, 201.16};
        distance(a);
        velocity(a);
        maxVelocity(a);
        testAll();
    }
}
