package Zettel12Franzi;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class IOStreams {
    public static Stream <String> words (String filePath) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        Stream <String> wordStream = bufferedReader.lines();
        return wordStream;
    }

    public static Map<String, Integer> countWords(Stream<String> words){
        Map<String, Integer> wordCount = new HashMap<>();
        words.map(x -> x.split(" ")).flatMap(x -> Arrays.stream(x)).forEach(x -> { if(wordCount.containsKey(x) == true){
                                wordCount.put(x, wordCount.get(x) + 1);
                            } else { wordCount.put(x, 1);
                            }
                            });
        return wordCount;

    }
    public static void writeCountedWords(Map<String, Integer> countedWords, String filepath) throws FileNotFoundException {
        PrintWriter result = new PrintWriter(filepath);
        countedWords.forEach((str,in) -> result.println(String.format("%s : %d",str,in)));
        result.close();
    }





    public static void main(String[] args) throws FileNotFoundException {
        Stream<String> wordsStream = words("oop_abgaben_module\\src\\Zettel12Franzi\\test.txt");
        Map<String, Integer> countWords = countWords(wordsStream);
        System.out.println( countWords.entrySet());

    }
}


