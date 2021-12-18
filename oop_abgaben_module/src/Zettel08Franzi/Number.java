package Zettel08Franzi;

public interface Number {
    int toIntValue();
    void fromIntValue(int value);

    default void add(Number number) {
        fromIntValue(toIntValue() + number.toIntValue());
    }

    default void subtract(Number number) {
        fromIntValue(toIntValue() - number.toIntValue());
    }

    default void multiply (Number number) {
        fromIntValue(toIntValue() * number.toIntValue());
    }

    default void divide (Number number) {
        fromIntValue(toIntValue() / number.toIntValue());
    }

}
