package Zettel08;



public class HexaDecimal implements Number{
    private String ValueInHex;

    public String toString() {
        return ValueInHex;
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
        System.out.println(num1.toIntValue());
        System.out.println(num2.toIntValue());
        num1.fromIntValue(100);
        System.out.println("num1: "+num1);
    }
}
