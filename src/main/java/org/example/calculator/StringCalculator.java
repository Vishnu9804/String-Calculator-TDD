package org.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;

        String delimiter = "[,\n]";
        String numberSection = numbers;

        if(numbers.startsWith("//"))
        {
            String[] parts = numbers.split("\n",2); // Split String into two halves one for delimiter and one for numbers
            String customDelimiter = parts[0].substring(2); // Take out the custom delimiter which is after "\\"
            delimiter = Pattern.quote(customDelimiter); // Escape special characters to treat them as normal character in regex
            numberSection = parts[1];   // Actual number part
        }

        String[] tokens = numberSection.split(delimiter);
        List<String> negatives = new ArrayList<String>();

        for (String token : tokens) {
            int num = Integer.parseInt(token);
            if(num < 0)
            {
                negatives.add(String.valueOf(num));
            }
            else if(num <= 1000) // Step 6: Logic to ignore numbers greater than 1000
            {
                sum += num;
            }
        }

        // Add every negative into throw message
        if(!negatives.isEmpty())
        {
            throw new IllegalArgumentException("negatives not allowed "+ String.join(",", negatives));
        }

        // return statement
        return sum;
    }
}
