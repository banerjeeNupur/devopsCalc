import calculator.Calculator;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double delta = 1e-15;
    Calculator c = new Calculator();

    @Test
    public void squareRootPositive() {
        assertEquals("Testing True Positive for squareRoot", 9.0, c.sqroot(81), delta);
        assertEquals("Testing for True Negative for squareRoot", Double.NaN, c.sqroot(-36), delta);
    }
    @Test
    public void squareRootNegative() {
        assertNotEquals("Testing False Negative for squareRoot", 6.0, c.sqroot(-36), delta);
        assertNotEquals("Testing for False Positives for squareRoot", Double.NaN, c.sqroot(100), delta);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Testing True Positive for factorial", 120.0, c.factorial(5), delta);
        assertEquals("Testing for True Negative for factorial", Double.NaN, c.factorial(-5), delta);

    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Testing False Negative for factorial", 6.0, c.factorial(-36), delta);
        assertNotEquals("Testing for False Positives for factorial", Double.NaN, c.factorial(36), delta);
    }

    @Test
    public void nlogPositive() {
        assertEquals("Testing True Positive for factorial", 0.0, c.nlog(1), delta);
        assertEquals("Testing for True Negative for factorial", Double.NaN, c.nlog(-36), delta);

    }

    @Test
    public void nlogNegative() {
        assertNotEquals("Testing False Negative for factorial", 10.0, c.nlog(100), delta);
        assertNotEquals("Testing for False Positives for factorial", Double.NaN, c.nlog(6), delta);
    }

    @Test
    public void powerPositive() {
        assertEquals("Testing True Positive for factorial", 25.0, c.power(5,2), delta);
        assertEquals("Testing for True Negative for factorial", -25.0, c.power(-25,1), delta);

    }

    @Test
    public void powerNegative() {
        assertNotEquals("Testing False Negative for factorial", 6.0, c.power(-24,1), delta);
        assertNotEquals("Testing for False Positives for factorial", Double.NaN, c.power(36,2), delta);
    }
}