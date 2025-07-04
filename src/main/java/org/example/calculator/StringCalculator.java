package org.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;

        String delimiter = "[,\n]"; // Default delimiter
        String numberSection = numbers;

        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n", 2); // Split String into two halves one for delimiter and one for numbers
            String delimiterSection = parts[0].substring(2); // Take out the custom delimiter section which is after "//"
            numberSection = parts[1]; // Actual number part

            // Step 7: Logic to pass test case having delimiter with any length

            if (delimiterSection.startsWith("[") && delimiterSection.endsWith("]")) {
                // Extract multi-character delimiter inside [ ]
                Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(delimiterSection);
                StringBuilder combinedDelimiters = new StringBuilder();

                while (matcher.find()) {
                    if (!combinedDelimiters. isEmpty()) {
                        combinedDelimiters.append("|");
                    }
                    combinedDelimiters.append(Pattern.quote(matcher.group(1)));
                }

                delimiter = combinedDelimiters.toString(); // e.g., \*\*\* or \*\*\*|\+\+
            } else {
                delimiter = Pattern.quote(delimiterSection); // For single-character delimiter
            }
        }

        String[] tokens = numberSection.split(delimiter);
        List<String> negatives = new ArrayList<String>();

        for (String token : tokens) {
            int num = Integer.parseInt(token);
            if(num < 0)
            {
                negatives.add(String.valueOf(num));
            }
            else if(num <= 1000) // Logic to ignore numbers greater than 1000
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
