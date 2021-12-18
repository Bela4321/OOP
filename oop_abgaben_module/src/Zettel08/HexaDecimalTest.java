package Zettel08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexaDecimalTest {

    @Test
    void toIntValue() {
        HexaDecimal num1 = new HexaDecimal("AF21");
        HexaDecimal num2 = new HexaDecimal("5B2");
        assertEquals(44833,num1.toIntValue());
        assertEquals(1458, num2.toIntValue());
    }

    @Test
    void fromIntValue() {
        HexaDecimal num1 = new HexaDecimal("AF21");
        HexaDecimal num2 = new HexaDecimal("5B2");
        num1.fromIntValue(100);
        num2.fromIntValue(64);
        assertEquals("64",num1.toString());
        assertEquals("40", num2.toString());
    }

    @Test
    void add() {
        HexaDecimal num1 = new HexaDecimal("AF21");
        HexaDecimal num2 = new HexaDecimal("5B2");
        HexaDecimal num3 = new HexaDecimal("AA");
        num1.add(num2);
        num2.add(num3);
        assertEquals(46291,num1.toIntValue());
        assertEquals(1628,num2.toIntValue());
    }

    @Test
    void substract() {
        HexaDecimal num1 = new HexaDecimal("9F21");
        HexaDecimal num2 = new HexaDecimal("6BC");
        HexaDecimal num3 = new HexaDecimal("AC");
        num1.substract(num2);
        num2.substract(num3);
    }

    @Test
    void multiply() {
        HexaDecimal num1 = new HexaDecimal("2FA5");
        HexaDecimal num2 = new HexaDecimal("AB3");
        HexaDecimal num3 = new HexaDecimal("12");
        num1.multiply(num2);
        num2.multiply(num3);
        assertEquals(33407583, num1.toIntValue());
        assertEquals(49302, num2.toIntValue());
    }

    @Test
    void divide() {
        HexaDecimal num12 = new HexaDecimal("2FA4");
        HexaDecimal num11 = new HexaDecimal("2FA4");
        HexaDecimal num2 = new HexaDecimal("4");
        HexaDecimal num3 = new HexaDecimal("BE9");
        num11.divide(num2);
        num12.divide(num3);
        assertEquals(3049, num11.toIntValue());
        assertEquals(4,num12.toIntValue());
    }
}