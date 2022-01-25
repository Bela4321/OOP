package Zettel10_Michel;

public class StateAlreadyExists extends Exception{
    public StateAlreadyExists(String message) {
        message = "The state already exists";
        System.out.println(message);
    }
}




