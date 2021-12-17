package Zettel07michel;
import java.util.Date;

public class Actor {
    public final String actorFirstName;
    public final String actorLastName;
    public final Date actorBirthDate;

    Actor(String aFN, String aLN, Date aBD) {
        actorFirstName = aFN;
        actorLastName = aLN;
        actorBirthDate = aBD;
    }

}
