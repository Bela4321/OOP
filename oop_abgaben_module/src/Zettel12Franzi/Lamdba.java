package Zettel12Franzi;

import Zettel12.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lamdba {
    public static <T> void removeIf(ArrayList<T> list, Predicate<T> filter){
        list.removeIf(filter); //warum kann ich hier das remove if verwenden, geht das weil das eine bereits gegebene Funktion ist?
        //Predicate<T> filtered = n -> ; //geht nicht weil ich nicht Predicate entwerfe sondern schon einen Filter angegeben habe?
    }

    public static <T> void sortBy(ArrayList<T> list, Comparator <T> comparator){
        list.sort(comparator);
    }
    public static <T> String listToString(ArrayList<T> list){
        StringBuilder result = new StringBuilder();
        Consumer <T> strings = x -> result.append(x.toString() + "\n");
        list.forEach(strings);
        return result.toString();

    }

    public static void main(String[] args) {
        ArrayList<Objects> list3 = new ArrayList(List.of(1, "Hi", 'c', 57, "gut", 8, "und", 'd', "so", 10));
        listToString(list3);
        System.out.println(list3);
    }


}

