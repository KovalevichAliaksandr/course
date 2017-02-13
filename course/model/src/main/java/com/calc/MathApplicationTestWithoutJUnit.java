package com.calc;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by alex on 12.2.17.
 */
public class MathApplicationTestWithoutJUnit {

    CalculatorService calculatorService;
    MathApplication mathApplication;
    public static void main(String[] args) {
        MathApplicationTestWithoutJUnit mathApplicationTestWithoutJUnit =new MathApplicationTestWithoutJUnit();
        mathApplicationTestWithoutJUnit.setUp();
        mathApplicationTestWithoutJUnit.testMath();
    }
    void setUp(){
        this.mathApplication=new MathApplication();
        this.calculatorService=mock(CalculatorService.class);
        mathApplication.setCalculatorService(calculatorService);
    }
    public  void testMath() {
        when(calculatorService.add(10d,15d)).thenReturn(25d);
        System.out.println(mathApplication.add(10,15)==25d);
    }
}
