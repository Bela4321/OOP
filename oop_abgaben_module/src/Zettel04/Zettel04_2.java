package Zettel04;

public class Zettel04_2 {
    static String toBinary(int n) {
        if (n<0) {
            System.out.println("toBinary only takes positive numbers :(");
            return "";
        }
        String result = "";
        while (true) {
            result = n % 2 + result;
            n /=2;
            if (n==0) {
                return result;
            }
        }
    }
    static String toOctal(int n) {
        if (n<0) {
            System.out.println("toOctal only takes positive numbers :(");
            return "";
        }
        String result = "";
        while (true) {
            result = n % 8 + result;
            n /=8;
            if (n==0) {
                return result;
            }
        }
    }
    static String toTwosComplement(int n) {
        if (n < -128 || n > 127) {
            System.out.println("Number out of bounds [-128,127]");
            return "";
        }
        if (n >= 0) {
            String twoCompBinary = toBinary(n);
            while (twoCompBinary.length() < 8) {
                twoCompBinary = "0" + twoCompBinary;
            }
            return twoCompBinary;
        } else {
            String twoCompBinary = toBinary(256+n);
            return twoCompBinary;
        }
    }
    static void myTest() {
        String[] binaryTest = {"0", "101","1010","","11001001"};
        int[] binaryTestingInts ={0, 5, 10, -1, 201};
        int i = 0;
        while (i<binaryTest.length) {
            if (toBinary(binaryTestingInts[i]).equals(binaryTest[i])) {
                System.out.println("Binary test "+(i+1)+" passed");
            } else {
                System.out.println("Binary test "+(i+1)+" failed");
                System.out.println("Expected: " + binaryTest);
                System.out.println("Actual: " + toBinary(binaryTestingInts[i]));
            }
            i++;
        }
        String[] octalTest = {"0", "11","30","","311"};
        int[] octalTestingInts ={0, 9, 24, -5, 201};
        i = 0;
        while (i<octalTest.length) {
            if (toOctal(octalTestingInts[i]).equals(octalTest[i])) {
                System.out.println("Octal test "+(i+1)+" passed");
            } else {
                System.out.println("Octal test "+(i+1)+" failed");
                System.out.println("Expected: " + octalTest);
                System.out.println("Actual: " + toOctal(octalTestingInts[i]));
            }
            i++;
        }
        String[] twoCompTest = {"00000000", "11111110","00001011","10001000", ""};
        int[] twoCompTestingInts ={0, -2, 11, -120, 130};
        i = 0;
        while (i<twoCompTest.length) {
            if (toTwosComplement(twoCompTestingInts[i]).equals(twoCompTest[i])) {
                System.out.println("Two Complement test "+(i+1)+" passed");
            } else {
                System.out.println("Two Complement test "+(i+1)+" failed");
                System.out.println("Expected: " + twoCompTest);
                System.out.println("Actual: " + toTwosComplement(twoCompTestingInts[i]));
            }
            i++;
        }
    }
    public static void main(String[] args) {
        myTest();
    }
}
