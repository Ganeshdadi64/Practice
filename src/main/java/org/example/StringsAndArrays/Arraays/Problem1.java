package org.example.StringsAndArrays.Arraays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1 {

//    Given an array nums of length n where nums[i] is in the range [1, n], some numbers may
//    appear multiple times while others are missing.
//    Return an array of all the numbers that are missing from nums.

    // int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
    //        System.out.println(findDisappearedNumbers(nums)); // Output: [5, 6]


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> allNumbers = new HashSet<>();
        Set<Integer> presentNumbers = new HashSet<>();

        // Fill the set with numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            allNumbers.add(i);
        }

        // Add all numbers from nums array to presentNumbers set
        for (int num : nums) {
            presentNumbers.add(num);
        }

        // Find missing numbers (allNumbers - presentNumbers)
        allNumbers.removeAll(presentNumbers);

        // Convert set to list
        return new ArrayList<>(allNumbers);
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums)); // Output: [5, 6]
    }
}
