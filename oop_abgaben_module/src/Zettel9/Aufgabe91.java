package Zettel9;

public class Aufgabe91 {

    public static boolean isReverse(String a, String b) {
        if (a.length()!=b.length()) {
            return false;
        }
        for (int i = 0; i<a.length();i++){
            if (a.charAt(i)!=b.charAt(b.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
