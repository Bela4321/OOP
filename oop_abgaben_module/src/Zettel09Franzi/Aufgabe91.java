package Zettel09Franzi;

public class Aufgabe91 {
    public static boolean isReverse(String a, String b){
        if (b.length() != a.length()) {
            return false;
        } else {
            for (int i = 0; i<b.length(); i++){
                if (b.charAt(i) != a.charAt(b.length()-i-1)){
                    return false;
                }
            }
            return true;
        }
    }
}
