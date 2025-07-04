package org.example.calculator;

import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;

        String delimiter = "[,\n]";
        String numberSection = numbers;

        // Step 6: Logic to pass custom delimiter input
        if(numbers.startsWith("//"))
        {
            String[] parts = numbers.split("\n",2); // Split String into two halves one for delimiter and one for numbers
            String customDelimiter = parts[0].substring(2); // Take out the custom delimiter which is after "\\"
            delimiter = Pattern.quote(customDelimiter); // Escape special characters to treat them as normal character in regex
            numberSection = parts[1];   // Actual number part
        }

        String[] tokens = numberSection.split(delimiter);

        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        // return statement
        return sum;
    }
}
