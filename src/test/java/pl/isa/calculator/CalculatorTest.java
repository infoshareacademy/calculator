package pl.isa.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator sut = new Calculator();

    @Test
    void shouldSummarizeTwoInts() {
        assertEquals(2, sut.add(1, 1));
    }

    @Test
    void shouldSubtractTwoInts() {
        assertEquals(3, sut.sub(8, 5));
    }

    @Test
    void shouldMultiplyTwoInts() {
        assertEquals(12, sut.mul(3, 4));
    }

    @Test
    void shouldDivideTwoInts() {
        assertEquals(3.0D, sut.div(9, 3), 0.01D);
    }
}