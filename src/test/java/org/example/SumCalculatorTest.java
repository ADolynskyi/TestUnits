package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calc;
    @BeforeEach
    public void beforeEach(){
        calc=new SumCalculator();
    }
    @Test
    public void ThatSum1Return1Test(){
        int existingValue = calc.sum(1);
        int expectedValue =1;
        Assertions.assertEquals(existingValue,expectedValue);
    }
    @Test
    public void ThatSum6Return6Test(){
        Assertions.assertEquals(6,calc.sum(3));
    }
    @Test
    public void ThatSum0ReturnExceptionTest(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> calc.sum(0));
    }

}