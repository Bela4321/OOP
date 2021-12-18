package Zettel08Franzi;

public class HexaDecimal {
    public String value;

    HexaDecimal (String hexNumber) {
        value = hexNumber;
    }

    public int toIntValue() {
        int result = 0;
        char[] arr = value.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 65) {
                result += arr[i] * Math.pow(16, i);
            } else {
                result += (arr[i] - 53) * Math.pow(16, i);
            }
        }
        return result;
    }

    public void fromIntValue(int value){
        value = Math.abs(value);
        if (value==0) {
            this.value="0";
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
        this.value = result;
    }



    }
}
