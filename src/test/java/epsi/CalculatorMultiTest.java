package epsi;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for CalculatorService.
 */
public class CalculatorMultiTest {

    /**
     * Test adding two numbers.
     */
    @Test
    public void shouldMultiplyTwoNumbers()
    {
        assertEquals("2 * 7 should be 14", 14, new CalculatorMulti().add(2, 7));
    }
}
