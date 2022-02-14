package Zettel12Franzi;

import Zettel12.Lambda;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class LamdbaTest {
    @Test
    void removeIf() {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 33, 22, 57, 5, 8, 13, 68, 45, 10));
        ArrayList<String> list2 = new ArrayList<>(List.of("Hi", "Wie", "Geht", "es", "euch", "so", "das ist ein", "cooler", "test", "yeaahh"));
        //ArrayList<Objects> list3 = new ArrayList(List.of(1, "Hi", 'c', 57, "gut", 8, "und", 'd', "so", 10));

        Predicate<Integer> filter1 = a -> (a % 2 == 0);
        Predicate<String> filter2 = b -> (b == "Hi");
        //Predicate<Objects> filter3 = b -> (b.equals("Hi"));

        Lamdba.removeIf(list1, filter1);
        Lamdba.removeIf(list2, filter2);
        //Lamdba.removeIf(list3, filter3);

        List<Integer> expectedList1 = Arrays.asList(1, 33, 57, 5, 13, 45);
        List<String> expectedList2 = Arrays.asList("Wie", "Geht", "es", "euch", "so", "das ist ein", "cooler", "test", "yeaahh");
        //List<Objects> expectedList3 = Arrays.asList(1, "Hi", 'c', 57, "gut", 8, "und", 'd', "so", 10);

        assertEquals(expectedList1,list1);
        assertEquals(expectedList2,list2);

    }

    @Test
    void sortBy(){
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 33, 22, 57, 5, 8, 13, 68, 45, 10));
        ArrayList<String> list2 = new ArrayList<>(List.of("Hi", "Wie", "Geht", "es", "euch", "so", "das ist ein", "cooler", "test", "yeaahh"));
        ArrayList<Objects> list3 = new ArrayList(List.of(1, "Hi", 'c', 57, "gut", 8, "und", 'd', "so", 10));

        Comparator <Integer> comparator1 = (c,d)-> (Math.abs(c)-Math.abs(d));
        Comparator <String> comparator2 = (e, f) -> (e.length() - f.length());
        //Comparator <Objects> comparator3 = (g,h) -> g.toString()  h.toString();

        Lamdba.sortBy(list1,comparator1);
        Lamdba.sortBy(list2, comparator2);
        //Lamdba.sortBy(list3, comparator3);

        List <Integer> expectedList1 = Arrays.asList(1, 33, 22, 57, 5, 8, 13, 68, 45, 10);
        List <String> expectedList2 = Arrays.asList("Hi", "es", "so", "Wie", "Geht", "euch", "test", "cooler", "yeaahh", "das ist ein");

        assertEquals(expectedList1,list1);
        assertEquals(expectedList2,list2);

    }
    @Test
    void listToString(){
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 33, 22, 57, 5, 8, 13, 68, 45, 10));
        ArrayList<String> list2 = new ArrayList<>(List.of("Hi", "Wie", "Geht", "es", "euch", "so", "das ist ein", "cooler", "test", "yeaahh"));
        ArrayList<Objects> list3 = new ArrayList(List.of(1, "Hi", 'c', 57, "gut", 8, "und", 'd', "so", 10));

        String expected1 = "1\n33\n 22\n57\n5\n8\n13\n68\n45\n10";
        String expected2 = "Hi\nWie\nGeht\nes\neuch\nso\ndas\nist\nein\ncooler\ntest\nyeaahh";
        String expected3 = "1\nHi\nc\n57\ngut\n8\nund\nd\nso\n10";

        assertEquals(expected1, Lambda.listToString(list1));
        assertEquals(expected2, Lambda.listToString(list2));
        assertEquals(expected3, Lamdba.listToString(list3));

    }



//weiß nicht wie diese Comparator funktionieren und es hat irgendwie nicht wirklich funktioniert, weiß nicht genau ob das daran liegt
// wie ich die Test Objekte geschrieben habe oder an meinen Klassen.
//hatte die in der main ausprobiert, aber das klappt nicht, also habe deswegen noch keine richtigen Tests geschrieben
//brauchen wir auch noch Exceptions? weil wenn wir das anders vergleichen also nen Filter haben der nicht zum Typ der Liste passt ist das kacke




}
