package org.example.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ChangeCharacter {
    public static void main(String[] args) {
//        You are given a string A of size N consisting of lowercase alphabets.
//                You can change at most B characters in the given string to any other lowercase
//                alphabet such that the number of distinct characters in the string is minimized.
//                Find the minimum number of distinct characters in the resulting string.

        String A="aaabbbcc";
        int n = A.length();
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int B=2;
        int count=0;
        //here a=3 times and b=3,c=2 and the distint characters size=3 ekkada B=2 kabatti 2 time any character nee change chesi distinct count nee reduce cheyyavachhu
        //step1 find the all frequencies for chars
        for (int i = 0; i < n; i++) {
            char c = A.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        // Step 2: Store frequencies in a list and sort in ascending order
        List<Integer> frequencies = new ArrayList<>(freqMap.values());
        Collections.sort(frequencies);
        // assume frequencies=[1,2,2,2]  from this distinctcount=4 and B=2 i ahve 2 chances for decrease the distintcount
        //if i remove 1 the new distinctcount is 3 and B=1 and do dry run .
        int distinctCount = frequencies.size(); // Initial distinct characters
        for (int freq : frequencies) {
            if (B >= freq) {
                B -= freq; // Use changes to "remove" this character
                distinctCount--; // Reduce the distinct count
            } else {
                break; // No more changes can be made
            }
        }








    }
}
