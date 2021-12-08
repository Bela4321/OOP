package Zettel07;

public class DVD {
    public final String TITLE;
    public final String ISBN;
    public final Director DIRECTOR;
    public final Actor[] ACTORS;

    DVD(String TITLE, String ISBN, Director DIRECTOR, Actor[] ACTORS) {
        this.TITLE=TITLE;
        this.ISBN=ISBN;
        this.DIRECTOR = DIRECTOR;
        this.ACTORS=ACTORS;
    }
}
