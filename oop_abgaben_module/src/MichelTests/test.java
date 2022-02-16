package MichelTests;

public class test<T> {
    T[] array;


    test(T[] objekt) {
        array = objekt;
    }


    public static void main(String[] args) {
        Integer[] b = {1,2,3,4};
        test<Integer> a = new test<>(b);

        String[] c = {"hallo", "welt"};
        test<String> d= new test<>(c);
        System.out.println(a);
    }
}
