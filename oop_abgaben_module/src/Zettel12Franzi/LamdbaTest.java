/*package Zettel12Franzi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class LamdbaTest {

    ArrayList <Integer> list1 = new ArrayList<>(List.of(1, 33, 22, 57, 5, 8, 13, 68, 45, 10 ));
        ArrayList <String> list2 = new ArrayList<>(List.of("Hi", "Wie", "Geht", "es", "euch", "so", "das ist ein" , "cooler", "test", "yeaahh" ));
        ArrayList <Objects> list3 = new ArrayList(List.of(1, "Hi", 'c', 57, "gut", 8, "und", 'd', "so", 10 ));
        Predicate <Integer> filter1 = a-> (a % 2 == 0);
        Predicate <String> filter2 = b -> (b == "Hi");
        Predicate <Objects> filter3 = b -> (b.equals("Hi"));
        Comparator <Integer> comparator1 = (c,d) -> Integer.valueOf(c) - Integer.valueOf(d);
        Comparator <String> comparator2 = (e, f) -> e.length();
        Comparator <Objects> comparator3 = (g,h) -> g.hashCode();
        removeIf(list1,filter1);
        removeIf(list2,filter2);
        removeIf(list3, filter3);
        sortBy(list1,comparator1);
        sortBy(list2, comparator2);
        sortBy(list3, comparator3);
        listToString(list1);
        listToString(list2);
        listToString(list3);


//weiß nicht wie diese Comparator funktionieren und es hat irgendwie nicht wirklich funktioniert, weiß nicht genau ob das daran liegt
// wie ich die Test Objekte geschrieben habe oder an meinen Klassen.
//hatte die in der main ausprobiert, aber das klappt nicht, also habe deswegen noch keine richtigen Tests geschrieben
//brauchen wir auch noch Exceptions? weil wenn wir das anders vergleichen also nen Filter haben der nicht zum Typ der Liste passt ist das kacke




}

 */