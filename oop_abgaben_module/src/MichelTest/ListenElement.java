package MichelTest;

public class ListenElement {
    private String elem;
    private ListenElement next;

    public ListenElement(String elem){
        this.elem = elem;
    }

    public String getElem(){
        return elem;
    }

    public ListenElement getNext(){
        return next;
    }

    public void setNext(ListenElement next){
        this.next = next;
    }
}
