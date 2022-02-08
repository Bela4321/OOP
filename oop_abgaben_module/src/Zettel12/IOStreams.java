package Zettel12;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class IOStreams {
    public static Stream<String> words(String filePath) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        Stream<String> result = bufferedReader.lines().map(x -> x.replace(",","")).map(x -> x.split(" ")).flatMap(x -> Arrays.stream(x));
        return result;
    }

    public static Map<String, Integer> countWords(Stream<String> words) {
        Map<String,Integer> result = new HashMap<>();
        String[] wordsArray = words.toArray(String[]::new);
        Supplier<Stream<String>> wordsSupplier = () -> Stream.of(wordsArray);

        wordsSupplier.get().forEach(x -> result.put(x, 0));
        wordsSupplier.get().forEach(x -> result.put(x,result.get(x)+1));
        return result;
    }

    public static void writeCountedWords(Map<String, Integer> countedWords, String filepath) throws FileNotFoundException {
        PrintWriter result = new PrintWriter(filepath);
        countedWords.forEach((str,in) -> result.println(String.format("%s : %d",str,in)));
        result.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        Stream<String> wordsStream = words("C:\\Users\\belas\\IdeaProjects\\OOP\\oop_abgaben_module\\src\\Zettel12\\theRaven.txt");
        Map<String, Integer> countWordsMap = countWords(wordsStream);
        writeCountedWords(countWordsMap, "C:\\Users\\belas\\IdeaProjects\\OOP\\oop_abgaben_module\\src\\Zettel12\\counted.txt");
    }
}
