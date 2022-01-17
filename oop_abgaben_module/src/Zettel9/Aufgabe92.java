package Zettel9;

public class Aufgabe92 {

    public static String replace(String source, String search, String replace) {
        while (source.indexOf(search)!= -1) {
            int insertStart = source.indexOf(search);
            source= source.substring(0,insertStart)+ replace+ source.substring(insertStart+search.length());
        }
        return source;
    }
}
