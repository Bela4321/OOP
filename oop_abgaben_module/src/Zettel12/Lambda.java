package Zettel12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda {
    public static <T> void removeIf(ArrayList<T> list, Predicate<T> filter) {
        list.removeIf(filter);
    }

    public static <T> void sortBy(ArrayList<T> list, Comparator<T> comparator) {
        list.sort(comparator);
    }

    public static <T> String listToString(ArrayList<T>list) {
        StringBuilder result = new StringBuilder();
        Consumer stringAdder= x -> result.append(x.toString()+"\n");
        list.forEach(stringAdder);

        return result.toString();
    }
}
