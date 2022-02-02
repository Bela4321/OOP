package Zettel08Franzi;

public interface Numbers {
    int toIntValue();
    void fromIntValue(int value);

    default void add(Numbers numbers) {
        fromIntValue(toIntValue() + numbers.toIntValue());
    }

    default void subtract(Numbers numbers) {
        fromIntValue(toIntValue() - numbers.toIntValue());
    }

    default void multiply (Numbers numbers) {
        fromIntValue(toIntValue() * numbers.toIntValue());
    }

    default void divide (Numbers numbers) {
        fromIntValue(toIntValue() / numbers.toIntValue());
    }

}
