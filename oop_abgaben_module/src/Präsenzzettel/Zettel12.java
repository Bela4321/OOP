package Präsenzzettel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Zettel12 {
    public List<Integer> twentyone(List<Integer> list){
        Predicate <Integer> filter =  x-> (x%21  == 0);
        list.removeIf(filter);
        return list;
    }
    int count= 0;
    void count1() {
        count++;
    }

    public void thirdElement (List <Integer> list){
        list.forEach(x -> {
            int count = 0;
            if(count % 3 == 0) {
                list.add(x);
            }
            count1();
        });
    }

    void ArrString(List<Integer> list){
        Arrays.stream(list.stream().toArray()).map(Object::toString);
    }

    public static void main(String[] args) {

    }
}
