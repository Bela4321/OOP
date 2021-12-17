package Zettel07michel;

public class DVD {
    static String dvdTitle;
    static int isbnNr;
    static String regisseur;
    static String[] actors;

    public DVD(String dT, int isbn, String regi, String[] act) {
        dvdTitle = dT;
        isbnNr = isbn;
        regisseur = regi;
        actors = act;
    }
}
