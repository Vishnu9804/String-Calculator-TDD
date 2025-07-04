package org.example.calculator;

public class StringCalculator {

    // Step 1.1: Minimal logic to pass Single number test case
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        // return statement
        return Integer.parseInt(numbers);
    }
}
