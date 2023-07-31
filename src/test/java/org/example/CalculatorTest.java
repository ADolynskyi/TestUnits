package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new Calculator();
    }

    @Test
    public void ThatSum1Plus1Return2Test() {
        int existingValue = calc.sum(1, 1);
        int expectedValue = 2;
        Assertions.assertEquals(existingValue, expectedValue);
    }

    @Test
    public void ThatDif5Minus2Return3Test() {
        int existingValue = calc.dif(5, 2);
        int expectedValue = 3;
        Assertions.assertEquals(existingValue, expectedValue);
    }

    @Test
    public void ThatDiv3By2Return1and5Test() {
        double existingValue = calc.div(3, 2);
        double expectedValue = 1.5d;
        Assertions.assertEquals(existingValue, expectedValue);
    }

    @Test
    public void ThatDivByZeroThrowIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.div(2, 0));
    }

    @Test
    public void ThatMul5Times5Return25Test() {
        long existingValue = calc.mul(5, 5);
        long expectedValue = 25L;
        Assertions.assertEquals(existingValue, expectedValue);
    }


}