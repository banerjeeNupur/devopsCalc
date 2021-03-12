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
        assertEquals("Testing True Positive for squareRoot", 5.0, c.sqroot(25), delta);
        assertEquals("Testing for True Negative for squareRoot", Double.NaN, c.sqroot(-25), delta);
    }
    @Test
    public void squareRootNegative() {
        assertNotEquals("Testing False Negative for squareRoot", 6.0, c.sqroot(-24), delta);
        assertNotEquals("Testing for False Positives for squareRoot", Double.NaN, c.sqroot(36), delta);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Testing True Positive for factorial", 24.0, c.factorial(4), delta);
        assertEquals("Testing for True Negative for factorial", Double.NaN, c.factorial(-25), delta);

    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Testing False Negative for factorial", 6.0, c.factorial(-24), delta);
        assertNotEquals("Testing for False Positives for factorial", Double.NaN, c.factorial(36), delta);
    }
}