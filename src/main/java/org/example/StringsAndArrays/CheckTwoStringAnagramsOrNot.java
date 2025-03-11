package org.example.StringsAndArrays;

import java.util.Arrays;

public class CheckTwoStringAnagramsOrNot {

    public static boolean check(String s1, String s2) {
        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        // Sort both char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1="tea";
        String str2="ate";
        boolean b=check(str1,str2);
    }
}
