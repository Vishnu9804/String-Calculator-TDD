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

            // Step 8: Logic to pass test case having multiple custom delimiter
            if (delimiterSection.startsWith("[") && delimiterSection.endsWith("]")) {
                Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(delimiterSection);
                List<String> delimitersFound = new ArrayList<>();

                while (matcher.find()) {
                    delimitersFound.add(matcher.group(1));
                }

                if (delimitersFound.size() == 1) {
                    // Single delimiter → can be multi-char
                    delimiter = Pattern.quote(delimitersFound.get(0));
                } else if (delimitersFound.size() > 1) {
                    boolean allSingleChar = delimitersFound.stream().allMatch(d -> d.length() == 1);

                    if (allSingleChar) {
                        // All single-char delimiters allowed
                        StringBuilder regexBuilder = new StringBuilder();
                        for (int i = 0; i < delimitersFound.size(); i++) {
                            if (i > 0) {
                                regexBuilder.append("|");
                            }
                            regexBuilder.append(Pattern.quote(delimitersFound.get(i)));
                        }
                        delimiter = regexBuilder.toString();
                    } else {
                        // At least one is multi-character → Do NOT override default delimiter
                        // This will cause incorrect splitting, hence test will naturally fail
                        delimiter = "[,\n]";
                    }
                }
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
