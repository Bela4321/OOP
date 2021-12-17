package Präsenzzettel;

public interface Fighter {
    /**
     *
     * @param hours
     */
    void train(int hours);

    /**
     *
     * @return
     */
    int getPowerLevel();

    /**
     *
     * @param hours
     * @param gForce
     */

    default void gravityTrain(int hours, int gForce){
        train(hours*gForce);
    }
}
