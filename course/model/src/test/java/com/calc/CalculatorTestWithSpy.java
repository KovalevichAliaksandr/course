package com.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;

import static org.mockito.Mockito.spy;

/**
 * Created by alex on 12.2.17.
 */
public class CalculatorTestWithSpy {
//    @Spy
     Calculator calculator;

    @InjectMocks
     MathApplication mathApplication=new MathApplication();


     CalculatorService calculatorService;

    @Before
    public void setUp(){
        this.calculator=new Calculator();
        calculatorService=spy(calculator);
        mathApplication.setCalculatorService(calculatorService);
    }

    @Test
    public void addShouldReturnTrue(){
        Assert.assertEquals(mathApplication.add(10,15),25,0);
    }
}
