package Zettel10_Michel;

public class StateDoesNotExist extends Exception{
    public StateDoesNotExist(String message) {
        message = "The state already exists";
        System.out.println(message);
    }
}
