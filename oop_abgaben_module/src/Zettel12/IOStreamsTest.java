package Zettel12;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class IOStreamsTest {
    //compare the two text files, needs to execute IOStreams.main() first

    @Test
    void filecompartor() throws FileNotFoundException {
        BufferedReader expectedReader = new BufferedReader(new FileReader("C:\\Users\\belas\\IdeaProjects\\OOP\\oop_abgaben_module\\src\\Zettel12\\countedWords.txt"));
        BufferedReader resultReader = new BufferedReader(new FileReader("C:\\Users\\belas\\IdeaProjects\\OOP\\oop_abgaben_module\\src\\Zettel12\\counted.txt"));

        Set<String> expectedLines = expectedReader.lines().collect(Collectors.toSet());
        Set<String> resultLines = resultReader.lines().collect(Collectors.toSet());

        assertEquals(expectedLines,resultLines);
    }

}