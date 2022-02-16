package MichelTest;

public class ElemListe {
    private ListenElement anfang;
    private int groesse;

    public boolean containsElem(String elem) {
        boolean contains = false;
        ListenElement thisPos = anfang;
        while (thisPos != null && contains == false) {
            if (thisPos.getElem() == elem) {
                contains = true;
            }
            thisPos = thisPos.getNext();
        }
    return contains;
    }
}
