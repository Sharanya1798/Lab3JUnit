import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestForAll {

    private static final double DELTA = 0.00000005;

    @Test
    public void squareRootPositive(){
        assertEquals("Positive Test Case: squareRoot, ", 6, Main.sqrtFunction(36), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", 0, Main.sqrtFunction(0), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", Double.NaN, Main.sqrtFunction(-7), DELTA);
    }

    @Test
    public void squareRootNegative(){
        assertNotEquals("Negative Test Case: squareRoot, ", 4, Main.sqrtFunction(36), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 16, Main.sqrtFunction(0), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 3, Main.sqrtFunction(-7), DELTA);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Positive Test Case: Factorial, ", 120, Main.factorialFunction(5), DELTA);
        assertEquals("Positive Test Case: Factorial, ", 1, Main.factorialFunction(0), DELTA);
        assertEquals("Positive Test Case: Factorial, ", Double.NaN, Main.factorialFunction(-9), DELTA);
    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Negative Test Case: Factorial,", 223, Main.factorialFunction(5), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 130, Main.factorialFunction(7), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 89, Main.factorialFunction(-25), DELTA);
    }

    @Test
    public void calPowPositive() {
        assertEquals("Positive Test Case: Power, ", 8, Main.powerFunction(2, 3), DELTA);
        assertEquals("Positive Test Case: Power,", 0.0625, Main.powerFunction(4, -2), DELTA);
        assertEquals("Positive Test Case: Power, ", Double.NaN, Main.powerFunction(0, 0), DELTA);
    }


    @Test
    public void calPowNegative() {
        assertNotEquals("Negative Test Case: Power, ", 65, Main.powerFunction(5, 5), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 16, Main.powerFunction(3, 5), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 4, Main.powerFunction(0, 0), DELTA);
    }

    @Test
    public void logPositive() {
        assertEquals("Positive Test Case: Log, ", 2.302585092994, Main.naturalLogFunction(10), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NEGATIVE_INFINITY, Main.naturalLogFunction(0), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NaN, Main.naturalLogFunction(-5), DELTA);
    }

    @Test
    public void logNegative(){
        assertNotEquals("Negative Test Case: Log, ", 4.567, Main.naturalLogFunction(4), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 7, Main.naturalLogFunction(45), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 5, Main.naturalLogFunction(-4), DELTA);
    }
}

