package org.example.Strings;

import java.util.HashMap;

public class WindowString {

//    Given a string A and a string B, find the window with minimum length in A, which will contain all the characters in B in linear time complexity.
//    Note that when the count of a character c in B is x, then the count of c in the minimum window in A should be at least x.
//

    public static String findMinimumWindow(String A, String B) {
        // Edge case
        if (A == null || B == null || A.length() < B.length()) {
            return "";
        }

        // Count the frequency of characters in B
        HashMap<Character, Integer> targetFreq = new HashMap<>();
        for (char c : B.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, minLength = Integer.MAX_VALUE;
        int matchCount = 0;
        int startIndex = 0; // To keep track of the start index of the minimum window
        HashMap<Character, Integer> windowFreq = new HashMap<>();

        while (right < A.length()) {
            // Expand the window by adding the current character
            char rightChar = A.charAt(right);
            windowFreq.put(rightChar, windowFreq.getOrDefault(rightChar, 0) + 1);

            // Check if the current character satisfies the requirement of B
            if (targetFreq.containsKey(rightChar)
                    && windowFreq.get(rightChar).intValue() <= targetFreq.get(rightChar).intValue()) {
                matchCount++;
            }

            // Shrink the window from the left if all characters of B are matched
            while (matchCount == B.length()) {
                // Update the minimum length window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }

                char leftChar = A.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);

                // Check if removing this character breaks the match condition
                if (targetFreq.containsKey(leftChar)
                        && windowFreq.get(leftChar).intValue() < targetFreq.get(leftChar).intValue()) {
                    matchCount--;
                }

                left++; // Shrink the window
            }

            right++; // Expand the window
        }

        // Return the minimum window or empty string if no valid window is found
        return minLength == Integer.MAX_VALUE ? "" : A.substring(startIndex, startIndex + minLength);
    }

    public static void main(String[] args) {
        String A = "ADOBECODEBANC";
        String B = "ABC";

        String result = findMinimumWindow(A, B);
        System.out.println("Minimum window containing all characters: " + result);
    }
}
