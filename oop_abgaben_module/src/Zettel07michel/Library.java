package Zettel07michel;
import java.util.Date;

public class Library {
    public final String nameLibrary;
    public final Date dateLibrary;
    public final DVD[] dvdInLibrary;

    public Library(String nL, Date dL, DVD[] dvds) {
        nameLibrary = nL;
        dateLibrary = dL;
        dvdInLibrary = dvds;
    }

    public void addDVD(DVD dvd) {
        DVD[] newDvds = new DVD[dvdInLibrary.length + 1];
        for (int i = 0; i <= dvdInLibrary.length; i++) {
            dvdInLibrary[i] = newDvds[i];
        }
        newDvds[dvdInLibrary.length + 1] = dvd;
    }
    public void removeDVD(String title) {
        DVD[] newDvds = new DVD[dvdInLibrary.length - 1];
        for (int i = 0; i< dvdInLibrary.length; i++) {
            if (DVD.dvdTitle.equals(title)) { // Strings nicht mit == vergleichen, weil sie Klassen sind (nur Referenz wird verglichen)
                dvdInLibrary[i + 1] = newDvds[i];
            } else {
                dvdInLibrary[i] = newDvds[i];
            }
        }
    }
}



