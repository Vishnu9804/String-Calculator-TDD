package org.example.calculator;

public class StringCalculator {

    // Step 1.1: Minimal logic to pass Single number test case
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        //step 1.2: Logic to pass test case having two numbers
        if (numbers.contains(",")) {
            String[] parts = numbers.split(",");
            // Handle only 2 numbers
            return Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
        }
        // return statement
        return Integer.parseInt(numbers);
    }
}
