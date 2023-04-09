package com.devcamp.s20.restapi.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    // Task 1
    public String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    // Task 2
    public String palindromeString(String string) {
        String reverseString = new StringBuilder(string.toLowerCase()).reverse().toString();

        if (reverseString.equals(string.toLowerCase())) {
            return "This IS a palindrome string";
        }
        return "This is NOT a palindrome string";
    }

    // Task 3
    public String uniqueCharsString(String string) {
        String newString = new String();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);

            if (newString.indexOf(character) < 0) {
                newString += character;
            }
        }

        return newString;
    }

    // Task 4
    public String concatenateStrings(String string1, String string2) {
        int lengthString1 = string1.length();
        int lengthString2 = string2.length();
        int lengthDifference = 0;

        if (lengthString1 > lengthString2) {
            lengthDifference = lengthString1 - lengthString2;
            string1 = string1.substring(lengthDifference, lengthString1);
            return string1.concat(string2);
        } else if (lengthString2 > lengthString1) {
            lengthDifference = lengthString2 - lengthString1;
            string2 = string2.substring(lengthDifference, lengthString2);
            return string2.concat(string1);
        }
        return string1.concat(string2);
    }

}
