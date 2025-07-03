package org.example.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    // Step 1: Add failing test case for empty string input first
    @Test
    public void returnZeroWhenInputIsEmpty() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }
}
