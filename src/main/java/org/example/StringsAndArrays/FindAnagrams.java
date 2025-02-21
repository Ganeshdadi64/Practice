package org.example.StringsAndArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {

    public static List<List<Integer>> groupAnagrams(String[] A) {
        // Map to group anagrams
        HashMap<String, List<Integer>> anagramGroups = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            // Sort the characters of the string to create the key
            char[] chars = A[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Add the original index (1-based) to the group
            anagramGroups.putIfAbsent(sorted, new ArrayList<>());
            anagramGroups.get(sorted).add(i + 1);
        }

        // Collect the groups into the result list
        return new ArrayList<>(anagramGroups.values());
    }
    public static void main(String[] args) {
        String[] A={"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(A);
        System.out.println(groupAnagrams(A));


    }
}
