import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
   private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(9, calculator.addNumbers(4, 5));
    }

    @Test
    public void canSubtract(){
        assertEquals(11, calculator.subtractNumbers(17, 6));
    }

    @Test
    public void canMultiply(){
        assertEquals(30, calculator.multiplyNumbers(6,5));
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.divideNumbers(30,15), 0.1);
    }
}
