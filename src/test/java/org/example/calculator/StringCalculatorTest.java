package org.example.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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

    // Step 1.2: Test case passed for two numbers
    @Test
    public void returnSumWhenInputIsTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2");
        assertEquals(3, result);
    }

    // Step 2: Test case passed for the input having unknown amount of numbers
    @Test
    public void returnSumWhenInputIsManyNumbersTestOne(){
        StringCalculator calculator = new StringCalculator();
        int resultForThreeNumbers = calculator.add("1,2,3");
        assertEquals(6, resultForThreeNumbers);
    }

    @Test
    public void returnSumWhenInputIsManyNumbersTestTwo(){
        StringCalculator calculator = new StringCalculator();
        int resultForFourNumbers = calculator.add("6,11,3,4");
        assertEquals(24, resultForFourNumbers);
    }

    // Step 3: Test case passed for input separated by comma nad newline
    @Test
    public void returnSumWhenInputIsSeparatedByCommaAndNewLine() {
        StringCalculator calculator = new StringCalculator();
        int resultForFourNumbers = calculator.add("1\n2,3");
        assertEquals(6, resultForFourNumbers);
    }

    // Step 4: Test case passed for custom delimiter
    @Test
    public void returnSumWhenCustomDelimiterIsUsed() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//;\n1;2");
        assertEquals(3, result);
    }

    // Step 5: Test case passed for the input having negative numbers
    @Test
    public void throwExceptionWhenNegativeNumbersIsUsed() {
        StringCalculator calculator = new StringCalculator();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.add("1,-2,3,-4");
        });

        assertEquals("negatives not allowed -2,-4", exception.getMessage());
    }

    // Step 6: Test case passed for input having numbers greater than 1000
    @Test
    public void ignoreWhenGreaterThan1000TestOne() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("2,1001");
        assertEquals(2, result);
    }

    // Just considering the Edge case of equals 1000
    @Test
    public void shouldIgnoreNumbersGreaterThan1000TestTwo() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("2,1000");
        assertEquals(1002, result);
    }

    // Step 7: Test case passed for input having delimiter of any length
    @Test
    public void returnSumWhenDelimiterIsOfAnyLengthTestOne() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//[***]\n1***2***3");
        assertEquals(6, result);
    }

    @Test
    public void returnSumWhenDelimiterIsOfAnyLengthTestTwo() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//[;;;]\n5;;;5;;;6");
        assertEquals(16, result);
    }

    // Step 8: Test passed for input having multiple custom delimiter
    @Test
    public void returnSumWhenMultipleCustomDelimiterIsUsed() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//[*][%]\n1*2%3");
        assertEquals(6, result);
    }

    // Step 9: Test case passed for the input having multiple custom delimiter having length more than one character
    @Test
    public void returnSumWhenMultipleCustomDelimiterIsUsedTemp() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//[**][%%%]\n1**2%%%3");
        assertEquals(6, result);
    }
}
