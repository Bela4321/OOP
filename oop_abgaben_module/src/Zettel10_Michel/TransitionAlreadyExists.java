package Zettel10_Michel;

public class TransitionAlreadyExists extends Exception {
    public void TransitionAlreadyExists (String message) {
        message = "This transaction already exists";
        System.out.println(message);
    }
}
