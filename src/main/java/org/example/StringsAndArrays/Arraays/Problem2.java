package org.example.StringsAndArrays.Arraays;

import java.util.HashMap;

public class Problem2 {

//Two sum

//    Problem Statement:
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input has exactly one solution, and you may not use the same element twice.

//1. Brute Force Approach (O(n²))
//    Use two loops to check every pair.
//    Time Complexity: O(n²)
//    Space Complexity: O(1)

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


//    2. HashMap Approach (O(n)) – Optimal
//    Use a HashMap to store numbers and their indices.
//    If target - nums[i] exists in the map, return indices.
//    Time Complexity: O(n)
//    Space Complexity: O(n)


    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
                //q) if it is return more pairs what is the code
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

}
