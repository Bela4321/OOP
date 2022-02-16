package Zettel12Michel;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class IOStreams {

    public static Stream<String> words(String filePath) throws FileNotFoundException {
        BufferedReader read = new BufferedReader(new FileReader(filePath));
        Stream<String> str = read.lines();
        return str;
    }

    public static Map<String, Integer> countWords(Stream<String> words) {
        Map<String, Integer> counter = new HashMap<>();
        String[] wordArr = words.toArray(String[]::new);
        Supplier<Stream<String>> wordsSupplier = () -> Stream.of(wordArr);

        wordsSupplier.get().forEach(x -> counter.put(x, 0));
        wordsSupplier.get().forEach(x -> counter.put(x, counter.get(x)+1));
        return counter;
    }

    public static void writeCountedWords(Map<String, Integer> countedWords, String filepath) throws IOException {
        try {
         BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));

        } catch (Exception e) {
            return;
        }
    }
}
