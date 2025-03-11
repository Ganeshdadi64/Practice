package org.example.StringsAndArrays.Arraays;

import java.util.Arrays;

public class FindMedian {

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4}; // Example array

        double median = findMedian(arr);
        System.out.println("Median: " + median);
    }

    public static double findMedian(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort the array
        int n = arr.length;

        // Step 2: Find the median
        if (n % 2 == 1) {
            return arr[n / 2]; // Odd length → middle element
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0; // Even length → average of two middle elements
        }
    }
}
