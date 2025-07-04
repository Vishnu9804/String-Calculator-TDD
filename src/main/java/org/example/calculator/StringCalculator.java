package org.example.calculator;

public class StringCalculator {

    // Step 1.1: Minimal logic to pass Single number test case
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        //step 2: Logic to pass test case having unknown amount of numbers
        if (numbers.contains(",")) {
            String[] parts = numbers.split(",");
            int sum = 0;
            // Handle unknown amount of numbers
            for(String part : parts) {
                sum += Integer.parseInt(part);
            }
            // return statement for many numbers
            return sum;
        }
        // return statement for single number
        return Integer.parseInt(numbers);
    }
}
