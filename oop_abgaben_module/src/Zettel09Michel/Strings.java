package Zettel09Michel;

import java.util.Locale;

public class Strings {


    public static boolean isReverse(String a, String b) {
        a.toUpperCase();
        b.toUpperCase();
        char[] arrA = a.toCharArray();
        String newA = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            newA = newA + arrA[i];
        }
        if (newA.equals(b)) {
            return true;
        }
        else return false;
    }


    static String replace(String source, String search, String replace) {
        String newWord = "";
            if (source.indexOf(search) >= 0) {
                int startSearch = source.indexOf(search);
                int endSearch = source.indexOf(search) + search.length();
                newWord = source.substring(0, startSearch) + replace + source.substring(endSearch, source.length());
            }
            else {
                newWord = source;
                System.out.println(source + " stays the same.");
                return newWord;
            }
            return newWord;
    }


    public static void main(String[] args) {

    }
}
