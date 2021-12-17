package Zettel08;



public class HexaDecimal implements Number{
    private String ValueInHex;

    public String toString() {
        return ValueInHex +" (="+toIntValue()+")";
    }

    HexaDecimal(String hexzahl) {
        ValueInHex=hexzahl;
    }

    public int toIntValue() {
        int result =0;
        char[] arr = ValueInHex.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<64) {
                result += (arr[i]-48) * Math.pow(16, arr.length-i-1);
            } else {
                result += (arr[i]-55) * Math.pow(16, arr.length-i-1);
            }
        }
        return  result;
    }

    public void fromIntValue(int value) {
        value = Math.abs(value);
        if (value==0) {
            this.ValueInHex="0";
            return;
        }
        String result = "";
        while (value!=0) {
            int character = value%16;
            if (character<=9) {
                result = character+result;
            } else {
                result = (char) (55+character)+result;

            }
            value/=16;
        }
        this.ValueInHex = result;
    }

    public static void main(String[] args) {
        HexaDecimal num1 = new HexaDecimal("AF21");
        HexaDecimal num2 = new HexaDecimal("5B2");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("\nnum1 = 100(base10) \nnum2 = 64(base10) ");
        num1.fromIntValue(100);
        num2.fromIntValue(64);
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("\nnum1 = num1 + num1 \nnum2 = num2 + num1 ");
        num1.add(num1);
        num2.add(num1);
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("\nnum1 = num1 * 10\nnum2 = num2 * num1");
        num1.multiply(new HexaDecimal("A"));
        num2.multiply(num1);
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("\nnum1 = num1 - 150\nnum2 = num2 - num1");
        num1.substract(new HexaDecimal("96"));
        num2.substract(num1);
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("\nnum1 = num1 / 50\nnum2 = num2 / 25");
        num1.divide(new HexaDecimal("32"));
        num2.divide(new HexaDecimal("19"));
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}
