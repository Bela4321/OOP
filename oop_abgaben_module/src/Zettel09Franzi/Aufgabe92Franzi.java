package Zettel09Franzi;

public class Aufgabe92Franzi {
    public static String replace(String source, String search, String replace) {
        if (source.length() < search.length()) {
            return source;
        }
        if (source.indexOf(search) == -1) {
            return source;
        }
        //for (int i = 0; i < source.length();i++){
        int beginning = source.indexOf(search);
        int end = beginning + search.length();
        String firstPart = source.substring(0, beginning);
        String secondPart = source.substring(end);
        String newSource = firstPart + replace + secondPart;
        return replace(newSource, search, replace);

    }


    public static void main(String[] args) {
       System.out.println( replace("Halloinchbines", "in", "geht"));

    }
}
