package org.example.Strings;

import java.util.HashMap;

public class LongestSubStringWithoutRepeating {

    public static void main(String[] args) {
//        Use a HashMap to store characters and their most recent indices.
//        Maintain a sliding window using two pointers (start and end).
//        Expand the end pointer and check:
//        If a character repeats, move the start pointer to the right of the previous occurrence.
//        Keep track of the maximum window size.


        String s="abcabcbb";
        // HashMap to store character and its index
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0; // Result to store max length
        int start = 0;     // Sliding window start pointer

        // Iterate through the string
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If character is already seen, move the start pointer
            if (map.containsKey(currentChar)) {
                start = Math.max(map.get(currentChar) + 1, start);
            }

            // Update the character's index in the map
            map.put(currentChar, end);

            // Calculate max length
            maxLength = Math.max(maxLength, end - start + 1);
        }
        System.out.println(maxLength);





    }
}
