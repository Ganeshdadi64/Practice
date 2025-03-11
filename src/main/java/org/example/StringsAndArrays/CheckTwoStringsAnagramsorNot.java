package org.example.StringsAndArrays;

import java.util.Arrays;

public class CheckTwoStringsAnagramsorNot {
    public static boolean areAnagrams(String str1, String str2) {
        // Step 1: Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 2: Convert strings to char arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 3: Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
        }
    }
}
