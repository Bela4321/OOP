package Zettel08;

public interface Numbers {
    int toIntValue();
    void fromIntValue(int value);

    default void add(Numbers numbers) {
        this.fromIntValue(this.toIntValue()+ numbers.toIntValue());
    }
    default void substract(Numbers numbers) {
        this.fromIntValue(this.toIntValue()- numbers.toIntValue());
    }
    default void multiply(Numbers numbers) {
        this.fromIntValue(this.toIntValue()* numbers.toIntValue());
    }
    default void divide(Numbers numbers) {
        this.fromIntValue(this.toIntValue()/ numbers.toIntValue());
    }
}