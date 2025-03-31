package org.example.Subsets;

import java.util.ArrayList;
import java.util.List;
//generate all subarrays
public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        List<List<Integer>> ans = new ArrayList<>();

        // Generate all possible subarrays
        for (int i = 0; i < arr.length; i++) {  // Start index
            List<Integer> tempList = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {  // End index
                tempList.add(arr[j]);  // Add elements from i to j
                ans.add(new ArrayList<>(tempList)); // Store a copy of the list
            }
        }

        // Print all subarrays
        for (List<Integer> subarray : ans) {
            System.out.println(subarray);
        }
    }
}


//i (Start)	j   tempList (Current Subarray)	ans (Stored Subarrays)
//        0	0	[1]	                                  [[1]]
//        0	1	[1, 2]	                              [[1], [1, 2]]
//        0	2	[1, 2, 3]	                          [[1], [1, 2], [1, 2, 3]]
//        1	1	[2]	                                  [[1], [1, 2], [1, 2, 3], [2]]
//        1	2	[2, 3]	                              [[1], [1, 2], [1, 2, 3], [2], [2, 3]]
//        2	2	[3]	                                  [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
