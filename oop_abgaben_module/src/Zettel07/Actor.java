package Zettel07;

import java.util.Date;

public class Actor {
    public final String NAME;
    public final String SURNAME;
    public final Date BIRTHDATE;

    Actor(String NAME, String SURNAME, Date BIRTHDATE) {
        this.NAME= NAME;
        this.SURNAME= SURNAME;
        this.BIRTHDATE= BIRTHDATE;
    }
}
