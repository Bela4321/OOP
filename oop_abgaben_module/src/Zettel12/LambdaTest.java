package Zettel12;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LambdaTest {

    @Test
    void removeIf() {
        ArrayList<String> testlist1 = new ArrayList<>(Arrays.asList("moin","servus", "Moin","this is a stream","yes?","!"));
        ArrayList<Integer> testlist2 = new ArrayList<>(Arrays.asList(-1,1,2135,-32,23,0,-12));
        Predicate<String> stringPredicate = x -> x.length() <= 4;
        Predicate<Integer> integerPredicate = x -> x<=0;

        List<String> expectedlist1 = Arrays.asList("servus","this is a stream");
        List<Integer> expectedlist2 = Arrays.asList(1,2135,23);

        Lambda.removeIf(testlist1,stringPredicate);
        Lambda.removeIf(testlist2, integerPredicate);

        assertEquals(expectedlist1,testlist1);
        assertEquals(expectedlist2,testlist2);
    }

    @Test
    void sortBy() {
        ArrayList<String> testlist1 = new ArrayList<>(Arrays.asList("moin","servus", "Moin","this is a stream","yes?","!"));
        ArrayList<Integer> testlist2 = new ArrayList<>(Arrays.asList(-1,1,2135,-32,23,0,-12));
        Comparator<String> stringComp = (x,y) -> (x.length()-y.length());
        Comparator<Integer> intComp = (x,y) -> Math.abs(y)%10 -Math.abs(x)%10;

        List<String> expectedstrlist = Arrays.asList("!","moin", "Moin","yes?","servus","this is a stream");
        List<Integer> expectedintlist = Arrays.asList(2135,23,-32,-12,-1,1,0);

        Lambda.sortBy(testlist1,stringComp);
        Lambda.sortBy(testlist2,intComp);

        assertEquals(expectedstrlist,testlist1);
        assertEquals(expectedintlist,testlist2);
    }

    @Test
    void listToString() {
        ArrayList<String> testlist1 = new ArrayList<>(Arrays.asList("moin","servus", "Moin","this is a stream","yes?","!"));
        ArrayList<Integer> testlist2 = new ArrayList<>(Arrays.asList(-1,1,2135,-32,23,0,-12));
        String expected1 = "moin\nservus\nMoin\nthis is a stream\nyes?\n!\n";
        String expected2 = "-1\n1\n2135\n-32\n23\n0\n-12\n";

        assertEquals(expected1,Lambda.listToString(testlist1));
        assertEquals(expected2, Lambda.listToString(testlist2));
    }
}