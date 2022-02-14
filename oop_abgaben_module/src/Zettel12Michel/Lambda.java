package Zettel12Michel;

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

    public static <T> String listToString(ArrayList<T> list) {
        StringBuilder str = new StringBuilder();
        Consumer addingStr = x -> str.append(x.toString() + "\n");
        list.forEach(addingStr);
        return str.toString();
    }
}

// + JUnit Tests schreiben
