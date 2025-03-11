package org.example.StringsAndArrays.Arraays;

import java.util.Arrays;

public class RotateArrayByKelements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr)); // Output: [5, 6, 7, 1, 2, 3, 4]
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        reverse(arr, 0, n - 1);  // Step 1: Reverse whole array
        reverse(arr, 0, k - 1);  // Step 2: Reverse first k elements
        reverse(arr, k, n - 1);  // Step 3: Reverse remaining elements
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
