package org.example.calculator;

public class StringCalculator {

    // Step 1.1: Minimal logic to pass Single number test case
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        // Step 3: Logic to pass test case separated by comma and newline
        String[] parts = numbers.split("[,\n]");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        // return statement
        return sum;
    }
}
