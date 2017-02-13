package com.calc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

/**
 * Created by alex on 12.2.17.
 */
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTestWithJUitTest {
    @InjectMocks
    MathApplication mathApplication=new MathApplication();

    @Mock
    CalculatorService calculatorService;

    @Test
    public void testAdd(){
        when(calculatorService.add(10d,15d)).thenReturn(25d);
        Assert.assertEquals(mathApplication.add(10d,15d),25d,0);
        verify(calculatorService).add(10d,15d);
        verify(calculatorService,times(1)).add(10d,15d);
    }
    @Test(expected = RuntimeException.class)
    public void testAddException(){
//        doThrow(new RuntimeException("Not implement method add")).when(calculatorService.add(3,7));
        when(calculatorService.add(3,7)).thenThrow(new RuntimeException());
        verify(calculatorService,times(0)).add(3,7);
        Assert.assertEquals(mathApplication.add(3,7),12,2);
        }


}
