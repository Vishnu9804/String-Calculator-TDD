package org.example.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    // Step 1: Test case for empty string passed
    @Test
    public void returnZeroWhenInputIsEmpty() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }

    // Step 1.1: Test case for single number passed
    @Test
    public void returnNumberWhenInputIsSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1");
        assertEquals(1, result);
    }

    // Step 1.2: Failing test case for the input having two numbers
    @Test
    public void returnSumWhenInputIsTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2");
        assertEquals(3, result);
    }
}
