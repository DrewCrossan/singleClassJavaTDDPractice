import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator(3, 6, 3, 6);
    }

    @Test
    public void addFirstAndSecondNumber(){
        assertEquals(9, calculator.addFirstAndSecondNumber());
    }

    @Test
    public void subtractFirstAndSecondNumber(){
        assertEquals(-3, calculator.subtractFirstAndSecondNumber());
    }

    @Test
    public void multiplyFirstAndSecondNumber(){
        assertEquals(18, calculator.multiplyFirstAndSecondNumber());
    }

    @Test
    public void divideFirstAndSecondNumber(){
        assertEquals(0.5, calculator.divideFirstAndSecondNumber(), 0.1);
    }
}
