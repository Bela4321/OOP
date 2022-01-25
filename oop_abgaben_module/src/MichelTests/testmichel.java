package MichelTests;

public class testmichel {
    int countOccurences(String source, String search) { // mit while-Schleife lösen.
        int counter = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.indexOf(search, 0) != -1) {
                return counter;
            } else {
                return counter;
            }
        }
        System.out.println(counter);
        return counter;
    }
}

/*
für Tests einmal durchpsielen
unterer: Referenzen vs. Werte miteinander vergleichen -> in java Vokabeln aufnehmen
 */