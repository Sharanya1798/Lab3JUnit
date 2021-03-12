import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestForAll {

    private static final double DELTA = 0.00000005;

    @Test
    public void squareRootPositive(){
        assertEquals("Positive Test Case: squareRoot, ", 5, Main.sqrtFunction(25), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", 0, Main.sqrtFunction(0), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", Double.NaN, Main.sqrtFunction(-5), DELTA);
    }

    @Test
    public void squareRootNegative(){
        assertNotEquals("Negative Test Case: squareRoot, ", 5, Main.sqrtFunction(89), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 25, Main.sqrtFunction(0), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 2.235, Main.sqrtFunction(-5), DELTA);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Positive Test Case: Factorial, ", 24, Main.factorialFunction(4), DELTA);
        assertEquals("Positive Test Case: Factorial, ", 6, Main.factorialFunction(3), DELTA);
        assertEquals("Positive Test Case: Factorial, ", Double.NaN, Main.factorialFunction(-10), DELTA);
    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Negative Test Case: Factorial,", 224, Main.factorialFunction(7), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 160, Main.factorialFunction(5), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 89, Main.factorialFunction(-25), DELTA);
    }

    @Test
    public void calPowPositive() {
        assertEquals("Positive Test Case: Power, ", 9, Main.powerFunction(3, 2), DELTA);
        assertEquals("Positive Test Case: Power,", 0.0625, Main.powerFunction(4, -2), DELTA);
        assertEquals("Positive Test Case: Power, ", Double.NaN, Main.powerFunction(0, 0), DELTA);
    }


    @Test
    public void calPowNegative() {
        assertNotEquals("Negative Test Case: Power, ", 25, Main.powerFunction(5, 5), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 126, Main.powerFunction(3, 5), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 8, Main.powerFunction(0, 0), DELTA);
    }

    @Test
    public void logPositive() {
        assertEquals("Positive Test Case: Log, ", 2.302585092994, Main.naturalLogFunction(10), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NEGATIVE_INFINITY, Main.naturalLogFunction(0), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NaN, Main.naturalLogFunction(-7), DELTA);
    }

    @Test
    public void logNegative(){
        assertNotEquals("Negative Test Case: Log, ", 3.567, Main.naturalLogFunction(4), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 5, Main.naturalLogFunction(45), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 6, Main.naturalLogFunction(-4), DELTA);
    }
}

